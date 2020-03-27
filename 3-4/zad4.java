package cwiczenia34;

import java.util.Scanner;
/*
 * Stwórz klasê Waluty i dodaj do niej metody, 
 * które bêd¹ przeliczaæ kilka walut ze z³otych na inn¹ walutê i odwrotnie. 
 */
class Waluty
{
	public double plnEuro(double price)
	{
		double valueEuro = 0.22;
		return price * valueEuro;
	}
	
	public double plnPound(double price)
	{
		double valuePound = 0.20;
		return price * valuePound;
	}
	
	public double euroPln(double price)
	{
		double valuePln = 4.59;
		return price * valuePln;
	}
	
	public double poundPln(double price)
	{
		double valuePln = 4.98;
		return price * valuePln;
	}
	
}
public class zad4 {
	
	public static void main(String[] args) {
		Waluty value = new Waluty();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Podaj wartosc jaka chcesz zamienic");
		int money = scanner.nextInt();
		System.out.println("1. pln na euro \n 2. pln na funty  \n 3. funty na pln  \n 4. euro na pln \n 5. wyjscie z programu ");
		while(true) {
		int choice = scanner.nextInt();
		
		switch(choice) {
			case 1:
				System.out.println(value.plnEuro(money)+" euro");
				break;
			case 2:
				System.out.println(value.plnPound(money)+" funtów");
				break;
			case 3:
				System.out.println(value.poundPln(money)+" z³otych");
				break;
			case 4:
				System.out.println(value.euroPln(money)+" z³otych");
				break;
		}
		if(choice == 5) {
			break;
		}
		}
	}

}
