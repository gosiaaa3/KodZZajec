package pl.sda.kolkoikrzyzyk;

import java.util.HashMap;
import java.util.Map;

public class KolkoIKrzyzyk {

	public static void main(String[] args) {
		// KolkoIKrzyzykInterface kolkoIKrzyzykInterface = new
		// KolkoIKrzyzykInterface();
		// int menu = kolkoIKrzyzykInterface.menu();
		// String gracz1 = kolkoIKrzyzykInterface.podajImie();
		// String gracz2 = kolkoIKrzyzykInterface.podajImie();
		// int pozycja = kolkoIKrzyzykInterface.podajPole(gracz1);
		// Plansza plansza = new Plansza();
		// boolean czyWstawiono = plansza.wstawZnak("X", pozycja);
		// czyWstawiono = plansza.wstawZnak("O", pozycja);
		KolkoIKrzyzykInterface kolkoIKrzyzykInterfejs = new KolkoIKrzyzykInterface();
		Plansza plansza = new Plansza();
		int menu = kolkoIKrzyzykInterfejs.menu();
		Map <String, String> mapaGraczy = new HashMap<>();
		String gracz1 = kolkoIKrzyzykInterfejs.podajImie();
		String gracz2 = kolkoIKrzyzykInterfejs.podajImie();
		mapaGraczy.put(gracz1,"X");
		mapaGraczy.put(gracz2,"O");
		
		for (int i = 0; i < 9; i++) {
			kolkoIKrzyzykInterfejs.pokazPlansze(plansza);
			boolean czyWstawiono;
			String aktualnyGracz = null; //ustawiamy nowa zmienna apozniej if sprawdzajacy indeksy parzyste i nieparzyste
			String wstawiamyZnak = null;
			if (i%2 ==0){
				aktualnyGracz= gracz1;
				
			}else{
				aktualnyGracz = gracz2;
			}
			wstawiamyZnak = mapaGraczy.get(aktualnyGracz);
			do {
				int pozycja = kolkoIKrzyzykInterfejs.podajPole(aktualnyGracz);
				czyWstawiono = plansza.wstawZnak(wstawiamyZnak, pozycja);
				if (!czyWstawiono) {
					kolkoIKrzyzykInterfejs.podanoNiepoprawnePole();
					// System.out.println("Wybrano złe pole"); // bedzie
					// przeniesieone
					// do interface

				}
			} while (!czyWstawiono);
			if(KolkoIKrzyzykUtil.czyzakonczonoGre(plansza)){
				kolkoIKrzyzykInterfejs.pokazPlansze(plansza);
				kolkoIKrzyzykInterfejs.wygranoGre(aktualnyGracz);
				break;
				
				
			}
		}
		kolkoIKrzyzykInterfejs.pokazPlansze(plansza);
		// int pozycja = kolkoIKrzyzykInterfejs.podajPole(gracz1);
		// boolean czyWstawiono = plansza.wstawZnak("X", pozycja);
		//
		// pozycja = kolkoIKrzyzykInterfejs.podajPole(gracz2);
		// czyWstawiono = plansza.wstawZnak("O", pozycja);
	}

}
