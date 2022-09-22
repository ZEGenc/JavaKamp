public class Main {
    public static void main(String[] args) {

        // STRİNG İŞLEMLERİ

        // string yapıları birer karakter dizisidir
        // her karaktere index ile ulaşılabilir.

        String mesaj = "Bugün hava çok güzel.";

        System.out.println(mesaj);

        // eleman sayısı
        System.out.println("eleman sayısı" + mesaj.length());

        // ? index numarasındaki karakteri bulma
        System.out.println("5. eleman = " + mesaj.charAt(4));
        // bir dizi olarak tanımlanmadı ve bu yüzden dizilerdeki gibi mesaj[4] şeklinde bulunamaz

        // metin birleştirme
        System.out.println(mesaj.concat(" yaşasın !")); // değişkeni etkilemez

        // başta ne var ?
        System.out.println(mesaj.startsWith("A"));
        // srting A ile başlıyor mu diye sorduk. Boolean değer verir

        // sonda ne var ?
        System.out.println(mesaj.endsWith("A"));

        // ... - ... aralığındaki karakterleri bulma
        char[] karakterler = new char[5];
        mesaj.getChars(0,5,karakterler,0);
        // bu işlem bir değişkenin içine aktarılarak kullanılır
        // mesaj değişkeninin 0-5 index aralığındaki elemanları karakterler dizisinin içine 0. indexten başlayarak aktaır
        // 5. eleman dahil edilmez.

        // karakter nerede (baştan)
        System.out.println(mesaj.indexOf("a"));
        // a karakterini bulduğu ilk indexi bize çıktı olarak verir

        // karakter nerede (sondan)
        System.out.println(mesaj.lastIndexOf("a"));
        // aramaya sağdan başlar ama index numarası değişmez. indexler soldan sağa sıralıdır.

        // Karakter değiştirme
        System.out.println(mesaj.replace(" ", "-"));
        // boşluk karakterlerini tire (-) ile değiştirdik.

        // metinden parça alma
        System.out.println(mesaj.substring(5));
        // 5. indexten itibaren metni yazdırır.5 dahil
        System.out.println(mesaj.substring(5,12));
        // 5'ten 12'ye kadar. 12 dahil değildir

        // metni parçalama
        for(String kelime:mesaj.split(" ")){
            System.out.println(kelime);
            // metni boşluk karakterinin bulunduğu yerlerden ayırıp bir array oluşturur
        }

        // harfleri küçültme
        System.out.println(mesaj.toLowerCase());
        // tüm harfleri küçük harf yapar

        // harfleri büyütme
        System.out.println(mesaj.toUpperCase());

        // baş ve sondaki boşlukları kırpma
        System.out.println(mesaj.trim());
        // metinlerin başında ve sonunda boşluk var ise boşlukları siler
    }
}