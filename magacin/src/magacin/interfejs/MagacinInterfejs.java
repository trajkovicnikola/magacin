package magacin.interfejs;

import magacin.Artikal;

public interface MagacinInterfejs {
	
	public void dodajArtikal(Artikal a);
	
	public void izbaciArtikal(Artikal a);
	
	public Artikal pretraziArtikal(String naziv);

}
