public class Main {
    public static void main(String[] args) {
        // (operasyon=fonksiyon=method)
        // void operasyonlar sisteme bir şey yapmasını söyler, bir işlem gerçekleştirilir

        String mesaj = "bugün hava çok güzel";
        String yeniMesaj = mesaj.substring(0,2);
        System.out.println(yeniMesaj);
        String yeniMesaj2 = sehirVer();
        // sehirer string değer döndürdüğü için değişken bu fonksiyonu kabul eder

        int sayi = topla(7,5); //topla fonksiyonu int değer döndürür
        System.out.println(sayi);
    }

    public static void ekle(){
        System.out.println("eklendi");
    }

    public static void sil(){
        System.out.println("Silindi");
    }

    public static void guncelle(){
        System.out.println("Güncellendi");
    }

    public static int topla(int sayi1, int sayi2){
        // void yerine int yazdık
        // bu fonksiyon integer türünde bir değğer döndürür demektir
        // return 5;
        // 5 değerini döndür demek

        return sayi1 + sayi2;
    }

    public static String sehirVer(){
        return "Ankara";
    }
}