public class Main {
    public static void main(String[] args) {

/*
        int sayi1 = 10;
        int sayi2 = 20;
        sayi1 = sayi2;

        sayi2 = 100;

        System.out.println(sayi1);
        // SONUÇ = 20


        int[] sayilar1 = new int[]{1, 2, 3, 4, 5};
        int[] sayilar2 = new int[]{10, 20, 30, 40, 50};
        sayilar1 = sayilar2;
        sayilar2[0] = 1000;

        System.out.println(sayilar1[0]);
        // SONUÇ = 1000

*/
/*
        CreditManager creditManager = new CreditManager();
        creditManager.calculate();
        creditManager.calculate();
        creditManager.calculate();
        creditManager.save();

        Customer customer = new Customer();
        customer.id = 123456789;

        CustomerManager customerManager = new CustomerManager(customer);
        customerManager.save();
        customerManager.delete();

        Person person = new Person();
        person.nationalIdentity = "45a8rg45sdg8aa";

        Company company = new Company();
        company.taxNumber = "10000";
        company.companyName =  "Arçelik";
        company.id = 1000;

        CustomerManager customerManager2 = new CustomerManager(new Customer());
        CustomerManager customerManager3 = new CustomerManager(new Company());
        CustomerManager customerManager4 = new CustomerManager(new Person());

        Customer c1 = new Customer();
        Customer c2 = new Company();
        Customer c3 = new Person();
 */

        CustomerManager customerManager = new CustomerManager(new Customer(), new MilitaryCreditManager());
        customerManager.giveCredit();
    }

}