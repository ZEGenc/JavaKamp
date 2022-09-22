public class Main {
    public static void main(String[] args) {

        // java Case senstive bir dildir
        //değişken tanımlarken camelCasing kullanılır
        // reusability : kodların tekrar tekrar kullanılabilmesi.

        int ogrenciSayisi = 10;

        String mesaj = "Öğrenci Sayısı : ";

        System.out.println("Öğrenci Sayım : 9");
        System.out.println("Öğrenci Sayım : 9");
        System.out.println("Öğrenci Sayım : 9");
        System.out.println("Öğrenci Sayım : 9");

        System.out.println("Öğrenci Sayım : " + ogrenciSayisi);
        System.out.println("Öğrenci Sayım : " + ogrenciSayisi);
        System.out.println("Öğrenci Sayım : " + ogrenciSayisi);
        System.out.println("Öğrenci Sayım : " + ogrenciSayisi);

        System.out.println(mesaj + ogrenciSayisi);
        System.out.println(mesaj + ogrenciSayisi);
        System.out.println(mesaj + ogrenciSayisi);
        System.out.println(mesaj + ogrenciSayisi);
    }
}