package Abdul.basic;

import java.util.Scanner;
public class NilaiRata {
 
    public static void main(String[] args) {
	
        
        Scanner input = new Scanner(System.in);
        int y, jml, nilai[];
        float rata, jumlah = 0;
		String n = null;
		
		String[] arrayMatapel;
		String Mapel = null;
		int matapelKe = 0;
		int nilaiMax = 0;
		int nilaiMin = 0;
		
		
		
		
        
        System.out.print("Masukkan Jumlah Mata pelajaran : ");
        n = input.nextLine();
		y = Integer.parseInt(n);
 
        
        nilai = new int[y];
		arrayMatapel = new String [y];
		
         for(int i=0;i<= y-1;i++){
			System.out.print("Masukan nama mata pelajaran " +(i+1)+ " : " );
	  			arrayMatapel[i] = input.nextLine();
		
        }
		for(int i=0;i<= y-1;i++){
            System.out.print("Nilai Mata pelajaran " + (i+1) + " : ");
            nilai[i] = input.nextInt();
            System.out.println();
		}
				

				for(int j=0;j<= y-1;j++){
            jumlah = jumlah + nilai[j];
		}
				for (int a = 0 ; a < nilai.length ; a++){
				if (nilaiMax <= nilai[a]){
					nilaiMax = nilai[a];
				
				}
				
			
				}
				for (int a = 0 ; a < nilai.length ; a++){
				if (nilaiMax > nilai[a]) {
					nilaiMin = nilai[a];
					
				}
			
			}
		
				System.out.println("Nilai Max : " + nilaiMax);
				System.out.println("Nilai Min : " + nilaiMin);
				
				
			
			
       
        rata = jumlah/y;
		
 
       
        System.out.println("Daftar Nilai mata pelajaran");
        System.out.println("----------------");
        System.out.println("Nilai rata-rata : " + rata);
    }
}
	
	


