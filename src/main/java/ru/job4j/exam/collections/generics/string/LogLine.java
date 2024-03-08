package ru.job4j.exam.collections.generics.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Парсинг HTTP лога
 * В этом задании необходимо реализовать парсинг HTTP лога.
 * <p>
 * Формат строки: уровень [поток] текст.
 * <p>
 * Например: WARNING [threads [zqfz [wbye [zfq]]] - 1] wqqa [e] zqw.
 */
public class LogLine {
    public record Line(String level, String threads, String text) {

    }

    public Line parse(String text) {
        /*метод ищет индекс первое вхождение пробела, и вернет его  или - 1, индекс укажет на конец уров логирования*/
        int levelEndIndexLog = text.indexOf(" ");
        /*метод извлечет первое слово из подстроки соответсвущий индексу 0, levelEndIndex- указывает до какого символа
        *  извелкать, тоесть до пробела " "*/
        String level = text.substring(0, levelEndIndexLog);

        /*для отображения количества открыващ и закрывающ скобок в строке, ключ и значение*/
        Map<Character, Integer> bracketsCount = new HashMap<>();
        /* будет добавлять символы из строки лога в строку*/
        StringBuilder threadsBuilder = new StringBuilder();
        /*найдем индекс первого вхождения  [  - это нужно для опеределения начала строки содерж инфу о потоках*/
        int threadsStartIndex = text.indexOf("[");
        threadsBuilder.append('[');
        /*Каждый раз, когда встречается символ [, значение, связанное с ключом [ увеличивается на 1.
        Следующий раз встречаем символ [.
         Теперь у нас уже есть запись для [, поэтому мы обновляем ее значение, увеличивая его на 1: [ -> 2*/
        bracketsCount.put('[', 1);

        /* начнем обход строки с позицию первого символа [ в строке.
        * *Добавляя 1, мы переходим к символу, следующему за [, и начинаем с
         него сканировать поток до тех пор, пока не найдем соответствующий закрывающий символ ]./
         */
        for (int i = threadsStartIndex + 1; i < text.length(); i++) {
            /*метод извелкает символ по ук i, чтоб понять является ли  символ -  [ или ]*/
            char currentChar = text.charAt(i);
            /*чтоб собрать текст потока, каждый символ который внутри [ ] добавляется к StringBuilder*/
            threadsBuilder.append(currentChar);
            if (currentChar == '[') {
                /*метод выполняет операцию слияния для заданного ключа и значения в HashMap.
                В данном случае, если ключ [ уже присутствует в bracketsCount,
                то выполняется операция сложения с текущим значением (1), которое затем заменяет
                старое значение. Если ключ [ отсутствует, он добавляется с значением 1.*/
                bracketsCount.merge('[', 1, Integer::sum);
            } else if (currentChar == ']') {
                /*']': ключ, с которым связывается значение.
                1: значение, которое нужно добавить к существующему или установить, если ключа еще нет.
Integer::sum: функция, которая определяет, как объединить существующее и новое
значения, если ключ уже присутствует в bracketsCount.
если ключ ']' уже существует в bracketsCount, его значение увеличится на 1.
Если ключа нет, он будет добавлен со значением 1.*/
                bracketsCount.merge(']', 1, Integer::sum);
            }
            /*проверку на равенство количества открывающихся [ и закрывающихся ] скобок в строке text.
            *  getOrDefault  Если в мапе нет соответствующего ключа, метод вернет значение по умолчанию,
            *  которое в данном случае равно 0.
            * . Если эти значения равны, то скобки парные, и выполнение цикла должно завершиться.*/
            if (bracketsCount.getOrDefault('[', 0).equals(bracketsCount.getOrDefault(']', 0))) {
                break;
            }
        }
/*преобразуем стрингбилдел куда были добавлены символы в процессе выполнения цикла, в строку*/
        String threads = threadsBuilder.toString();
        /*указывает на первый символ после потоков, которым в данном случае является символ 'w'. */
        int textStartIndex = threadsStartIndex + threads.length();
        /*извлекает подстроку, начиная с индекса textStartIndex до конца строки text
        * trim(), который удаляет начальные и конечные пробелы из извлеченной подстроки*/
        String logText = text.substring(textStartIndex).trim();

        return new Line(level, threads, logText);
    }
    }

