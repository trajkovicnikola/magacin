package magacin;

import java.util.List;

import magacin.interfejs.MagacinInterfejs;

public class Magacin implements MagacinInterfejs {

	private List<Artikal> artikli;

	@Override
	public void dodajArtikal(Artikal a) {
		if (!artikli.contains(a))
			artikli.add(a);

	}

	@Override
	public void izbaciArtikal(Artikal a) {
		artikli.remove(a);

	}

	@Override
	public Artikal pretraziArtikal(String naziv) {
		for (Artikal a : artikli)
			if (a.getNaziv().equals(naziv))
				return a;
		return null;
	}

}
