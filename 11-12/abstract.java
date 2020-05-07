
abstract class Rower{
	Rower()
	{
		System.out.println("Jest i Rower!");
	}
	abstract void jedz();
	void biegi()
	{
		System.out.println("Bieg zmieniony");
	}
}

class Auto extends Rower{
	void jedz() {
		System.out.println("No to w drogę!");
	}

}

public class zadanie1112 {

	public static void main(String[] args) {
		Rower obj = new Auto();
		obj.jedz();
		obj.biegi();

	}

}
