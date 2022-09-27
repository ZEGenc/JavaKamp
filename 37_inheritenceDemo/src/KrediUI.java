public class KrediUI {
    public void KrediHesapla(BaseKrediManager baseKrediManager){
        // tüm kredi manager'lar base manager'a bağlı olduğu için onu bağladık
        // buna injection denir

        baseKrediManager.Hesapla();
    }
}
