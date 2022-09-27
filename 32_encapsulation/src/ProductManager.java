public class ProductManager {
    public void Add(Product product){
        System.out.println("Ürün eklendi !" + product.name);
    }

    public void Add2(String name, String description, double price, int stockAmount, int id){
        // bu kullanım hatalı bir kullanımdır
        // bu kullanımı birçok defa kullandık diyelim. belki onlarca, belki yüzlerce defa
        // yeni bir özellik eklememiz gerektiğini varsayalım. n-kaç defa kullandıysak hepsini yeniden düzenlememiz gerekir.
        // product sayfasına geçiniz

    }
}