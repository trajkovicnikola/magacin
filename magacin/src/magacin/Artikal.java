package magacin;

import java.util.Objects;

public class Artikal {

	private String naziv;
	private Long sifra;
	private String opis;
	private int kolicina;

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		if (naziv != null && !naziv.isEmpty())
			this.naziv = naziv;
	}

	public Long getSifra() {
		return sifra;
	}

	public void setSifra(Long sifra) {
		if (sifra != null)
			this.sifra = sifra;
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		if (opis != null && !opis.isEmpty())
			this.opis = opis;
	}

	public int getKolicina() {
		return kolicina;
	}

	public void setKolicina(int kolicina) {
		if (kolicina > 0)
			this.kolicina = kolicina;
	}

	@Override
	public int hashCode() {
		return Objects.hash(kolicina, naziv, opis, sifra);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Artikal other = (Artikal) obj;
		return kolicina == other.kolicina && Objects.equals(naziv, other.naziv) && Objects.equals(opis, other.opis)
				&& Objects.equals(sifra, other.sifra);
	}
	
	

}
