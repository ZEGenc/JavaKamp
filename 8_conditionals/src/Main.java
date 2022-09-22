public class Main {
    public static void main(String[] args) {

        int sayi = 19;

        // şart bloğu oluşturmak için büyük çoğunlukta if blokları kullanılır.
        // eğer şart bloğu true değer döndürüyorsa  doğru olan şartın gereklerini yerine getirir.

        if (sayi < 20){
            System.out.println("sayı 20'den küçük");
            //bu en temel şart bloğudur
        }

        if (sayi < 20){
            System.out.println("sayı 20'den küçük");
            //birden fazla şart bloğu konulabilir. doğru olan her blok döndürülür.
        }else if (sayi == 20){
            // değer ataması yaparken tek = , karşılaştırma yaparken çift == kullanılır.
            // eğer önceki blok false değeri verdiyse bu şart kullanılır
            // önceki blok true değeri verirse bu ve sonraki şartlar kulllanılmaz
            System.out.println("sayı 20'e eşittir");
        }else{
            //bir önceki şartların geçerli olmadığı durumda ne yapılması gerektiğini yazarız
            System.out.println("sayı 20'den büyük");
        }
    }
}