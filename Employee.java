public class Employee {
    String name;
    String department;
    int num;

    Employee() {

    }
    Employee(String name, String department, int num) {
        this.name = name;
        this.department = department;
        this.num = num;
    }
    public String toString() {
        return this.name;
    }
}
