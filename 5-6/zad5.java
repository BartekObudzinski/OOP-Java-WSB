package cwiczenia56;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class zad5 {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a,b;
		System.out.println("podaj dwa wyrazy");
		System.out.println("wyraz 1");
		a = sc.next();
		System.out.println("wyraz 2");
		b = sc.next();
		int dlA = a.length();
		int dlB = b.length();
		if(dlA==dlB)
		{
			char znaki1[] = new char[dlA];
			znaki1 = a.toCharArray();
			char znaki2[] = new char[dlB];
			znaki2 = b.toCharArray();
			Arrays.sort(znaki1);
			Arrays.sort(znaki2);
			boolean takieSame = false;
			for(int i=0; i<dlA;i++)
			{
				if(znaki1[i]==znaki2[i])
				{
					takieSame=true;
				}
				else
				{
					takieSame = false;
				}
				
			}
			if(takieSame==true)
				System.out.println("Podane wyrazy to anagramy");
			else
				System.out.println("Podane wyrazy to nie anagramy");
		}
		else
		{
			System.out.println("Podane wyrazy to nie anagramy");
		}
		
		
		
	}

}
