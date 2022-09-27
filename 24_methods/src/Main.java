public class Main {
    public static void main(String[] args) {

        // kod yazarken bir kex yazdığımız kodu defalarca yazmamalıyız. kendimizi tekrarlamamalıyız
        // bir kodu birden fazla defa kullanabilmemizi sağlayan şey fonksiyon yazmaktır.

        // java direkt olarak main methodu üzerinden çalışır.
        // main methodu boş ise ve diğer methodlar dolu olsa bile bir çıktı vermez
        //java main üzerinden dallanır
        //methodlar aşağıdaki gibi çağırılır;

        sayiBulmaca();
    }

    public static void sayiBulmaca(){
        int[] sayilar = new int[] {1,2,5,7,9,0};
        int aranacak = 5;

        String buradaMi = "Burada Değil";
        for(int i:sayilar){
            if (i == aranacak){
                buradaMi = "Burada";
                break;
            }
        }
        System.out.println(buradaMi);
        mesajVer(aranacak);
        // burada aranacak değişkenini parametrenin yerine kuoyarız. parametrenin fonksiyon içindeki görevini yapar
    }


    public static void mesajVer(int parametre){

        //method içine parametre verebiliriz. buna parametreli method denir.
        // parametreler yer tutucu gibi görev yapar
        // mesajVer(sayi) yazdığımızda sayi değişkeni parametrenin yerine geçer
        // yani ("Sayı mevcuttur : " + parametre) ifadesi ("Sayı mevcuttur : " + sayi) olarak çalışır

        System.out.println("Sayı mevcuttur : " + parametre);
    }
}