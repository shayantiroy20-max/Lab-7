import java.io.FileInputStream;
import java.io.IOException;
class CompareBinaryFiles {

    public static void main(String[] args) {

        String file1 = "file1.bin";   // first binary file
        String file2 = "file2.bin";   // second binary file

        try {

            FileInputStream f1 = new FileInputStream(file1);
            FileInputStream f2 = new FileInputStream(file2);

            int b1, b2;
            int position = 1;
            boolean equal = true;

            while ((b1 = f1.read()) != -1 && (b2 = f2.read()) != -1) {

                if (b1 != b2) {
                    System.out.println("Two files are not equal: byte position at which two files differ is " + position);
                    equal = false;
                    break;
                }

                position++;
            }

            if (equal) {
                if (f1.read() == -1 && f2.read() == -1) {
                    System.out.println("Two files are equal");
                } else {
                    System.out.println("Two files are not equal: files have different lengths");
                }
            }

            f1.close();
            f2.close();

        } catch (IOException e) {
            System.out.println("Error reading files.");
        }
    }
}