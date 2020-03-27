package cwiczenia34;
/*
 * Stwórz tabelê typu kalendarz na jeden miesi¹c
 *  i wpisz do niej liczbê godzin spêdzanych na studiach. 
 *  Wykorzystaj do tego tablicê dwuwymiarow¹. Wynik wyœwietl w konsoli. 
 */
public class zad2 {
	public static void main(String[] args) {
		int[][] calendar = new int[5][7];
		System.out.println("Kalendarz");
		int day = 1;
		for(int i=0;i<5;i++) {
			
			for(int j=0;j<7;j++) {
				day++;
				if(day == 2) {
					calendar[i][j] = 8;
				}
				else if (day == 3) {
					calendar[i][j] = 4;
					//day++;
				}
				else if(day == 4) {
					calendar[i][j] = 10;
					//day++;
				}
				else {
					calendar[i][j] = 0; 
					//day++;
				}
				System.out.print(calendar[i][j]+" ");
				if(day > 7) {
					day = 1;
					System.out.println();
				}
				
			}
			System.out.println();
		}
		
	}
}