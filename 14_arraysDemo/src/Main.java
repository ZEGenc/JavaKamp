public class Main {
    public static void main(String[] args) {
        String ogrenci1 = "Engin" ;
        String ogrenci2 = "Derin" ;
        String ogrenci3 = "Salih" ;
        String ogrenci4 = "Ahmet" ;

        // bu değişkenleri yazdırmak için her seferinde bir print daha eklememiz gerekir
        // değişken sayısı arttıkça bu iş daha da zaman alır.

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);

        // birden fazla değeri bir değişkenin içine yazmak için array, yani dizi yapısını kullanırız
        // bir array(dizi) tanımlamak için hengi türde bir array tanımlayacaksak anahtar kelimesinin sonuna [] köşeli parantez konur
        //new keyword'den sonra kaç elemanlı olacak ise  onu yazacağız.

        String[] ogrenciler = new String[4] ; //4 elemanlı bir string dizisi oluşturduk

        // dizilerde her ellemanın index numarası vardır.
        // index numaraları 0'dan başlar.
        // index numarasını kullanarak dizi içerisine değer atayabiliriz

        ogrenciler[0]="Engin"; //dizinin ilk elemanı yani 0 numaralı elemanını tanımladık.
        ogrenciler[1]="Derin";
        ogrenciler[2]="Salih";
        ogrenciler[3]="Ahmet";
        ogrenciler[4]="Ali";

        // for döngüsü ile dizi içindeki elemanları yazdırabiliriz.
        for (int i = 0 ; i<ogrenciler.length;i++){
            // ogrenciler.length = ogrenciler dizisinin eleman sayısını verir.
            System.out.println(i);
            System.out.println(ogrenciler[i]); // ogrenciler dizisinin i numaralı elemanını yazdırdık
        }

        // eğer diziyi oluştururken belirlediğimiz sayıdan daha fazla değer eklersek hata alırız
        // for döngüsünü arraylar için aşağıdaki gibi de yazabiliriz.

        for(String ogrenci:ogrenciler){
            System.out.println(ogrenci);
            // ogrenciler dizisi içindeki her bir elemanı sırasıyla yeni oluşturduğumuz ogrenci isimli bir değişkene atadık
            // sonra da oluşan yeni değişeni yazdırdık.
        }

    }
}