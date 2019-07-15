package basic;
import java.util.Scanner;

public class soal1 {
		
	public static void main(String[] args) {
        
        int i=0; 
		int j=0;  
		int baris=0;
 
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukan Jumlah Baris  : "); 
        baris = scan.nextInt();
       
        for (i = 1 ; i <= baris; i++) {
            
            for ( j = 1; j <= i; j++)
                System.out.print("*");
 
                System.out.println();
        }
    }
}

	
