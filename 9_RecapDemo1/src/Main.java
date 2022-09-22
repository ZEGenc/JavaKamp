public class Main {
    public static void main(String[] args) {

        int sayi_1 = 20;
        int sayi_2 = 25;
        int sayi_3 = 2;

        int enBuyuk = sayi_1;

        if(enBuyuk<sayi_2){
            enBuyuk = sayi_2;
        }
        if(enBuyuk<sayi_3){
            enBuyuk = sayi_3;
        }
        System.out.println(enBuyuk);
    }
}