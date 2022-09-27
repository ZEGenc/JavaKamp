public class Main {
    public static void main(String[] args) {

        DortIslem dortislem = new DortIslem();

        int sonuc = dortislem.Topla(10,20);
        sonuc = dortislem.Cikar(10,20);
        sonuc = dortislem.Carp(10,20);
        sonuc = dortislem.Bol(10,20);

        System.out.println(sonuc);
    }
}