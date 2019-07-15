package Abdul.basic;
import java.util.Scanner;
public class ControlFlowIfElse {

public static void main(String[] args) {
	ControlFlowIfElse controlFlowIfElse = new ControlFlowIfElse ();
	controlFlowIfElse.run();
	}

	public void run() {
		Scanner scan = new Scanner(System.in); 
		
		try {
			
		
			String input= null;
			int gaji;
			int hasil;

			System.out.print("Masukan belanja : ");
			input = scan.nextLine();
			belanja=Integer.parseInt(input);
			hasil = (belanja);
			
		

		
		
		if (gaji > 600000) {
		System.out.print("Anda tidak boleh hutang");
		
		} else if (gaji < 500000) {
			System.out.print("Anda boleh berhutang");
				
			}

		}catch(NumberFormatException nfe){
			System.out.println("Harap Masukan Angka");

		}
		}
	}


		
		
	