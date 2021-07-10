class Main {
    public static void main(String[] args) {
        Manager husang = new Manager("Husang", "general", 0);
        husang.addEmployee();
        husang.addEmployee();
        husang.addEmployee();
        husang.printAllEmployee();
        husang.removeEmployee();
        husang.printAllEmployee();
    }
}