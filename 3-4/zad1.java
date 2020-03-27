package cwiczenia34;

import java.util.Random;

/*
 * Wygeneruj losow¹ tablicê liczb i podziel jej wartoœci przez 2. 
 * Wyœwietl wynik przed i po dzieleniu. 
 */
public class zad1 {

	public static void main(String[] args) {
	
	int tab[] = new int[10];
	Random random = new Random();	
	System.out.println("Wygenerowane losowe liczby do tablicy: ");
	for(int i=0;i<10;i++)
	{
		tab[i] = random.nextInt(100);
		System.out.print(i+1+"."+tab[i] + " ");
	}
	System.out.println("\nWygenerowane losowe liczby do tablicy podzielone przez 2: ");
	for(int i=0;i<10;i++)
	{
		System.out.print(i+1+"."+tab[i]/2 + " ");
	}
	}

}
