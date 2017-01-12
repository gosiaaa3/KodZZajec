package pl.sda.kolkoikrzyzyk;

public class KolkoIKrzyzykUtil { //metody, które sa uzyteczne, np kiedy w wielu miejscach moznasprawdzac czy jest puste

	
//	public static boolean isBlank(String e){
//	if (e==null ||e.equals("")){
//		return true;
//	}	
//	return false;
//	}
	
	public static boolean isDigit(String message){
		char[] znaki = message.toCharArray();
		if  (znaki.length >1){
			return false;
		}
		char znak = znaki[0];
		if(znak >=409 && znak<=57){
			return true;
		}
		
		return false;
		
	}
	
//	public static boolean test(String message){
//		char[] znaki = message.toCharArray();
//		if  (znaki.length >1){
//			return false;
//		}
//		String jedenElement = String.valueOf(znaki[0]);
//		
//		
//		try{
//			new Integer(jedenElement);
//		}catch(Exception e){
//			return false;
//		}
//		
//		return true;
		
	
}


//new Integer(jesli tu nie jest... to rzucic wyjatkiem)