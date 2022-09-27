public class Main {
    public static void main(String[] args) {

        int sayi = topla(7,5);
        System.out.println(sayi);

        int toplam = topla2(1,2,3,4,5,6,7,8,9,10);
        System.out.println(toplam);
    }


    public static int topla(int sayi1, int sayi2){
        return sayi1 + sayi2;
    }

    public static int topla2(int... sayilar){
        // üç tane nokat koyarsak birden fazla sayı göndereceğimiz anlamına gelir
        // arka planda verilen sayıları diziye çevirir

        int toplam = 0;
        for (int sayi:sayilar){
            toplam = toplam + sayi;
        }
        return toplam;

    }

}