public class Main {
    public static void main(String[] args) {

        // switch blokları if bloklarına göre çok daha az kullanılır.
        // switch ile dallandırma yapılır.

        char grade = 'F';

        switch (grade){
            case 'A': // eğer durum A ise bunu gerçekleştir demek
                System.out.println("Mükemmel : geçtiniz");
                break ;

            case 'B':
                System.out.println("Çok Güzel : geçtiniz");
                break ;

            case 'C':
                System.out.println("İyi : geçtiniz");
                break ;

            case 'D':
                System.out.println("Fena değil : geçtiniz");
                break ;

            case 'F':
            case 'G': // peş peşe yazarsak aynı çıktıyı verirler
                System.out.println("Malesef : Kaldınız");
                break ;

            default:
                // default ise yukarıdaki değerler dışında bir değer girilirse kullanılr.
                // else gibi
                System.out.println("Geçersiz Not Girdiniz !");
        }
    }
}