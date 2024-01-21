import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JFileChooser;

public class PersonReader {
    public static void main(String[] args) {
        JFileChooser fileChooser = new JFileChooser();
        if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            try {
                Scanner sc = new Scanner(file);
                while (sc.hasNextLine()) {
                    String line = sc.nextLine();
                    String[] data = line.split(",");
                    System.out.format("ID: %s, First name: %s, Last name: %s, Title: %s, Year of birth: %s\n", data[0], data[1], data[2], data[3], data[4]);
                }
                sc.close();
            } catch (FileNotFoundException e) {
                System.out.println("Error reading file " + file.getName());
            }
        }
    }
}