package cwiczenia34;

import java.util.Random;
/*
 *Stw�rz tablic� dwuwymiarow�, 
 *gdzie rozmiar ka�dego wiersza b�dziesz losowa� z zakresu od 5 do 10. 
 *Tablic� wype�nij dowolnymi liczbami ca�kowity. Wy�wietl wynik.  
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
