package io.codelex.advance_exercise.fourth_exercise;

import java.io.*;

public class MyFileReader {

    public static void main(String[] args) {


        String sourceFilePath = "/Users/andrej/IdeaProjects/CodelexHomework/src/main/resources/advanceExercise/toCheckMyFileReader.txt";
        String destinationFilePath = "/Users/andrej/IdeaProjects/CodelexHomework/src/main/resources/advanceExercise/emptyFile";

        reverseFileContentAndTitle(sourceFilePath, destinationFilePath);

        System.out.println("File content and title reversed successfully!");

    }

    private static void reverseFileContentAndTitle(String sourceFilePath, String destinationFilePath) {
        try {
//File objektam deklareju ka jauno failu un padodu savu ceļu
            File sourceFile = new File(sourceFilePath);
//            Šeit deklareju jauno readeru un iekšā deklarēju jauno FileReaderu kurā padodu izlasīt savu failu kuru iepriekš deklarēju
            BufferedReader reader = new BufferedReader(new FileReader(sourceFile));

//            Šeit taisu StringBuilderu kurā saglabāšu visu kas ir manā failā līdz ebūs vienāds ar null(tukšumu(nevis"space"))
            StringBuilder createNewText = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                createNewText.append(line).append("\n");
            }
//            Saglabaju tekstu un reversoju
            String finishedText = createNewText.reverse().toString();
//             Ņemu faila nosaukumu
            String sourceFileName = sourceFile.getName();
//            Deklareju jauno apgreiztu nosaukumu
            String reversedTitle = new StringBuilder(sourceFileName).reverse().toString();
//          Deklarēju jauno failu kuram padodu ceļu
            File destinationFile = new File(destinationFilePath);
//            Deklareju jauno writer ar kuram norādu ceļu kur veiksim ierakstus
            BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFile));
//            ierakstu pagriezto tekstu
            writer.write(finishedText);
//          Veidoju jauno failu kuram padodu
            File renamedFile = new File(destinationFile.getParent(), reversedTitle);
            destinationFile.renameTo(renamedFile);

            reader.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

