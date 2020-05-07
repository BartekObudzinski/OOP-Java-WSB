package cwiczenia56;

import java.util.Scanner;

public class zad8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nazwa1 = sc.nextLine();
		String nazwa = (nazwa1.replaceAll(" ","")).toLowerCase();
		String reverse = "";
		for(int i = nazwa.length() -1;i>=0;i--)
		{
			reverse += nazwa.charAt(i);
		}
		
		if(nazwa.equals(reverse))
		{
			System.out.println("zdanie jest palindromem");
		}
		else
		{
			System.out.println("zdanie nie jest palindromem");
		}
		System.out.println(nazwa+" "+reverse);

	}

}
