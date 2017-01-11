package pl.sda.kolkoikrzyzyk;

public class KolkoIKrzyzyk {

	public static void main(String[] args) {
		KolkoIKrzyzykInterface kolkoIKrzyzykInterface =  new KolkoIKrzyzykInterface();
		int menu = kolkoIKrzyzykInterface.menu();
		String gracz1 = kolkoIKrzyzykInterface.podajImie();
		String gracz2 = kolkoIKrzyzykInterface.podajImie();
		int pozycja = kolkoIKrzyzykInterface.podajPole(gracz1);
		Plansza plansza = new Plansza();
		boolean czyWstawiono = plansza.wstawZnak("X", pozycja);
		czyWstawiono = plansza.wstawZnak("O", pozycja);
	}

}
