public class Main {
    public static void main(String[] args) {

        // GETTER : get-al , bir değeri okumaya yönelik işlemdir
        // SETTER : set-kurmak , bir değeri tanımlamaya, ayarlamaya yarar

        // argümanları private yaptık ve argümanlara ulaşabilmemiz lazım
        // Product sayfasına geçiniz
        Product urun1 = new Product();
        urun1.setName("Laptop");
        urun1.setId(1);
        urun1.setDescription("Asus Laptop");
        urun1.setPrice(5000);
        urun1.setStockAmount(3);

        ProductManager productManager = new ProductManager();
        productManager.Add(urun1);
        System.out.println(urun1.getKod());

    }

}