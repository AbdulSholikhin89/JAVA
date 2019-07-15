package basic;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class LatihanArray3{

	public static void main (String [] args){
		LatihanArray3 latihanArray3 = new LatihanArray3();
		latihanArray3.run();
		
	}

		public void run(){
			Scanner scanner = new Scanner(System.in);

			String [] namaHari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};
			String strHari = null;
			int hari = 0;
			boolean jawab = true;

			while (jawab){
				try {

				System.out.print ( "\n\nMasukan urutan hari: ");
					strHari = scanner.nextLine();

					if (strHari.trim().isEmpty()){
						System.out.println("Urutan tidak boleh kosong");
					} else {
						hari = Integer.parseInt(strHari);
						
						if (hari > 7 || hari <= 0){
							System.out.println("Urutan Harus diisi antara 1-7");
						} else {
							-- hari;
							jawab = false;
						}
					}

					} catch (NumberFormatException nfe){
						System.out.println("Urutan Harus Bilangan Bulat");
					}

			}
				System.out.println("Hari ke " +strHari+ " adalah " +namaHari[hari]);
				int selectedOption = JOptionPane.showConfirmDialog(null, "Apakah anda akan menutup system?", "Tutup Menu", JOptionPane.YES_NO_OPTION);
 				if (selectedOption == JOptionPane.YES_OPTION) {
				 System.exit(0);
				 } else {
				run();		
				}			
		}

}	
