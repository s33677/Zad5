import java.util.ArrayList;

public class Klient {
    private String imie;
    private String nazwisko;
    private String email;
    private ArrayList<Wydarzenie> listarezerwacji;

    public Klient(String imie, String nazwisko, String email) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.email = email;
    }
    public Klient(String imie, String nazwisko, String email, ArrayList<Wydarzenie> listarezerwacji) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.email = email;
        this.listarezerwacji = listarezerwacji;
    }
    public String getImie() {
        return imie;
    }
    public String getNazwisko() {
        return nazwisko;
    }
    public String getEmail() {
        return email;
    }
    public ArrayList<Wydarzenie> getListarezerwacji() {
        return listarezerwacji;
    }
    public void setImie(String imie) {
        this.imie = imie;
    }
    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void dodajRezerwacje(Wydarzenie wydarzenie) {
        listarezerwacji.add(wydarzenie);
    }
    public void wyswietlRezerwacje(){
        for (int i = 0; i < listarezerwacji.size(); i++) {
            System.out.println(listarezerwacji.get(i));
        }
    }
    public void anulujRezerwacje(Wydarzenie wydarzenie) {
        listarezerwacji.remove(wydarzenie);
    }

}




