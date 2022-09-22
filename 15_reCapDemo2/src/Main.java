public class Main {
    public static void main(String[] args) {

        // double[] mylist = new double[4];

        // arary oluşturmaın daha basit yolu şudur;
        // süslü parantez açıp içine değerleri yazarız.

        double[] mylist = {1.2 , 1.3 , 4.3 , 5.6};

        for (double number: mylist){
            System.out.println(number);
        }


        double total = 0;
        for (double number: mylist){
            total += number;
        }
        System.out.println("toplam = " + total);


        double max = mylist[0];
        for (double number: mylist){
            if (max<number){
                max = number;
            }
        }
        System.out.println("En büyük = " + max);
    }
}