public class Main {
    public static void main(String[] args) {
        int sayi1 = 220;
        int sayi2 = 284;

        int tolpam1 = 0;
        int tolpam2 = 0;

        for(int i = 1; i < sayi1; i++){
            if(sayi1 % i == 0){
                tolpam1 = tolpam1 + i;
            }
        }

        for(int i = 1; i < sayi2; i++){
            if(sayi2 % i == 0){
                tolpam2 = tolpam2 + i;
            }
        }

        if(sayi1 == tolpam2 && sayi2 == tolpam1){
            System.out.println("bunlar arkadaş sayılardır");
        }else{
            System.out.println("Bunlar arkadaş sayı değildir");
        }
    }
}