package cwiczenia34;

import java.util.Scanner;
/*
 * Stwórz klasê Jednostki miary i dodaj do niej metody, 
 * które bêd¹ przeliczaæ 
 * np. metry, kilometry i milimetry bêd¹ podawaæ w cm lub kilometry,
 *  metry bêdzie przeliczaæ na mile itd. 
 */
class Measure
{
	public double kmMiles(int km)
	{
		double miles = 0.621371192;
		return km * miles;
	}
	
	public double milesKm(int miles)
	{
		double km = 1.609344;
		return miles * km;
	}
}
public class zad5 {

	public static void main(String[] args) {
		Measure m = new Measure();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Podaj wartoœæ");
		int value = scanner.nextInt();
		
		System.out.println("Mile na kilometry "+m.milesKm(value));
		System.out.println("Kilometry na mile "+m.kmMiles(value));
	}

}
