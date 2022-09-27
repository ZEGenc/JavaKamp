import java.security.PublicKey;

public class Product {

    // public String tanim;
    String name;
    String description;
    double price;
    int stockAmount;
    int id;
    String renk;
    // mesela burada yeni bir özellik tanımladığımızda kullandığımız fonksiyonlar bu sefer hata vermez
    // main sayfasında görüldüğü gibi ürün üzerine renk tanimladığımızda da hata vermez
    // bu şekilde argüman atnımlandığında bu argümanlar public olarak tanımlanır
    // yani her yerden erişilebilirdir.
    // tanımlamadan önce default olarak public vardır aslında
    // eğer bit tanımlamadan önce private koyarsak tanımlamalar sadece tanımlandığı blokta geçerli demektir.
    // buradaki tanımlamalar sadece Product class'ı içinde geçerli olur . içinde bulunduğu süslü parantezde

    private String name2;
    private String description2;
    private double price2;
    private int stockAmount2;
    private int id2;
    private String kod;

    public void method(){
        name2 = "";
    }


}