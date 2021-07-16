import java.util.ArrayList;

public class Admin extends Employee{
    private String adminKey;
    private ArrayList<Manager> managerList;
    Admin(String adminkey, Manager manager) {
        this.adminKey = adminkey;
        managerList = new ArrayList<Manager>();
        managerList.add(manager);
    }

    public Boolean check(String pwd) {
        System.out.println("pwd");
        System.out.println(pwd);
        System.out.println(adminKey);
        System.out.println(adminKey == pwd);

        if (pwd.equals(adminKey)) {
            return true;
        } else {
            return false;
        }

    }
}
