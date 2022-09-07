import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the size of your group and press [ENTER]:");
        int sizeOfGroup = scanner.nextInt();

        Student[] students = new Student[sizeOfGroup];

        for (int i = 1; i <= sizeOfGroup; i++) {

            System.out.println("Please enter the name of student #" + i + " and press [ENTER]:");
            students[i-1] = new Student(scanner.next());
        }

        System.out.println();

        for (int i = 1; i <= sizeOfGroup; i++) {

            System.out.println("Student #" + i + ": " + students[i-1].name);
        }

        System.out.println();

        for (int i = 1; i <= sizeOfGroup; i++) {

            System.out.println("Is student #" + i + "(" + students[i-1].name + ")" + "present? [Y/N + ENTER]");
            String answer = scanner.next();

            if (answer.equals("y")) {
                students[i - 1].presence = true;
            }
            else {
                students[i - 1].presence = false;
            }
        }

        for (int i = 1; i <= sizeOfGroup; i++) {

            System.out.println("Student #" + i + ":" + students[i - 1].name + "            |" +
                    " Present: " + students[i - 1].presence.toString());
        }

    }
}