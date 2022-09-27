public class Customer extends Person{
    // extends Person ifadesi şu anlama gelir;
    // Customer class'ına bağlı nesneler Person class'ındaki fonksiyonları da kullanabilir
    // yani Customer'lar da Person'dur
    // her müşteri aynı zamanda bir kişidir. ve müşterideki özellilkerle beraber kişideki özellilkeri de barıdnırır
    // aynı işlem Employee içind de uygulandı.
    // bu şekilde ortak kullanılan fonksiyonları tek bir class'ta toplamış oluruz
    // class'ına geçiniz
    String email;
}
