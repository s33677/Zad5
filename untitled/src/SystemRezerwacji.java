import java.util.ArrayList;
import java.util.List;

public class SystemRezerwacji {
    private List<Wydarzenie> wydarzenia;
    private List<Klient> klienci;

    public SystemRezerwacji() {
        wydarzenia = new ArrayList<>();
        klienci =new ArrayList<>();
    }
    public void dodajWydarzenia(Wydarzenie wydarzenie) {
        wydarzenia.add(wydarzenie);
    }
    public void dodajWydarzenia() {
    }
    public void dodajKlient(Klient klient) {
        klienci.add(klient);
    }
    public void dodajKlient() {

    }
    public void dokonajRezerwacji(Klient klient, Wydarzenie wydarzenie) {
        wydarzenie.zarezerwujMiejsce();
        klienci.add(klient);
    }







}
