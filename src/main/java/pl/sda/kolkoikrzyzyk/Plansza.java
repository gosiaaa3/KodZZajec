package pl.sda.kolkoikrzyzyk;

public class Plansza {// tworzymy plansze
	private String[] pola; // mogloby byc char ale lepiej Stringi, tytaj w tej
							// tablicy beda zapisywane o i x w zaleznosci od
							// uzytkownika

	public Plansza() {
		pola = new String[9];
		for(int i=1; i<=pola.length; i++){  //zamieniamy w ten sposób bo zmienilismy sprawdzanie z null na liczbe
			pola[i-1]= String.valueOf(i);
		}
	}

	public boolean wstawZnak(String znak, int pozycja) {
		// metoda do zapisywania znaku w planszy
		if (KolkoIKrzyzykUtil.isDigit((pola[pozycja-1]))) //tu zmienilismy
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
			if (KolkoIKrzyzykUtil.isDigit(pola[i])) {
				stringBuilder.append(i+1);
			} else {
				stringBuilder.append(pola[i]);//np.jesli null lub cos innego
			}
			stringBuilder.append("|");
		}
		return stringBuilder.toString();
	}

}
