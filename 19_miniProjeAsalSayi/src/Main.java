public class Main {
    public static void main(String[] args) {

        // BENİM DENEMEM -------------------------------------------------------
        int sayi = 7;
        String asalMi = "ASAL";

        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                asalMi = "Asal DEĞİL";
                break;
            }
        }
        System.out.println(asalMi);

        //----------------------------------------------------------------------


        int number = 25;
        int reminder = number % 2;
        boolean isPrime = true;

        if(number < 1){
            System.out.println("Geçersiz sayı !");
        }
        if (number == 1) {
            System.out.println("Sayı Asal Değildir.");
            return;
        }

        for (int i = 2; i < number; i++){
            if(number % i == 0){
                isPrime = false;
            }
        }

        if(isPrime){
            System.out.println("Sayı Asaldır");
        }else{
            System.out.println("Sayı Asal Değildir.");
        }


    }
}