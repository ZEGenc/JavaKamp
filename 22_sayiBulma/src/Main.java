public class Main {
    public static void main(String[] args) {
        int[] sayilar = new int[] {1,2,5,7,9,0};
        int aranacak = 5;

        String buradaMi = "Burada Değil";
        for(int i:sayilar){
            if (i == aranacak){
                buradaMi = "Burada";
                break;
            }
        }
        System.out.println(buradaMi);
    }
}