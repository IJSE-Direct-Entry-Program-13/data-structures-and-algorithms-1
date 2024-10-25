import java.util.Scanner;

void main() {
    final var SCANNER = new Scanner(System.in);
    String studentName1 = null;
    String studentName2 = null;
    String studentName3 = null;
    String studentName4 = null;
    String studentName5 = null;

    int studentMarks1 = -1;
    int studentMarks2 = -1;
    int studentMarks3 = -1;
    int studentMarks4 = -1;
    int studentMarks5 = -1;

    for (int i = 0; i < 5; i++) {
        String studentName;
        do {
            System.out.print(STR."Enter student\{i + 1} name: ");
            studentName = SCANNER.nextLine();
        }while (studentName.isBlank());

        int studentMarks;
        do {
            System.out.print(STR."Enter student\{i + 1} marks: ");
            studentMarks = SCANNER.nextInt();
            SCANNER.skip(System.lineSeparator());
        } while (studentMarks < 0 || studentMarks > 100);

        if (i == 0) {
            studentName1 = studentName;
            studentMarks1 = studentMarks;
        } else if (i == 1) {
            studentName2 = studentName;
            studentMarks2 = studentMarks;
        } else if (i == 2) {
            studentName3 = studentName;
            studentMarks3 = studentMarks;
        } else if (i == 3) {
            studentName4 = studentName;
            studentMarks4 = studentMarks;
        } else if (i == 4) {
            studentName5 = studentName;
            studentMarks5 = studentMarks;
        }

        if (i < 4) {
            System.out.print("Do you want to continue? (y/n): ");
            if (!SCANNER.nextLine().equalsIgnoreCase("y")) {
                break;
            }
        }
    }

    System.out.println();
    System.out.println(STR."+\{"=".repeat(14)}+");
    System.out.printf("|%8s|%5s|%n", "Name", "ID");
    System.out.println(STR."+\{"=".repeat(14)}+");

//    String maxStudentName = null;
//    int maxStudentMarks = -1;
//    for (int i = 0; i < 5; i++) {
//        if (i == 1  && studentName2 == null) break;
//        if (i == 2  && studentName3 == null) break;
//        if (i == 3  && studentName4 == null) break;
//        if (i == 4  && studentName5 == null) break;
//
//        int marks;
//        String name;
//
//        if (i == 0){
//            name = studentName1;
//            marks = studentMarks1;
//        }else if (i == 1){
//            name = studentName2;
//            marks = studentMarks2;
//        }else if (i == 2){
//            name = studentName3;
//            marks = studentMarks3;
//        }else if (i == 3){
//            name = studentName4;
//            marks = studentMarks4;
//        }else{
//            name = studentName5;
//            marks = studentMarks5;
//        }
//
//        if (marks > maxStudentMarks){
//            maxStudentMarks = marks;
//            maxStudentName = name;
//        }
//    }
//    printStudentRecord(maxStudentName, maxStudentMarks);

    printStudentRecord(studentName1, studentMarks1);
    if (studentName2 != null) printStudentRecord(studentName2, studentMarks2);
    if (studentName3 != null) printStudentRecord(studentName3, studentMarks3);
    if (studentName4 != null) printStudentRecord(studentName4, studentMarks4);
    if (studentName5 != null) printStudentRecord(studentName5, studentMarks5);
    System.out.println(STR."+\{"=".repeat(14)}+");
}

void printStudentRecord(String name, int marks){
    System.out.printf("|%8s|%5d|%n", name, marks);
}