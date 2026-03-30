
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReadWriteExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String filename = "example.txt";

        try {
            // --- Writing to the file ---
            System.out.println("Enter text to write to the file (single line):");
            String input = sc.nextLine();

            // FileWriter writes text to a file
            FileWriter writer = new FileWriter(filename);
            writer.write(input);
            writer.close();
            System.out.println("Text written to " + filename);

            // --- Reading from the file ---
            System.out.println("\nReading from the file:");
            FileReader reader = new FileReader(filename);
            BufferedReader br = new BufferedReader(reader);

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
            reader.close();

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

        sc.close();
    }
}