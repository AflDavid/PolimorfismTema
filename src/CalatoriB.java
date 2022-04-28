
public class CalatoriB extends VagonCalator {

	public CalatoriB() {
		super();
		this.capacitatePasageri = 50;
		this.capacitateColete = 400;

	}

	public void blocareGeamuri() {
		System.out.println("Geamurile s-au inchis");
	}

	public String tipVagon() {
		return "Vagon de tip calatori B";
	}

}
