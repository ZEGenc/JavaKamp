public class Main {
    public static void main(String[] args) {
        // java type secure bir dildir. tanımlanan değişkenin tipi sonradan değiştirilemez.

        int sayi = 12;
        // sayi = "Ankara" yazamayız.

        // primitive types araması ile en temel değer veri tiplerinin değerlerini öğrenebiliriz.
        // mesela integer değerler bellekte toplam 4 byte yer tutar
        // bu da (2^8)^4 , yani 2^32 yani 4294967296 farklı değer alabilir.
        // bunların yarısı negatif , yarısı pozitif değerlerdir
        // yani bellekte -2147483648'den +2147483647 değerine kadar sayısal değer alabilir. (2^31)
        // arada 0'da olduğundan dolayı son değer 1 eksiği kadar olur.

        int sayi_2 = 2147483647 ; // sona 7 yerine 8 koyunca sınırı aştığı için hata verir.

        byte sayi_3 = 127 ; // 1 byte yer kaplar. max -128 veya 127 olur. (toplam 2^8 değer)

        short sayi_4 = 32767; // 2 byte yer tutar

        long sayi_5 = 1453551684 ; // 8 byte yer tutar

        // üstteki değerler tam sayı değerlerdir. eğer nokta koyup ondalık koyarsan hata verir.
        //ondalıklı sayılar için aşağıdaki keyword'lre kullanılır

        double sayi_6 = 12.5 ; // 8 byte yer tutar

        float sayi_7 = -3 ; // 4 byte yer tutar

        // bunlar dışında bir de char e boolean veri tipleri vardır.

        char karakter = 'a'; // 2 byte yer tutar. tek tırnak ile gösterilir. tek karakterdir.
        // string'ler de karakter topluluklarıdır.
        // karakterler arka planda ASCİİ kodunun karşılığıdır

        boolean dogrumu_1 = true ;
        boolean dogrumu_2 = false ;
        // boolean'lar 1 byte yer tutarlar.
        //1 veya 0, yani doğru veya yanlış değerlerini verirler. mantıksal değerler olarak kullanılırlar.

    }
}