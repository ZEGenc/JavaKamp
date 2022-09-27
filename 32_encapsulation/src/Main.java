public class Main {
    public static void main(String[] args) {

        // ENCAPSULATİON
        // kullanıcıya sınırlar koymak için kullanılır
        // mesela price değerine negatif değer girilmesini engellemek
        // ProductManager sayfasına geçiniz.

        Product urun1 = new Product();
        urun1.name        = "Laptop";
        urun1.id          = 1;
        urun1.description = "Asus Laptop";
        urun1.price       = 5000;
        urun1.stockAmount = 3;
        urun1.renk = "kirmizi";

        ProductManager productManager = new ProductManager();
        productManager.Add(urun1);

    }
}
