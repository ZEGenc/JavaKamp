public class Main {
    public static void main(String[] args) {
        // CustomerManager isimli bi class oluşturduk, bu class içindeki fonksiyonları şöyle kullanırız;
        // önce o sınıfa ait bir nesne oluşturmamız lazım. şu şekilde;
        CustomerManager degisken = new CustomerManager();
        CustomerManager degisken2 = new CustomerManager();

        // degisken isimli değişken artık CustomerManager sınıfına ait bir nesnedir.
        // degisken yazıp nokta koyunca nesnenin bulunduğu sınıfa ait fonksiyonları nesne üzerinde kullanabiliriz.
        // fonksiyonları sadece o sınıfa ait nesneler üzerinden kullanabiliriz

        degisken.add();
        degisken.remove();
        degisken.update();

        // class'lar referans tiptir
        // oluşturduğumuz nesneler bellekte bir adres edinir ve yapılan işlemler bellekteki adrese yönlendirilerek yapılır.

        degisken = degisken2;
        // bu şekilde bir eşitleme yaparsak degisken isimli nesne üzerinde yapılan işlem degisken2'nin adresine yönlendirilir
        // bu şekilde iki nesneyi de aynı adrese göndermiş oluruz
        // dolayısıyla ilk yazılan değişken bellekte yer kaplamış olur ama erişilemez.javanın bellek yöneticisi bu kullanılamayan neesne adresini siler
        // eğer nesneyi aşağıdaki gibi boş bırakırsak da hata almayız artık

        CustomerManager nesne1;
        CustomerManager nesne2 = new CustomerManager();
        nesne1 = nesne2;
    }
}