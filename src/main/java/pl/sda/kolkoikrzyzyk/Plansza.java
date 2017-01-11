package pl.sda.kolkoikrzyzyk;

public class Plansza {// tworzymy plansze
	private String[] pola; // mogloby byc char ale lepiej Stringi, tytaj w tej
							// tablicy beda zapisywane o i x w zaleznosci od
							// uzytkownika

	public Plansza() {
		pola = new String[9];
	}

	public boolean wstawZnak(String znak, int pozycja) {
		// metoda do zapisywania znaku w planszy
		if (pola[pozycja - 1] != null)
			return false;// nie jest rozne
		pola[pozycja - 1] = znak;
		return true;
		// czy na pozycji jest juz znak, jezeli jest znak return false, jezeli
		// nie ma znaku, dodajem

		// jezeli cos sie staie to wto wejdzie, jesli, nie to przejdzie dalej
	}

	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < pola.length; i++) {
			if (i != 0 && i % 3 == 0) {
				stringBuilder.append("\n");
				stringBuilder.append("-----");
				stringBuilder.append("\n");
			}
			if (pola[i] == null) {
				stringBuilder.append(" ");
			} else {
				stringBuilder.append(pola[i]);
			}
			stringBuilder.append("|");
		}
		return stringBuilder.toString();
	}

}
