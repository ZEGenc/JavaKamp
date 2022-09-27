public class ProductManager {
    public void Add(Product product){
        // jdbc kodları ile database'e kaysettik varsayalım
        System.out.println("Ürün eklendi !" + product.name);
    }
}