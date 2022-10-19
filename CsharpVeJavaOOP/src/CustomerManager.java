public class CustomerManager {
    private Customer customer;
    private ICreditManager iCreditManager;

    public CustomerManager(Customer customer, ICreditManager iCreditManager){
        this.customer = customer;
        this.iCreditManager = iCreditManager;
    }
    public void save(){
        System.out.println("Kayıt tamamlandı : " );
    }

    public void delete(){
        System.out.println("Kayıt tamamlandı : ");
    }

    public void giveCredit(){
        this.iCreditManager.calculate();
    }
}
