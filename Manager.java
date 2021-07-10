import java.util.ArrayList;
import java.util.Scanner;
public class Manager extends Employee {
    ArrayList<Employee> list;
    Scanner scan;
    Manager(String name, String department, int num) { 
        super(name, department, num);
        list = new ArrayList<Employee>();
        scan = new Scanner(System.in);
    }
    
    public void addEmployee() {
        
        System.out.println("Name?");
        String name = scan.nextLine();
        Employee emp = new Employee(name, "research", 1);
        list.add(emp);

    }
    public void printAllEmployee() {
        //System.out.println(list);
        for(int i = 0; i < list.size(); i++) {
            System.out.println(i + ": " + list.get(i));
        }
    }
    public void removeEmployee() {
        System.out.println("What number?");
        int numb = scan.nextInt();
        list.remove(numb);
    }
    
}
