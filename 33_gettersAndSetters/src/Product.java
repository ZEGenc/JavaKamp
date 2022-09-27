public class Product {

    // public String tanim;
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private int id;

    private String kod;

/*
    public int getId() {
        return id;
        // bir işlem yapılmayacağı için void konulmaz
        // bu id değerini sadece okunabilir yapar
        // ürün.getId() tanımlaması yapılarak okunur
    }

    public void setId(int id){
        // burda işlem yapılacağı için void kullanılır.
        // tanımlanacak bir değer olduğu için parametre kullanılmalı
        // this.id = id;
        // burada this, içinde bulunulan class'daki id olduğunu belirtiyor
        // eşittirden sonra konulan id de parametrede kullanılandır

        // id = id;
        // üstteki kullanım parametre başka bi şekilde isimlendirilse doğrudur
        // ama bu şekilde olunca id'ler karışır
        // bu karışıklıkların önüne geçmek için ve this kullanımına gerek olmaması için argümanların başına _ koyulabilir
        // _id = id;
    }
*/

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getKod() {
        return this.name.substring(0,1)+ getId();
    }


    // eğer yazılabilir olmasını istemiyorsak set kısmını sileriz
/*
    public void setKod(int kod) {
        this.kod = kod;
    }
*/
}
