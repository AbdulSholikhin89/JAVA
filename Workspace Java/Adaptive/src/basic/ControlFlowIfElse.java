package basic;
import java.util.Scanner;
public class ControlFlowIfElse {

public static void main(String[] args) {
	ControlFlowIfElse controlFlowIfElse = new ControlFlowIfElse ();
	controlFlowIfElse.run();
	}

	public void run() {
		Scanner scan = new Scanner(System.in); 
		
		
		
			String input= null;
			int belanja;
			int hasil;

			System.out.print("Masukan belanja : ");
			input = scan.nextLine();
			belanja=Integer.parseInt(input);
			hasil = (belanja);

		
		
		if (belanja > 600000) {
		System.out.print("saya mendaptakan motor");
		
		} else if (belanja < 500000) {
			System.out.print("anda mendapatkan gelas cantik");
				
			}	
		}
	}


		
		
	