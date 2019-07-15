package basic;
public class coba2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int isi = 0;
		double jumlahNilai = 0.0;
		
		System.out.println("Masukan jumlah mata pelajaran : ");
		int lebarArray = Integer.parseInt(scan.nextLine());
		String[] namaMapel = new String[lebarArray];
		double [] nilaiMapel = new double[lebarArray];
		 while(isi < namaMapel.length) {
			 System.out.print("Nama Mata pelajaran : ");
			 namaMapel[isi] = scan.nextLine();
			 isi++;
		 }
		 
		 isi = 0;
		 double nilaiMax = 0.0;
		 double nilaiMin = 0.0;
		 while(isi < namaMapel.length) {
			 System.out.printlln("nilai" + namaMapel[isi] + ": ");
			 double nilaiPelajaran = double.parseDouble(scan.nextLine());
			 nilaiMapel[isi] = nilaiPelajaran;
			 jumlahNilai = jumlahNilai + nilaiPelajaran;
			 
			 isi++;
		 }
		 for (isi= 0;isi<namaMapel.length;isi++) {
			 if(nilaiMax < nilaiMapel[isi]) {
				 nilaiMax = nilaiMapel[isi];
			 }
		 }
		 nilaiMin = nilaiMax;
		 for (isi= 0;isi<namaMapel.length;isi++) {
			 if(nilaiMin > nilaiMapel[isi]) {
				 nilaiMin = nilaiMapel[isi];
			 }
		 }
		 System.out.println("nilai Max = " +nilaiMax + " dan nilaiMin = "+ nilaiMin);
		 double rata2 = jumlahNilai/isi;
		 System.out.println("Hasil nilai rata2 dari ke-"+isi+ "mata pelajran adalah" + rata2);
	}
}
				 