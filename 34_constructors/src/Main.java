public class Main {
    public static void main(String[] args) {

        // parametrelei constructor böyle tanımlanır;

        Product urun1 = new Product("Laptop", "Asus Laptop", 5000, 3, 1);
        urun1.setName("Laptop");
        urun1.setId(1);
        urun1.setDescription("Asus Laptop");
        urun1.setPrice(5000);
        urun1.setStockAmount(3);

        // eğer diğer türlü tanımlamak istersek overloading yapabiliriz
        // Product sayfasına bknz.

        Product urun2 = new Product();
        urun2.setName("Laptop");
        urun2.setId(1);
        urun2.setDescription("Asus Laptop");
        urun2.setPrice(5000);
        urun2.setStockAmount(3);

        ProductManager productManager = new ProductManager();
        productManager.Add(urun1);
        System.out.println(urun1.getKod());

    }

}