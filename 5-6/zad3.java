package cwiczenia56;

import java.util.Formatter;

public class zad3 {

	public static void main(String[] args) {
		double dzielenie = 0;
		for(int i =1;i<=5;i++)
		{
			dzielenie = 1.0/i;
			Formatter  form = new Formatter();
			form.format("%2.5f", dzielenie);
			System.out.println(form);
		}

	}

}
