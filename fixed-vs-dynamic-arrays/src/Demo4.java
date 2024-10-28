import java.util.Scanner;

void main() {
    final var SCANNER = new Scanner(System.in);
    String[] studentNames = new String[5];
    int[] studentMarks = new int[5];
    int studentCount = studentNames.length;

    for (int i = 0; i < studentNames.length; i++) {
        do {
            System.out.print(STR."Enter student\{i + 1} name: ");
            studentNames[i] = SCANNER.nextLine();
        } while (studentNames[i].isBlank());

        do {
            System.out.print(STR."Enter student\{i + 1} marks: ");
            studentMarks[i] = SCANNER.nextInt();
            SCANNER.skip(System.lineSeparator());
        } while (studentMarks[i] < 0 || studentMarks[i] > 100);

        if (i < 4) {
            System.out.print("Do you want to continue? (y/n): ");
            if (!SCANNER.nextLine().equalsIgnoreCase("y")) {
                studentCount = i + 1;
                break;
            }
        }
    }

    System.out.println();
    System.out.println(STR."+\{"=".repeat(14)}+");
    System.out.printf("|%8s|%5s|%n", "Name", "ID");
    System.out.println(STR."+\{"=".repeat(14)}+");

    for (int i = 0; i < studentCount - 1; i++) {
        int maxMarks = studentMarks[0];
        int maxMarksIndex = 0;
        for (int k = 1; k < studentCount - i; k++) {
            if (maxMarks <= studentMarks[k]) {
                maxMarks = studentMarks[k];
                maxMarksIndex = k;
            }
        }
        if (maxMarksIndex != studentCount - 1 - i) {
            int tempMarks = studentMarks[studentCount - 1 - i];
            studentMarks[studentCount - 1 - i] = maxMarks;
            studentMarks[maxMarksIndex] = tempMarks;
            String tempName = studentNames[studentCount - 1 - i];
            studentNames[studentCount - 1 - i] = studentNames[maxMarksIndex];
            studentNames[maxMarksIndex] = tempName;
        }
        printStudentRecord(studentNames[studentCount - 1 - i], studentMarks[studentCount - 1 - i]);
    }
    printStudentRecord(studentNames[0], studentMarks[0]);

    System.out.println(STR."+\{"=".repeat(14)}+");
}

void printStudentRecord(String name, int marks) {
    System.out.printf("|%8s|%5d|%n", name, marks);
}