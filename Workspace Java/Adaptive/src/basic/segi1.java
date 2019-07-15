package basic;
import java.util.Scanner;


 public class segi1 {

	public static void main(String[] args) {
		int z=0; 
		int x=0;  
		int baris=0;
 
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukan Jumlah Baris  : "); 
        baris = scan.nextInt();
		

		for (int i=1;i<=baris;i++){
            for(int j=5;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }

	}

}


