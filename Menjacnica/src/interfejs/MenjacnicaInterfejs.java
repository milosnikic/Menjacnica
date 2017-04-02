package interfejs;

import java.util.GregorianCalendar;

import main.Valuta;

public interface MenjacnicaInterfejs {

	public void dodajKurs(String naziv, String skraceniNaziv, GregorianCalendar datum, double prodajni, double srednji, double kupovni);
	public void obrisiKurs(String naziv, String skraceniNaziv, GregorianCalendar datum);
	public Valuta pronadjiKurs(String naziv, String skraceniNaziv, GregorianCalendar datum);
	
}
