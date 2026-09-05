import java.util.Scanner;

public class StudentRecord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student record: ");
        String csvLine = sc.nextLine();

        String[] data = csvLine.split(",");

        if (data.length == 3) {
            System.out.println("Name: " + data[0] +
                    " | Roll No: " + data[1] +
                    " | Dept: " + data[2]);
        } else {
            System.out.println("Invalid Record");
        }
    }
}