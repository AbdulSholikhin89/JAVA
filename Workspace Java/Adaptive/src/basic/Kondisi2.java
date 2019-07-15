package basic;

import java.util.Scanner;

public class Kondisi2{

	public static void main(String[] args){
	Kondisi2 panggil = new Kondisi2();
	panggil.run();
	}

 		public void run(){
			String hasil= null;
			String pernyataan= null;
			String kenyataan=null;
			String hasil1= null;

			Scanner scanner = new Scanner(System.in);
				
			System.out.print("Perempuan : ");
			pernyataan=scanner.nextLine();
			System.out.print("laki -laki : ");
			kenyataan =scanner.nextLine();
			hasil= hasilakhir (pernyataan,kenyataan);
			System.out.println(hasil);

 	}

 		public String hasilakhir(String pernyataan, String kenyataaan){
			String keterangan= null;
			if (pernyataan.trim().isEmpty() && kenyataaan.trim().isEmpty()){
		 		keterangan = "isi tidak boleh kosong";
		 	}else if (pernyataan.equalsIgnoreCase("benar") && kenyataaan.equalsIgnoreCase("salah")){
		 	 	keterangan = "Perempuan Selalu benar";
		 	}else if (pernyataan.equalsIgnoreCase("salah") && kenyataaan.equalsIgnoreCase("salah")){
		 	 	keterangan = "Laki laki yang Salah";
		 	}else if(pernyataan.equalsIgnoreCase("salah") && kenyataaan.equalsIgnoreCase("benar")){
		 	 	keterangan = "Laki laki tetap Salah";
		 	}else if(pernyataan.equalsIgnoreCase("benar") && kenyataaan.equalsIgnoreCase("benar")){
		 	 	keterangan = "Laki laki baru benar";
		 	}
		 	else{
		 		keterangan = "Harus Diisi benar atau salah";
		 	}return keterangan;
			}

}

