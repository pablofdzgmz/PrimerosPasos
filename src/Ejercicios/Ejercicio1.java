package Ejercicios;

public class Ejercicio1 {

	public static void main(String[] args) {
		String coleccionpares[]=new String[20];
		int contadorpares=0;
		int coleccionprimos[]=new int[20];
		int contadorprimos=0;
		int sumaprimos=0;
		for(int i=0;i<COLECCION.length;i++) {
			for(int j=0;j<COLECCION[i].length;j++) {
				if(COLECCION[i][j].getClass().toString().equals("class java.lang.String")) {
					if((COLECCION[i][j].toString().length())%2==0) {
						coleccionpares[contadorpares]=""+COLECCION[i][j].toString();
						contadorpares++;
					}
				}else {
					if(esPrimo((int)COLECCION[i][j])) {
						coleccionprimos[contadorprimos]=(int)COLECCION[i][j];
						contadorprimos++;
					}
				}
			}		
		}
		for(int k=0;k<contadorpares;k++) {
			System.out.print(""+coleccionpares[k].charAt(0));
		}
		System.out.println();
		for(int h=0;h<contadorprimos;h++) {
			sumaprimos+=coleccionprimos[h];
		}
		System.out.print(""+sumaprimos);
	}
	
	private static final Object[][] COLECCION = {
			{"ASTURIAS", "TARRASA", 3, 4, "CARTAGENA", "PAMPLONA", 7, "ALMERÍA", "REUS", 15, 
			"FUENLABRADA", "LOGROÑO", 17, 19, "BADAJOZ", "ORENSE", 21},
			{23, 27, "SANTANDER", "BILBAO", "PARLA", 31, "AVILÉS", 49, "ALGECIRAS", 
			"RONCESVALLES", 51, "BARACALDO", 57, 63, 77, "ALBACETE", "SITGES"}
			};
	
	public static boolean esPrimo(int num) {
	    boolean primo = true; 
	    for(int i = 2; i < num; i++) {
	        if (num % i == 0) {
	            primo = false;
	            break;
	        }
	    }
	    return primo;
	}
}
