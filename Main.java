package projects.studentms;


import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StudentManager mgr = new StudentManager();
        boolean running = true;
        while(running){
            System.out.println("\n1.Add  2.List  3.Search  4.Update  5.Delete  6.Exit");
            System.out.print("Choice: ");
            int choice = Integer.parseInt(sc.nextLine().trim());
            switch(choice){
                case 1:
                    System.out.print("id: "); int id = Integer.parseInt(sc.nextLine());
                    System.out.print("name: "); String name = sc.nextLine();
                    System.out.print("age: "); int age = Integer.parseInt(sc.nextLine());
                    System.out.print("dept: "); String dept = sc.nextLine();
                    System.out.print("marks: "); double marks = Double.parseDouble(sc.nextLine());
                    mgr.addStudent(new Student(id, name, age, dept, marks));
                    System.out.println("Added.");
                    break;
                case 2:
                    List<Student> all = mgr.getAllStudents();
                    all.forEach(System.out::println);
                    break;
                case 3:
                    System.out.print("Enter id to search: "); int sid = Integer.parseInt(sc.nextLine());
                    Student found = mgr.getStudentById(sid);
                    System.out.println(found == null ? "Not found" : found);
                    break;
                case 4:
                    System.out.print("Enter id to update: "); int uid = Integer.parseInt(sc.nextLine());
                    Student old = mgr.getStudentById(uid);
                    if(old == null){ System.out.println("Not found"); break; }
                    System.out.print("new name: "); String nn = sc.nextLine();
                    System.out.print("new age: "); int na = Integer.parseInt(sc.nextLine());
                    System.out.print("new dept: "); String nd = sc.nextLine();
                    System.out.print("new marks: "); double nm = Double.parseDouble(sc.nextLine());
                    mgr.updateStudent(uid, new Student(uid, nn, na, nd, nm));
                    System.out.println("Updated.");
                    break;
                case 5:
                    System.out.print("Enter id to delete: "); int did = Integer.parseInt(sc.nextLine());
                    boolean deleted = mgr.deleteStudent(did);
                    System.out.println(deleted ? "Deleted." : "Not found.");
                    break;
                case 6:
                    running = false; break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
        sc.close();
        System.out.println("Bye!");
    }
}
