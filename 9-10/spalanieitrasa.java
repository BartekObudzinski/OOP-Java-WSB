class Pojazd
{
	protected int paliwo;
	protected int trasa;
	Pojazd(int paliwo, int trasa)
	{
		this.paliwo=paliwo;
		this.trasa = trasa;
	}
	final void ilePaliwa() {
		System.out.println("W baku jest "+paliwo+" litrow paliwa");
	}
}
class Sedan extends Pojazd
{
	protected double spalanie;
	Sedan(int paliwo, int trasa)
	{
		super(paliwo, trasa);
	}
	void wypiszDane()
	{
		spalanie = trasa/12.5;
		paliwo -= spalanie;
		System.out.println("Pokonał trase "+trasa+"km i w baku zostalo "+paliwo+" litrow");
	}
}

public class samochodzik {

	public static void main(String[] args) {
		Sedan sed = new Sedan(80,200);
		sed.wypiszDane();
		

	}

}
