package cwiczenia56;

import java.util.Scanner;
import java.util.Random;
public class zad6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj liczbe");
		int firstNumber = sc.nextInt();
		
		
		for(int i =0;i<10;i++)
		{
			Random r = new Random();
			int randomNumber = r.nextInt(20-1+1)+1;
			firstNumber -= randomNumber;
		}
		if(firstNumber>0)
		{
			System.out.println("+");
		}
		else
		{
			System.out.println("-");
		}
	System.out.println(firstNumber);
	}

}
