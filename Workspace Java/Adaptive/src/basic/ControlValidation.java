package basic;

import java.util.Scanner;
public class ControlValidation{
	public static void main(String[] args){
		ControlValidation csv= new ControlValidation();
		csv.run();
	}

	public void run(){
	Scanner scanner = new Scanner(System.in);
	String hutang;
	String gaji;
	boolean jumlah=true;
	Integer hhutang;	
	Integer hgaji;

		while(jumlah){
			try{
				System.out.print("Masukan Jumlah hutang : ");
				hutang=scanner.nextLine();

				if (hutang.trim().isEmpty()){
					System.out.println("Nilai Hutang Tidak Boleh Kosong");
				}else{
					hhutang=Integer.parseInt(hutang);
					if (hhutang < 0) {
						System.out.println("Harap Masukan Jumlah Hutang");
						break;
					}else{
						System.out.print("Masukan Jumlah Gaji : ");
						gaji=scanner.nextLine();
						if (gaji.trim().isEmpty()){
							System.out.println("Nilai Gaji Tidak Boleh Kosong");
						}else{
							hgaji=Integer.parseInt(gaji);
							if (hgaji < 0 || hgaji < 1000000) {
								System.out.println("Gaji anda Anda : " + hgaji + " dan hutang anda " + hhutang + " Tidak Dapat menerima Pinjaman");
							}else{
								System.out.println(" Hutang Anda : " + hhutang + " dan gaji anda : " + hgaji + " anda dapat menerima pinjaman ");
							jumlah = false;
							}
						}
					}
				}		
			}catch(NumberFormatException nfe){
				System.out.println("harap Masukan Angka Bulat");
			}
		}
	}
}







