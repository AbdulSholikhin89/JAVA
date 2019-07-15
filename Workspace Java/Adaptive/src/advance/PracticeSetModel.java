package advance;
 import java.util.Scanner;
 import java.util.HashSet;
 import java.util.Set;
 
 
 public class PracticeSetModel {
	 public static void main(String[] args) {
		 PracticeSetModel practiceSetModel = new PracticeSetModel();
		 practiceSetModel.run();
	 }
	 
	 public void run() {
		 Scanner scanner = new Scanner(System.in);
		 Peserta peserta = new Peserta();
		 Set<Peserta>pesertaList = new HashSet<Peserta>();
		 Long noPeserta= null;
		 String strNoPeserta = null;
		 String nama = null;
		 
		 
		 for(int z = 0; z < 3; z++) {
		 peserta = new Peserta();
		 System.out.print("Masukan Nomor Peserta : ");
		 strNoPeserta = scanner.nextLine();
		 noPeserta = Long.parseLong(strNoPeserta);
		 peserta.setNoPeserta(noPeserta);
		 
		 System.out.print("Masukan Nama Peserta : ");
		 nama = scanner.nextLine();
		 peserta.setNamaPeserta(nama);
		 
		 pesertaList.add(peserta);
		 }
		 
			for(Peserta dataPeserta : pesertaList) {
				
			System.out.println("Nomor Peserta : " + dataPeserta.getNoPeserta());
			System.out.println("Nama Peserta : " + dataPeserta.getNamaPeserta());
			
	 }
 }
			
			
 }	 