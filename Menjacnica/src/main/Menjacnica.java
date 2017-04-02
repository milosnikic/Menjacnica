package main;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import interfejs.MenjacnicaInterfejs;

public class Menjacnica implements MenjacnicaInterfejs {

	private LinkedList<Valuta>kursevi 

				= new LinkedList<Valuta>();
	@Override
	public void dodajKurs(String naziv, String skraceniNaziv, GregorianCalendar datum, double prodajni, double srednji,
			double kupovni) {
		Valuta novi = new Valuta();
		novi.setNaziv(naziv);
		novi.setSkraceniNaziv(skraceniNaziv);
		novi.setDatum(datum);
		novi.setProdajni(prodajni);
		novi.setKupovni(kupovni);
		novi.setSrednji(srednji);
		
		
		kursevi.add(novi);


	}

	@Override
	public void obrisiKurs(String naziv, String skraceniNaziv, GregorianCalendar datum) {
		for (int i = 0; i < kursevi.size(); i++) {
			Valuta prolaz = kursevi.get(i);
			if(prolaz.getNaziv().equals(naziv)	&&	 prolaz.getSkraceniNaziv().equals(skraceniNaziv)	&&	prolaz.getDatum().equals(datum)){
				kursevi.remove(i);
			}
				
		}
	}

	@Override
	public Valuta pronadjiKurs(String naziv, String skraceniNaziv, GregorianCalendar datum) {
		for (int i = 0; i < kursevi.size(); i++) {
			Valuta prolaz = kursevi.get(i);
			if(prolaz.getNaziv().equals(naziv) && prolaz.getSkraceniNaziv().equals(skraceniNaziv) && prolaz.getDatum().equals(datum))
				return prolaz;
		}
		return null;
	}

}
