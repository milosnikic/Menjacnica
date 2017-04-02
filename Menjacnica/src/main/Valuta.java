package main;

import java.util.GregorianCalendar;

public class Valuta {
	
	private String naziv;
	private String skraceniNaziv;
	private GregorianCalendar datum;
	private double kupovni;
	private double srednji;
	private double prodajni;
	
	
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		if (naziv != null && !naziv.isEmpty()) {
			this.naziv = naziv;
		}else {
			throw new RuntimeException("Naziv ne sme biti null ili prazan string");
		}
	}
	public String getSkraceniNaziv() {
		return skraceniNaziv;
	}
	public void setSkraceniNaziv(String skraceniNaziv) {
		if (skraceniNaziv != null && !skraceniNaziv.isEmpty()) {
			this.skraceniNaziv = skraceniNaziv;
		}else {
			throw new RuntimeException("Naziv ne sme biti null ili prazan string");
		}
	}
	public GregorianCalendar getDatum() {
		return datum;
	}
	public void setDatum(GregorianCalendar datum) {
		if (datum.after(new GregorianCalendar())) {
			this.datum = datum;
		}else {
			throw new RuntimeException("Datum mora biti u buducnosti!");
		}
	}
	public double getKupovni() {
		return kupovni;
	}
	public void setKupovni(double kupovni) {
		if (kupovni >= 0) {
			this.kupovni = kupovni;
		}else {
			throw new RuntimeException("Kurs mora biti veci ili jednak od nule!");
		}
	}
	public double getSrednji() {
		return srednji;
	}
	public void setSrednji(double srednji) {
		if (srednji >= 0) {
			this.srednji = srednji;
		}else {
			throw new RuntimeException("Kurs mora biti veci ili jednak od nule!");
		}
	}
	public double getProdajni() {
		return prodajni;
	}
	public void setProdajni(double prodajni) {
		if (prodajni >= 0) {
			this.prodajni = prodajni;
		}else {
			throw new RuntimeException("Kurs mora biti veci ili jednak od nule!");
		}
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((datum == null) ? 0 : datum.hashCode());
		long temp;
		temp = Double.doubleToLongBits(kupovni);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((naziv == null) ? 0 : naziv.hashCode());
		temp = Double.doubleToLongBits(prodajni);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((skraceniNaziv == null) ? 0 : skraceniNaziv.hashCode());
		temp = Double.doubleToLongBits(srednji);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Valuta other = (Valuta) obj;
		if (datum == null) {
			if (other.datum != null)
				return false;
		} else if (!datum.equals(other.datum))
			return false;
		if (Double.doubleToLongBits(kupovni) != Double.doubleToLongBits(other.kupovni))
			return false;
		if (naziv == null) {
			if (other.naziv != null)
				return false;
		} else if (!naziv.equals(other.naziv))
			return false;
		if (Double.doubleToLongBits(prodajni) != Double.doubleToLongBits(other.prodajni))
			return false;
		if (skraceniNaziv == null) {
			if (other.skraceniNaziv != null)
				return false;
		} else if (!skraceniNaziv.equals(other.skraceniNaziv))
			return false;
		if (Double.doubleToLongBits(srednji) != Double.doubleToLongBits(other.srednji))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Valuta [naziv=" + naziv + ", skraceniNaziv=" + skraceniNaziv + ", datum=" + datum + ", kupovni="
				+ kupovni + ", srednji=" + srednji + ", prodajni=" + prodajni + "]";
	}
	
		
}
