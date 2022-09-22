public class Main {
    public static void main(String[] args) {
        // multidimensional arrays
        // çok boyutlu diziler birden fazla satırdan ve sütundan oluşan dizilerdir.
        // matris yapıılarına benzerler.

        String[][] sehirler = new String[3][3];
        sehirler[0][0] = "İstanbul";
        sehirler[0][1] = "Bursa";
        sehirler[0][2] = "Bilecik";
        sehirler[1][0] = "Ankara";
        sehirler[1][1] = "Konya";
        sehirler[1][2] = "Kayseri";
        sehirler[2][0] = "Diyarbakır";
        sehirler[2][1] = "Şanlıurfa";
        sehirler[2][2] = "Gaziantep";

        // şu şekilde de göserilebilir;
        String[][] Sehirler = {{"İstanbul","Bursa","Bilecik"} , {"Ankara","Konya","Kayseri"} , {"Diyarbakır","Şanlıurfa","Gaziantep"}};


        // iç içe array'lerin tüm elemanlarını yazdırmak için yine iç içe loop'lar kullanabiliriz
        // bu yapılara nested loops denir
        for (int i = 0 ; i<3 ; i++){
            for(int j = 0 ; j < 3 ; j++){
                System.out.println(sehirler[i][j]);
            }
        }
    }
}