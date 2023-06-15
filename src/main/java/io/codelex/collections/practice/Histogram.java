package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Histogram {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/midtermscores.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        final String scores = fileContent();
        System.out.println(scores);
        int[] histogram = new int[11];
        String[] splitedArray = scores.split(" ");
        for (String number : splitedArray) {
            int score = Integer.parseInt(number);
            if (score >= 0 && score <= 100) {
                histogram[score / 10]++;
            }
        }


        for (int i = 0; i <= 9; i++) {
            String range = String.format("%02d-%02d:", i * 10, i * 10 + 9);
            System.out.print(range + " ");

            for (int j = 0; j < histogram[i]; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Print the range containing only the value 100 separately
        String range = "  100:";
        System.out.print(range + " ");
        for (int j = 0; j < histogram[10]; j++) {
            System.out.print("*");
        }
        System.out.println();
    }


    private static String fileContent() throws URISyntaxException, IOException {
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        return Files.readAllLines(path, charset).stream()
                .findFirst()
                .orElseThrow(IllegalStateException::new);
    }
}
