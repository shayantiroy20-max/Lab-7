import java.io.*;
import java.util.Scanner;

class StudentFileProgram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            // Taking student details
            System.out.println("Enter Roll No:");
            int roll = sc.nextInt();
            sc.nextLine(); // clear buffer

            System.out.println("Enter Name:");
            String name = sc.nextLine();

            System.out.println("Enter Subject:");
            String subject = sc.nextLine();

            System.out.println("Enter Marks:");
            int marks = sc.nextInt();
            sc.nextLine();

            // File name input
            System.out.println("Enter the name of existing file:");
            String filename = sc.nextLine();

            // Writing data to file
            FileWriter fw = new FileWriter(filename, true);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("Roll No: " + roll);
            bw.newLine();
            bw.write("Name: " + name);
            bw.newLine();
            bw.write("Subject: " + subject);
            bw.newLine();
            bw.write("Marks: " + marks);
            bw.newLine();
            bw.write("------------------------");
            bw.newLine();

            bw.close();

            System.out.println("\nStudent details successfully written to file.\n");

            // Reading file
            System.out.println("Displaying file contents:\n");

            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);

            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();

        } catch (IOException e) {
            System.out.println("Error in file operation.");
        }

        sc.close();
    }
}
