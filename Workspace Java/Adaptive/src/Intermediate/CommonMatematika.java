package Intermediate;
mport java.util.Scanner;
public class Common{
	private Scanner scan = new Scanner(System.in);
	
	double panjang = 0;
	double lebar = 0;
	double tinggi= 0;
	double Sisi = 0;
	double hasil = 0;
	private int input = 0;
	
	public void setInput(int input){
		this.input = input;
	}
	public Integer getInput(){
		return this.input;
	}

	public Integer valid(String pertanyaan){
		boolean counter = true;
		String strInput = null;

		while(counter){
			try {
				System.out.print(pertanyaan);
				strInput = scan.nextLine();
				if(strInput.trim().isEmpty()){
					System.out.println("Data Tidak Boleh Kosong");
				} else{
					input = Integer.parseInt (strInput);
					if (input <= 0){
						System.out.println("Masukan Menu 1-4");
						
					} else {
						counter = false;
					}
				}
			} catch (NumberFormatException nfe){
				System.out.println("Inputan harus angka");
			}
		}
		return input;	
	}

	public void Keluar(){
		System.out.println("Sampai Jumpa");
		System.exit(0);
		
	}
}	
	
