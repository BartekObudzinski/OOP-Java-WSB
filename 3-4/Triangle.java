package cwiczenia34;
/*
 * Stw�rz klas� Trojkat i dodaj do niej metody do obliczania
 *  obwodu, pola powierzchni i sprawdzania 
 *  czy z podanych 3 bok�w mo�na rzeczywi�cie utworzy� tr�jk�t. 
 */
class Triang
{
	
	public int obwod(int a, int b, int c)
	{
		return a+b+c;
	}
	public int pole(int a, int h)
	{
		return (a*h)/2;
	}
	
	public boolean BuildTriangle(int a,int b, int c) 
	{
		if(a+b>c && a+c>b && b+c >a)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
}

public class Triangle {

	public static void main(String[] args) {
		int a= 5;
		int b=6;
		int c=5;
		int h=3;
		
		Triang t = new Triang();
		
		if(t.BuildTriangle(a, b, c)==true)
		{
			System.out.println("We can build");
		}
		else 
		{
			System.out.println("We can't build");
		}
		
		System.out.println("Pole tr�jk�ta "+ t.pole(a, h));
		System.out.println("Obw�d tr�jk�ta "+ t.obwod(a, b, c));
		

	}

}
