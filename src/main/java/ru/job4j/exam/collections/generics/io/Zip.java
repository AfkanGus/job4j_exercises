package ru.job4j.exam.collections.generics.io;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * Техническое задание.
 *
 * 1. При запуске указывается папка, которую мы хотим архивировать, например: c:\project\job4j\
 * 2. В качестве ключа передаётся расширение файлов, которые не нужно включать в архив.
 * 3. Архив должен сохранять структуру проекта. То есть содержать подпапки.
 * 4. Запуск проекта.
 *
 *  -d=c:\project\job4j\ -e=.class -o=project.zip
 *
 * -d - directory - которую мы хотим архивировать.
 * -e - exclude - исключить файлы с расширением class.
 * -o - output - во что мы архивируем.
 *
 * 5. Для работы с входными аргументами используйте класс ArgsName из прошлого задания.
 *
 * Важно! Перед запуском проекта нужно делать валидацию аргументов, проверив что они все присутствуют. Также нужно проверить, что архивируемая директория существует.
 */
public class Zip {
    /**
     * packFiles - Этот метод последовательно обрабатывает каждый файл из списка sources, создает для него запись в ZIP-архиве,
     * считывает его содержимое и записывает в архив. В итоге все файлы из списка будут упакованы в ZIP-архив, указанный в target.
     *
     * @param sources список путей к файлу.
     * @param target  целевой файл, с именем и располажением архива.
     * @param -       putNextEntry() Начинает запись новой записи ZIP-файла и устаналиает поток в начало данных записи.
     *                Закрывает текущую запись, если она все еще активна.
     */
    public void packFiles(List<Path> sources, File target) {
        /*
        Создается новый  поток, который может использоваться для записи данных в ZIP-формате.
         Он обернут в BufferedOutputStream для повышения производительности и обернут
          в FileOutputStream, который указывает файл, в который будут записываться данные.
         */
        try (ZipOutputStream zip = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(target)))) {
            /*
             Цикл for-each выполняется для каждого элемента Path в списке sources.
              В данном случае, sources представляет собой список файлов, которые нужно упаковать.
             */
            for (Path p : sources) {
                /*
                 Создается новая запись ZipEntry с именем, соответствующим пути файла p.toString(). Эта запись будет добавлена в ZIP-архив.
                 p.toString() используется для получения имени файла или директории в виде строки,
                  которая будет использоваться для создания записи ZipEntry в ZIP-архиве.
                 */
                zip.putNextEntry(new ZipEntry(p.toString()));
                /*
                 Создается новый BufferedInputStream, который оборачивает FileInputStream для чтения содержимого файла p.toFile().
                 */
                try (BufferedInputStream out = new BufferedInputStream(new FileInputStream(p.toFile()))) {
                    /*
                     Содержимое файла считывается с помощью out.readAllBytes(), а затем записывается в zip,
                     используя метод write. Таким образом, содержимое файла добавляется в текущую запись в ZIP-архиве.
                     */
                    zip.write(out.readAllBytes());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Этот метод создает запись в ZIP-архиве для указанного исходного файла,
     * считывает его содержимое и записывает в архив. В итоге исходный файл будет
     * упакован в ZIP-архив, указанный в target.
     *
     * @param - args
     */
    public void packSingleFile(File source, File target) {
        try (ZipOutputStream zip = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(target)))) {
            zip.putNextEntry(new ZipEntry(source.getPath()));
            try (BufferedInputStream out = new BufferedInputStream(new FileInputStream(source))) {
                /*
                Метод readAllBytes() является удобным способом чтения всего содержимого в одну операцию.
                 Он будет читать данные из потока до конца файла и возвращать массив байтов с прочитанными данными.
После чтения содержимого файла, полученные байты передаются методу zip.write(),
 который записывает их в текущую запись в ZipOutputStream. Таким образом, содержимое файла добавляется в ZIP-архив.
                 */
                zip.write(out.readAllBytes());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * метод validateZip проверяет аргументы командной строки на количество и на определенные условия,
     * и, если какое-либо из условий не выполняется, выбрасывает исключение с соответствующим сообщением.
     * Это позволяет обеспечить корректность и полноту передаваемых аргументов перед дальнейшей обработкой.
     *
     * @param args -аргументы командной строки.
     */
    private static void validateZip(List<String> args) {
        if (args.size() != 3) {
            throw new IllegalArgumentException("Set all arguments");
        }
        /**
         * Проверяет, существует ли папка, указанная в первом аргументе командной строки.
         * Для этого используется метод Files.exists, который принимает в качестве аргумента
         * объект типа Path. Paths.get(args.get(0)) создает объект Path,
         * представляющий путь, указанный в первом аргументе.
         */
        if (!Files.exists(Paths.get(args.get(0)))) {
            throw new IllegalArgumentException(String.format("This folder '%s' does not exist", args.get(0)));
        }
        if (!Files.isDirectory(Paths.get(args.get(0)))) {
            throw new IllegalArgumentException(String.format("'%s' is not a valid directory", args.get(0)));
        }

        if (!args.get(1).startsWith(".")) {
            throw new IllegalArgumentException(String.format("This extension '%s' uncorrected", args.get(1)));
        }
    }

    public static void main(String[] args) throws IOException {
        Zip zipArchive = new Zip();
        Map<String, String> arguments = ArgsName.of(args).values;
        List<String> values = new ArrayList<>();
        for (Map.Entry<String, String> e : arguments.entrySet()) {
            values.add(e.getValue());
        }
        validateZip(values);
        List<Path> files = Search.search(Paths.get(values.get(0)),
                (e -> !e.toFile().getName().endsWith(values.get(1))));
        zipArchive.packFiles(files, Paths.get(values.get(2)).toFile());
    }
}
