package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class WordCount {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file1 = "/collections/lear.txt";
    private static final String file2 = "/collections/flights.txt";
    private static final String file3 = "/collections/midtermscores.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        final Path path1 = Paths.get(Histogram.class.getResource(file1).toURI());
        final Path path2 = Paths.get(Histogram.class.getResource(file2).toURI());
        final Path path3 = Paths.get(Histogram.class.getResource(file3).toURI());

        printLineNumber(path1);
        printLineNumber(path2);
        printLineNumber(path3);
        printWordNumber(path1);
        printWordNumber(path2);
        printWordNumber(path3);
        printCharNumber(path1);
        printCharNumber(path2);
        printCharNumber(path3);
    }

    public static void printLineNumber(Path path) throws IOException {
        System.out.println("Lines = " + Files.readAllLines(path, charset).size());
    }

    public static void printWordNumber(Path path) throws IOException {
        List<String> arrayOfLinesFromFile = Files.readAllLines(path, charset);
        int wordCount = 0;
        for (String line : arrayOfLinesFromFile) {
            String[] words = line.split("\\s+");
            wordCount += words.length;
        }
        System.out.println("Words = " + wordCount);
    }

    public static void printCharNumber(Path path) throws IOException {
        List<String> arrayOfLinesFromFile = Files.readAllLines(path, charset);
        int charCount = 0;
        for (String line : arrayOfLinesFromFile) {
            char[] arrayOfChars = line.toCharArray();
            for (char charOrDigit : arrayOfChars) {
                if (Character.isLetterOrDigit(charOrDigit)) {
                    charCount++;
                }
                System.out.println(charCount);
            }

        }
        System.out.println("Chars = " + charCount);
    }

}
