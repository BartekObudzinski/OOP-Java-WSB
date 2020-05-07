package cwiczenia56;

import java.util.Calendar;
import java.util.Formatter;

public class zad1 {

	public static void main(String[] args) {
		Formatter data = new Formatter();
		Calendar dzis = Calendar.getInstance();
		data.format("%td \n%tB  \n%tY \n%tR", dzis, dzis, dzis, dzis);
		System.out.println(data);
		data.close();

	}

}
