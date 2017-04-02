package main;

import java.util.GregorianCalendar;

import interfejs.MenjacnicaInterfejs;

public class Menjacnica implements MenjacnicaInterfejs {

	@Override
	public void dodajKurs(String naziv, String skraceniNaziv, GregorianCalendar datum, double prodajni, double srednji,
			double kupovni) {
		// TODO Auto-generated method stub

	}

	@Override
	public void obrisiKurs(String naziv, String skraceniNaziv, GregorianCalendar datum) {
		// TODO Auto-generated method stub

	}

	@Override
	public Valuta pronadjiKurs(String naziv, String skraceniNaziv, GregorianCalendar datum) {
		// TODO Auto-generated method stub
		return null;
	}

}
