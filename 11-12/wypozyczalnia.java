interface Wypozyczalnia
{
	 public void nazwa();
	 public void autor();
	 static void informacja()
	 {
		 System.out.println("Witamy w Wypozyczalni!");
	 }
	
}
interface salaKinowa extends Wypozyczalnia
{
	void ogladajFilm();
	default void wezPrzekaski()
	{
		System.out.println("Chipsy, popcorn, pepsi");
	}
}
class seansFilmowy implements salaKinowa
{
	public void ogladajFilm()
	{
		System.out.println("Włączam film i rozsiadam się w fotelu");
	}
	public void nazwa() 
	{
		System.out.println("Włączam Harrego Pottera");
	}
	public void autor()
	{
		System.out.println("Reżyseri Chris Columbus");
	}
}
class Film implements Wypozyczalnia
{
	
	public void nazwa()
	{
		System.out.println("Kogel-Mogel");
	}
	public void autor()
	{
		System.out.println("Roman Załuski");
	}
}
class Muzyka implements Wypozyczalnia
{
	public void nazwa()
	{
		System.out.println("Disco Polo");
	}
	public void autor()
	{
		System.out.println("Zenek Martyniuk");
	}
}
public class olimpiada {

	
	public static void main(String[] args) {
		Wypozyczalnia.informacja();
		seansFilmowy widz = new seansFilmowy();
		widz.ogladajFilm();
		widz.nazwa();
		widz.autor();
		Wypozyczalnia obj = new Film();
		obj.nazwa();
		obj.autor();
		Wypozyczalnia obj1 = new Muzyka();
		obj1.nazwa();
		obj1.autor();
	}

}
