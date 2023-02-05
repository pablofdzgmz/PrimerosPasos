import javax.swing.*;

public class Uso_Arrays_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*String paises[]=new String[8];
		
		for(int i=0;i<8;i++) {
			paises[i]=JOptionPane.showInputDialog("Introduce pais "+(i+1));
		}*/
		/*paises[0]="España";
		paises[1]="Mexico";
		paises[2]="Colombia";
		paises[3]="Peru";
		paises[4]="Chile";
		paises[5]="Argentina";
		paises[6]="Ecuador";
		paises[7]="Venezuela";*/
		
		//otra forma de declarar el array
		//String [] paises={"España","Mexico","Colombia","Peru","Chile"};
		
		/*for (int i=0;i<paises.length;i++) {
			System.out.println("Pais "+i+1+" "+paises[i]);
		}*/
		
		//Otro tipo For para arrays (nuevo en java)
		/*for(String elemento:paises) {
			System.out.println("Pais: "+elemento);
			
		
		}*/
		int matriz_aleatorios[]=new int[150];
		
		for (int i=0; i<matriz_aleatorios.length;i++) {	
			matriz_aleatorios[i]=(int)Math.round(Math.random()*100);
		}
		for (int numeros:matriz_aleatorios) {
			System.out.print(numeros + " ");
		}
		
	}

}
