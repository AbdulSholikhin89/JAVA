package basic;

import java.util.Scanner;

public class Soal5 {

    public static void main(String[] args) {
		Soal5 soal5 = new Soal5();
		soal5.run();
	}
		public void run () {
    
			Scanner scan = new Scanner (System.in);
			int[][] matrix1=null;
			int [][]matrix2=null;
		
			String[]simpanData = null;
			String[]saveData = null;
			String strBarisMatrix = null;
			String strKolomMatrix = null;
			String strNilai = null;
			String strBaris =  null;
			String strKolom = null;
			
			
			
			int kolom = 0;
			int baris = 0;
			int kolom1 = 0;
			int baris1 = 0;
			int nilai = 0;
	
		
		
			System.out.print("Masukan Baris Matrix : ");
			strBarisMatrix = scan.nextLine();
			baris = Integer.parseInt(strBarisMatrix);
			saveData = new String [baris];
			System.out.print("Masukan Kolom Matrix : ");
			strKolomMatrix = scan.nextLine();
			kolom = Integer.parseInt(strKolomMatrix);
			simpanData = new String [kolom];
			
					System.out.println("");
					matrix1 = new int [baris][kolom];
					matrix2 = new int [baris][kolom];

					System.out.println("=============");
					System.out.println("Matrix ke-1");
					System.out.println("=============");
			
			while(baris1 < baris) {
					System.out.println("Baris" + (baris1+1));
					
					
					while(kolom1 < kolom) {
						System.out.print("Kolom ke- " + (kolom1+1)+ "=");
						strNilai = scan.nextLine();
						nilai = Integer.parseInt(strNilai);
						
						matrix1[baris1][kolom1] = nilai;
						kolom1++;
					}
						kolom1 = 0;
						baris1++;
			}
			
					System.out.println("=============");
					System.out.println("Matrix ke-2");
					System.out.println("=============");
							
			baris1=0;
		
			while(baris1 < baris) {
					System.out.println("Baris" + (baris1+1));
															
					
					while(kolom1 < kolom) {
						System.out.print("Kolom ke-" + (kolom1+1)+ " = ");
						strNilai = scan.nextLine();
						nilai = Integer.parseInt(strNilai);
						
						matrix2[baris1][kolom1] = nilai;
						kolom1++;
					}
						kolom1 = 0;
						baris1++;
			}
					System.out.println("");
					
					for(int z = 0 ; z < baris ; z++ ){
						for(int  i = 0 ; i < kolom ; i++){
							System.out.print(matrix1[z][i] + " ");
						}
						System.out.print(" + ");
						for( int i = 0 ; i < kolom ; i++){
							System.out.print(matrix2[z][i] + " ");
						}
						System.out.print(" = ");
						for( int i = 0 ; i < kolom ; i++){
							System.out.print(matrix1[z][i] + matrix2[z][i] + " ");
						}
						System.out.println(" ");
							
					}
		}
}

		
		
		
				
		