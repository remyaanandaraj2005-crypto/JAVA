import java.io.*;

public class FileCopy {
    public static void main(String[] args) {

        try {
            // Source file (read from this)
            FileReader fr = new FileReader("sample.txt");
            BufferedReader br = new BufferedReader(fr);

            // Destination file (write to this)
            FileWriter fw = new FileWriter("destination.txt");

            String line;

            // Copy line by line
            while ((line = br.readLine()) != null) {
                fw.write(line + "\n");
            }

            // Close all files
            br.close();
            fr.close();
            fw.close();

            System.out.println("File copied successfully!");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}