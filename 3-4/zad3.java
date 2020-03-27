package cwiczenia34;

import java.util.Random;
/*
 *Stwórz tablicê dwuwymiarow¹, 
 *gdzie rozmiar ka¿dego wiersza bêdziesz losowaæ z zakresu od 5 do 10. 
 *Tablicê wype³nij dowolnymi liczbami ca³kowity. Wyœwietl wynik.  
 */
public class zad3 {

	public static void main(String[] args) {
		
		int tablica[][] = new int[10][10];
		Random random = new Random();
		for(int i=0;i<10;i++)
		{
			int randomLength = random.nextInt(6)+5;
			for(int j=0;j<randomLength;j++)
			{
				tablica[i][j]= random.nextInt(100);
				System.out.print(tablica[i][j]+" ");
			}
			System.out.println();
		}

	}

}
