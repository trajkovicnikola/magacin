package magacin;

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

}
