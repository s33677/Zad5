import java.util.ArrayList;

public class SystemRezerwacji {
    private ArrayList<Wydarzenie> wydarzenia = new ArrayList<Wydarzenie>();
    private ArrayList<Klient> klienci = new ArrayList<Klient>();

    public void dodajWydarzenie(Wydarzenie wydarzenie) {
        wydarzenia.add(wydarzenie);
    }
    public void dodajWydarzenie(String nazwa, String nazawna, double cena ) {
        Wydarzenie wydarzenie = new Wydarzenie(nazwa, nazawna, cena);
        wydarzenia.add(wydarzenie);
    }
    public void dodajKlienta(Klient klient) {
        klienci.add(klient);
    }
    public void dodajKlienta(String nazwa, String nazwisko, int wiek ) {
        Klient klient = klienci.get(wiek);
        klienci.set(wiek, klient);
    }
    public void dokonajRezerwacji(Klient klient, Wydarzenie wydarzenie) {
        if ( wydarzenie.getDostepneMiejsca()>0){
            klient.dodajRezerwacje(wydarzenie);
        }
    }
    public Wydarzenie znajdzWydarzenie(String nazwa){
        for ( Wydarzenie w: wydarzenia){
            if (w.getNazwa().equals(nazwa)){
                return w;
            }
        }return null;
    }
    public Klient znajdzKlienta(String nazwa){
        for ( Klient k: klienci){
            if (k.getImie().equals(nazwa)){
                return k;
            }
        }return null;
    }
    public void zmiezCeneWydarzenia(String nazwa, double nowaCena){
        for ( Wydarzenie w: wydarzenia){
            if (w.getNazwa().equals(nazwa)){
                w.setCena(nowaCena);
            }
        }
    }






}
