import java.io.*;
import java.util.Scanner;
class FileStatistics {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the file name:");
        String filename = sc.nextLine();

        int characters = 0;
        int words = 0;
        int lines = 0;

        try {

            BufferedReader br = new BufferedReader(new FileReader(filename));
            String line;

            while ((line = br.readLine()) != null) {

                lines++;                          // count lines
                characters += line.length();      // count characters

                String[] wordList = line.split("\\s+"); // split words
                words += wordList.length;         // count words
            }

            br.close();

            System.out.println("No. of characters - " + characters);
            System.out.println("No. of lines - " + lines);
            System.out.println("No. of words - " + words);

        } catch (IOException e) {
            System.out.println("Error reading file.");
        }

        sc.close();
    }
}