public class Product {

    public Product(String name, String description, double price, int stockAmount, int id){
        // bu parametreli bir constructor'dur. yukarıdaki parametrelerin analamı,
        // sadece bu parametrelerin hepsini kullanırsan yeni product oluşturabilirsin
        // Main sayfasına bknz.
        // biz buraya parametreleri verip hiçbir parametre kullanmadan alttaki fonksiyonu yazarsak hata alırız
        System.out.println("yapıcı blok çalıştı");

        // hata almamak için ve parametreleri tanımlamış olmak için aşağıdaki işlemi uygularız

        this.name        = name;
        this.id          = id;
        this.price       = price;
        this.description = description;
        this.stockAmount = stockAmount;

    }

    public Product(){
        // aynı constructor ismini iki defa kullanarak yeini constructor oluşturduk
        // buna overloading denir
        // istediğimizi kullanabiliriz ve hata almayız
        // Main sayfasına bknz.
    }


    // public String tanim;
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private int id;

    private String kod;



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

}
