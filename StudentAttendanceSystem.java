// Task No:1 Student Attendence Management System using Data Structures
import java.util.*;

public class StudentAttendanceSystem {

    Queue<Integer> studentQueue = new LinkedList<>();
    HashSet<Integer> studentSet = new HashSet<>();
    Stack<Integer> attendanceStack = new Stack<>();

    // this method is used to add students attendance
    public void addStudentsAttendence(int studentId) {
        if (studentSet.contains(studentId)) {
            System.out.println("Student already added");
            return;
        }
        studentQueue.add(studentId);
        studentSet.add(studentId);
        attendanceStack.push(studentId);
        System.out.println("Attendance added for studentID:" + studentId);
    }

    // this method checks whether student is present or not
    public void checkStudentsPresence(int studentId) {
        if (studentSet.contains(studentId)) {
            System.out.println("Student (" + studentId + ") is present");
        } else {
            System.out.println("Student (" + studentId + ") is absent");
        }
    }

    // this method removes the last attendence entry
    public void removeAttendance() {
        if (attendanceStack.isEmpty()) {
            System.out.println("No attendance to remove");
            return;
        }
        int lastStudent = attendanceStack.pop();
        studentSet.remove(lastStudent);
        studentQueue.remove(lastStudent);
        System.out.println("Last attendance removed for student ID:" + lastStudent);
    }

    // this method prints all student ids whose attendence is marked
    public void showAttendance() {
        if (studentQueue.isEmpty()) {
            System.out.println("No attendance found");
            return;
        }
        System.out.println("Attendance list:");
        for (int id : studentQueue) {
            System.out.println("Student ID: " + id);
        }
    }

    public static void main(String[] args) {

        StudentAttendanceSystem system = new StudentAttendanceSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Student Attendence Management System");
            System.out.println("1 Add Attendance");
            System.out.println("2 Check Attendance");
            System.out.println("3 Remove Attendance");
            System.out.println("4 Show Attendance");
            System.out.println("5 Exit");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter student id: ");
                    int addId = scanner.nextInt();
                    system.addStudentsAttendence(addId);
                    break;

                case 2:
                    System.out.print("Enter student id: ");
                    int checkId = scanner.nextInt();
                    system.checkStudentsPresence(checkId);
                    break;

                case 3:
                    system.removeAttendance();
                    break;

                case 4:
                    system.showAttendance();
                    break;

                case 5:
                    System.out.println("Exit.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Wrong choice");
            }
        }
    }
}