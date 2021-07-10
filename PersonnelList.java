import java.util.ArrayList;

public class PersonnelList {
    ArrayList<Manager> menList;
    ArrayList<Employee> empList;
    
    PersonnelList() {
        empList = new ArrayList<Employee>();
    }
    //add & remove
    //make PersonnelList in to ArrayList

    public void remove(int num) {
        empList.remove(num);
    }
    public void add(Employee emp) {
        empList.add(emp);
    }
    public String toString() {
        String returnString = " ";
        for(int i = 0; i < empList.size(); i++) {
           returnString = i + ": " + empList.get(i) + " ";
        }
        return returnString;
     }
    
   
}
