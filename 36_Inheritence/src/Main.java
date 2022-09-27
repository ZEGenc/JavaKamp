public class Main {
    public static void main(String[] args) {
        // Inheritence miras demektir
        // customer class'ına geçiniz

        Customer customer = new Customer();
        Employee employee = new Employee();

        customer.email  ="sdfsf@email";
        customer.age = 24;
        customer.firestName = "Customer";

        // Customer class'ında sadece email argümanı yer alıyor ama person argümanlarını miras aldığı için onları da kullanabilir
        // aynı şey method'lar için de geçerlidir

        EmployeeManager employeeManager = new EmployeeManager();
        CustomerManager customerManager = new CustomerManager();

        employeeManager.BestEmployee();
        employeeManager.Add();
        employeeManager.List();
    }
}