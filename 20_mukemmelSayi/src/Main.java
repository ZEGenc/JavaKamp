public class Main {
    public static void main(String[] args) {
        int number = 28;

        // BENİM DENEMEM -------------------------------------------------------------
        String mukemmelMi = "mükemmel bir sayı DEĞİL !";
        int toplam = 0;

        for(int i = 1; i<number; i++){
            if(number % i == 0){
                System.out.println(i);
                toplam = toplam + i;
            }
        }
        if (toplam == number){
            mukemmelMi = "mükemmel bir sayı !";
        }
        System.out.println(number + "sayısı" + mukemmelMi);
        System.out.println("Toplam : " + toplam);
        // ---------------------------------------------------------------------------



        int total = 0;
        for(int i = 0; i<number; i++){
            if (number%i == 0){
                total = total + 1;
            }
        }

        if(total == number){
            System.out.println("Mükemmel sayıdır");
        }else {
            System.out.println("Mükemmel sayı değildir");
        }

    }
}