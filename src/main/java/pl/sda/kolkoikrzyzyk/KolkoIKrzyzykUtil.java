package pl.sda.kolkoikrzyzyk;

public class KolkoIKrzyzykUtil { // metody, które sa uzyteczne, np kiedy w wielu
									// miejscach moznasprawdzac czy jest puste

	// public static boolean isBlank(String e){
	// if (e==null ||e.equals("")){
	// return true;
	// }
	// return false;
	// }

	public static boolean isDigit(String message) { // metody cos sprawdzajace
													// powinny zaczynac sie od
													// is
		char[] znaki = message.toCharArray();
		if (znaki.length > 1) {
			return false;
		}
		char znak = znaki[0];
		if (znak >= 409 && znak <= 57) {
			return true;
		}

		return false;

	}

	// public static boolean test(String message){
	// char[] znaki = message.toCharArray();
	// if (znaki.length >1){
	// return false;
	// }
	// String jedenElement = String.valueOf(znaki[0]);
	//
	//
	// try{
	// new Integer(jedenElement);
	// }catch(Exception e){
	// return false;
	// }
	//
	// return true;

	public static boolean sprawdzWiersze(Plansza plansza) { // sprawdzac czy pod
															// tymi trzema
		// jest ten sam znak
		// i+=3

		String[] pola = plansza.getPola();
		for (int i = 0; i < 9; i += 3)
			if (pola[i] == pola[i + 1] && pola[i] == pola[i + 2]) {
				return true;
			}
		return false;
	}
	public static boolean sprawdzWiersze2(Plansza plansza) {

		String[] pola = plansza.getPola();
		for (int i = 0; i < 3; i++) {
			String wzor = pola[i];
			if (wzor.equals(pola[i + 1]) && wzor.equals(pola[i + 2])) {
				return true;
			}

		}
		return false;
	}

	public static boolean sprawdzKolumny(Plansza plansza) {

		String[] pola = plansza.getPola();
		for (int i = 0; i < 9; i += 3)
			if (pola[i] == pola[i + 3] && pola[i] == pola[i + 6]) {
				return true;
			}
		return false;

	}

	public static boolean sprawdzKolumny2(Plansza plansza) {

		String[] pola = plansza.getPola();
		for (int i = 0; i < 3; i++) {
			String wzor = pola[i];
			if (wzor.equals(pola[i + 3]) && wzor.equals(pola[i + 6])) {
				return true;
			}

		}
		return false;
	}

	public static boolean sprawdzPrzekatne(Plansza plansza) {

		String[] pola = plansza.getPola();
		for (int i = 0; i < 3; i += 2)
			if (pola[i] == pola[i + 4] && pola[i] == pola[i + 8]) {
				return true;
			}
		return false;

	}

	public static boolean sprawdzPrzekatne2(Plansza plansza) {

		String[] pola = plansza.getPola();
		String wzor = pola[4];
		boolean naPierwszejPrzekatnej = wzor.equals(pola[0]) && wzor.equals(pola[8]);
		boolean naDrugiejPrzekatnej = wzor.equals(pola[2]) && wzor.equals(pola[6]);
		if (naPierwszejPrzekatnej || naDrugiejPrzekatnej) {
			return true;
		}
		return false;

	}

	public static boolean czyzakonczonoGre(Plansza plansza) {
		return sprawdzWiersze2(plansza) || sprawdzKolumny2(plansza) || sprawdzPrzekatne2(plansza);

	}
}
