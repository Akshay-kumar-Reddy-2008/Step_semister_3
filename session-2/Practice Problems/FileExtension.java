import java.util.Scanner;

public class FileExtension {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter filename: ");
        String filename = sc.nextLine();

        int index = filename.lastIndexOf('.');

        if (index != -1) {
            String extension = filename.substring(index + 1);

            if (extension.equalsIgnoreCase("pdf") ||
                extension.equalsIgnoreCase("docx") ||
                extension.equalsIgnoreCase("zip")) {
                System.out.println("Accepted");
            } else {
                System.out.println("Rejected - invalid file type");
            }
        } else {
            System.out.println("Rejected - invalid file type");
        }
    }
}