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
	final void trasa() {
		trasa /=100;
		System.out.println("Jadac 100 na godzine pokonasz trase w "+trasa+" godzin");
	}
}
class Sedan extends Pojazd
{
	protected double spalanie;
	protected double spalanie2;
	Sedan(int paliwo,int spalanie, int trasa)
	{
		super(paliwo, trasa);
		spalanie2= spalanie *1.4;
	}
	void wypiszDane()
	{
		spalanie = trasa/12.5;
		paliwo -= spalanie;
		System.out.println("Pokonał trase "+trasa+"km i w baku zostalo "+paliwo+" litrow");
		System.out.println("Spalanie w miescie wynosi "+ spalanie2);
		System.out.println("Spalanie w trasie wynosi"+spalanie);
		
	}
	
}

public class samochodzik {


	public static void main(String[] args) {
		Sedan sed = new Sedan(80,6,200);
		sed.wypiszDane();
		Pojazd sed1 = new Pojazd(80,600);
		sed1.ilePaliwa();
		sed1.trasa();
		

	}

}
