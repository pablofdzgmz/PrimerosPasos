package sinpaquete;

public class Arrays_bidimensionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] matrix={
				{10,15,18,19,21},
				{5,25,37,41,15},
				{7,19,32,14,90},
				{85,2,7,40,27}
		};
		
		for(int[]fila:matrix) {
			
			System.out.println();
			
			for(int z: fila) {
				
				System.out.print(z + " ");
			}
		}
				
		
		/*Para rellenar el array
		int [][] matrix=new int[4][5];
		matrix[0][0]=15;
		matrix[0][1]=21;
		matrix[0][2]=18;
		matrix[0][3]=9;
		matrix[0][4]=15;
		
		matrix[1][0]=10;
		matrix[1][1]=52;
		matrix[1][2]=17;
		matrix[1][3]=16;
		matrix[1][4]=7;
		
		matrix[2][0]=20;
		matrix[2][1]=24;
		matrix[2][2]=34;
		matrix[2][3]=50;
		matrix[2][4]=41;
		
		matrix[3][0]=11;
		matrix[3][1]=33;
		matrix[3][2]=22;
		matrix[3][3]=44;
		matrix[3][4]=66;*/
		
		for (int i=0;i<4;i++) {	
			System.out.println();
			for(int j=0;j<5;j++) {
				System.out.print(matrix[i][j]+" ");
			}
		}
	}

}
