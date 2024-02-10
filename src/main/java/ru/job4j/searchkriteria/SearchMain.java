package ru.job4j.searchkriteria;
import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class SearchMain {
    private static Map<String, String> argsMap = new HashMap<>();
    private static List<Path> resultPaths = new ArrayList<>();

    private void searchFile() throws IOException {
        Path p = Paths.get(argsMap.get("d"));
        Files.walkFileTree(p, new SimpleFileVisitor<>() {
            @Override
            public FileVisitResult visitFile(Path path, BasicFileAttributes attrs) {
                if (Search.searchCondition(argsMap).test(path)) {
                    resultPaths.add(path);
                }
                return FileVisitResult.CONTINUE;
            }
        });
    }

    private void outFile() {
        File file = new File(argsMap.get("d"), argsMap.get("o"));
        try (PrintWriter out = new PrintWriter(new BufferedOutputStream(
                new FileOutputStream(file)))) {
            for (Path path : resultPaths) {
                out.println(path.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        SearchMain sm = new SearchMain();
        ValidateArgs.parseArgs(args);
        argsMap.putAll(ValidateArgs.createMapArgs());
        sm.searchFile();
        sm.outFile();
    }
}
