
public class CalatoriTren {

	public static void main(String[] args) {

		Vagon vagon1 = new CalatoriA();
		Vagon vagon2 = new CalatoriB();
		Vagon vagon3 = new Marfa();
		Vagon vagon4 = new Marfa();

		Vagon[] vagoane = { vagon1, vagon2, vagon3 };

		Tren tren1 = new Tren(vagoane);

		Tren tren2 = new Tren(new Vagon[] { vagon1, vagon2, vagon3 });

		tren1.afisareTipVagoane();

		System.out.println(vagon1.getCapacitateColete() + " " + ((CalatoriA) vagon1).getCapacitatePasageri());

		if (tren1.equals(tren2))
			System.out.println("Egale");
		else
			System.out.println("Nu sunt egale");
	}
}
