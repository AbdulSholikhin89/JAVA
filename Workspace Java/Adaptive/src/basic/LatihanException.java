package basic;

import java.util.Scanner;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class LatihanException {
	public static void main(String[]args) {
		LatihanException latihanException = new LatihanException ();
		latihanException.run ();
	}
		 
		public void run() {
			Scanner scanner = new Scanner (System.in);
			String strNomor = null;
			int nomor = 0;
			
			
			SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
			String strTanggal = null;
			Date tanggal = null;
			
			try {
				System.out.print("masukan nomor : ");
				strNomor = scanner.nextLine();
				if (strNomor.trim().isEmpty()) {
					System.out.println("Nomor tidak boleh kosong");
				} else {
					nomor = Integer.parseInt(strNomor);
					System.out.println("Nomor : " + nomor);
					 boolean inputNomor = true;
				}
			}catch (NumberFormatException nfe) {
			}
			
			try {
				System.out.print("Masukan tanggal : ");
				strTanggal= scanner.nextLine();
				if (strTanggal.trim().isEmpty()) {
					System.out.println("Tanggal tidak boleh kosong");
				}
				else {
					tanggal = sdf.parse(strTanggal);
					System.out.println("Tanggal (Asli) :" + tanggal);
					System.out.println("Tanggal (yang sudah diconvert) :" + sdf.format(tanggal));
				}
			}catch (Exception e) {
				System.out.println("Format tanggal harus dd/mm/yyyy,contoh 23 Maret 2019");
			}
					

		}
}		