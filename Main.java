import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Manager husang = new Manager("Husang", "general", 0);
        Admin admin = new Admin("0000husang", husang);
        while(true) { 
            System.out.println("1. Change to Admin");
            System.out.println("2. Exit");
            Scanner scan = new Scanner(System.in);
            int num = Integer.parseInt(scan.nextLine());

            if(num == 1) {
                System.out.println("Please type your password!");
                String passcode = scan.nextLine();
                // System.out.println(passcode);
            
                if(admin.check(passcode.strip())) {
                    adminMode(husang);
                }
                else {
                    System.out.println("wrong password");
                }
             } else if(num == 2) {
                break;
            }
        }
    }

    public static void adminMode(Manager man) {
        Scanner scan2 = new Scanner(System.in);

        while(true){

        System.out.println("admin mode");
        System.out.println("1. add employee to employee list"); 
        System.out.println("2. remove employee to employee list");
        System.out.println("3. Print Employee List");
        System.out.println("4. Exit");
        int num2 = Integer.parseInt(scan2.nextLine()); 

        if(num2 == 1) {
            man.addEmployee();
        }
        else if(num2 == 2) {
            man.removeEmployee();
        }
        else if(num2 == 3) {
            man.printAllEmployee();
        }
        else if(num2 == 4) {
            break;
        }
        else {
            System.out.println("Please choose among 1,2,3,4!");
        }
     }
    }
}