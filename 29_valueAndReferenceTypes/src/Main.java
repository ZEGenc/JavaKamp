public class Main {
    public static void main(String[] args) {
        // primitive veriler değer tipli verilerdir
        // değeri bellekte bir adreste tutulmaz, hemen yanındadır

        int sayi1 = 10;
        int sayi2 = 20;
        sayi2 = sayi1;
        sayi1 = 30;

        System.out.println(sayi2);
        // sayi 2 sonuç olarak 10 değerini verir
        // çünkü sayi2 sayi1'e bağlanmaz, sayi1'in değerini alır
        // sayi1'i değiştirince sayi2 bundan etkilenmez


        // REFERANS tipli verilerin değerleri bir adreste tutulur
        // diziler referans tiptir

        int[] sayilar1 = {1,2,3,4};
        int[] sayilar2 = {5,6,7,8};
        sayilar2 = sayilar1;
        sayilar1[0] = 10;

        System.out.println(sayilar2[0]);

        // sayilar2 sayilar1'in değerinin bulunduğu adrese bağlanır
        // böylece sayilar1'in adresinde değişiklik olunca sayilar2'de aynı yerden veri aldığı için
        // sayilar1 değişince sayilar2 de değişmiş ve aynı değerleri almış olur. sonuç 10 olarak çıkar
    }
}