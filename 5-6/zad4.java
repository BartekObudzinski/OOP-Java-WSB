package cwiczenia56;

import java.util.Scanner;

public class zad4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nazwa = sc.nextLine();
		String reverse = "";
		for(int i = nazwa.length() -1;i>=0;i--)
		{
			reverse += nazwa.charAt(i);
		}
		
		if(nazwa.equals(reverse))
		{
			System.out.println("Wyraz jest palindromem");
		}
		else
		{
			System.out.println("Wyraz nie jest palindromem");
		}

	}
	

}
