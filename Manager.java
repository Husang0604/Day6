import java.util.ArrayList;
import java.util.Scanner;
public class Manager extends Employee {
    PersonnelList list;
    Scanner scan;
    Manager(String name, String department, int num) { 
        super(name, department, num);
        list = new PersonnelList();
        scan = new Scanner(System.in);
    }
    
    public void addEmployee() {
        
        System.out.println("Name?");
        String name = scan.nextLine();
        Employee emp1 = new Employee(name, "research", 1);
        list.add(emp1);

    }
    public void removeEmployee() {
        System.out.println("What number?");
        int num1 = scan.nextInt();
        list.remove(num1);
    }
    public void printAllEmployee() {
        System.out.println(list.toString());
    }

   
}
