public class Main {
    public static void main(String[] args) {
        Product urun1 = new Product();
        urun1.name        = "Laptop";
        urun1.id          = 1;
        urun1.description = "Asus Laptop";
        urun1.price       = 5000;
        urun1.stockAmount = 3;

        ProductManager productManager = new ProductManager();
        productManager.Add(urun1);

    }
}

// YAZILIMIN TEMEL İLKELERİ
// S : single-responsibility principle : tek sorumluluk prensibi. bir class, method sadece bir işi yapar
// O : open–closed principle:
// L : Liskov substitution principle
// I : interface segregation principle
// D : dependency inversion principle