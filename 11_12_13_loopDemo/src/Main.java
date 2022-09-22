public class Main {
    public static void main(String[] args) {
        // döngüler bir fonksiyonu istenilen şartlarda ve sayıda tekrar etmeye yarar.

        // FOR DÖNGÜSÜ --------------------------------------------------------------

        for (int i = 1; i<=10; i++){
            // i++ ifadesi i sayısını 1 artırmaya yarar (i=i+1)
            // i ifadesini tanımladık
            // i 10'dan küçük olduğu sürece tekrarlanacağını belirttik
            // her tekrarın sonunda i'yi 1 artırıp 10'a yaklaştırdık.
            // parantez içindeki ifadeler sırası ile çalışır

            System.out.println(i);
        }
        System.out.println("Döngü Bitti");

        for (int i = 1; i<=10; i+=2){
            // i+=2 ifadesi i sayısını 2 artırmaya yarar (i=i+2)
            // bu döngü tek sayıları bize verir
            // çift sayıları yazdırmak istersek i'yi 0 veya herhangi bir çift sayıdan başlatabiliriz.

            System.out.println(i);
        }
        System.out.println("Döngü Bitti");



        // WHILE DÖNGÜSÜ  -----------------------------------------------------------

        // for ve while döngüleri ile hemen hemen aynı şeylre yapılabilir.

        int i = 1;
        while(i<10){
            // bir bloğun içinde tanımlanan değer sadece tanımlandığı blok için tanımlanmıştır.
            // yeni bir bloğa geçince yeni bir i tanımlarız.
            // burada "i 10'dan küçük olduğu sürece bu işlem devam etsin" demiş oluyoruz.

            System.out.println(i);

            //i daima 10'dan küçük olduğundan dolayı sistem sonsuz döngüye girer
            // bunu engellemek için aşağıdaki ifadeyi ekleriz.

            i++;  // veya;
            i = i+2;
        }
        System.out.println("while döngüsü bitti");



        // DO-WHILE DÖNGÜSÜ  ---------------------------------------------------------

        // while döngüsü ile aynı işlevi görür.
        // ne şartı karşılayan fonksiyon önce yazılır.
        // önce üstteki fonksiyon uygulanır,sonra şarta uygunsa diğerleri de uygulanır.
        // while döngüsünden farkı, şart sağlanmasa bile fonksiyon 1 kere çalışır.

        int A = 1;
        do{
            System.out.println(A);
            A++;
        }while(A<10);
        System.out.println("Do-While döngüsü bitti");
    }
}