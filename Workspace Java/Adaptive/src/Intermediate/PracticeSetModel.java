package advance;
 import java.util.Scanner;
 
 public class PracticeSetModel {
	 public static void main(String[] args) {
		 PracticeSetModel practiceSetModel = new PracticeSetModeL();
		 practiceSetModel.run();
	 }
	 
	 public void run() {
		 Scanner scanner = new Scanner(System.in);
		 Peserta peserta = new Peserta();
		 Long noPesertam= null;
		 String strNoPeserta = null;
		 String nama = null;
		 
		 System.out.print("Masukan No Peserta : ");
		 strNoPeserta = Scanner.nextLIne();
		 noPeserta = Long.parseLong(strNoPeserta);
		 peserta.setNoPeserta(noPeserta);
		 
		 System.out.print("Masukan Nama Peserta : ");
		 nama = Scanner.nextLIne();
		 noPeserta.setNamaPeserta(nama);

			System.out.println("Nomor Peserta : " + peserta.getNoPeserta());
			System.out.println("Nama Peserta : " + peserta.getNamaPeserta());
			
	 }
 }
			
			
		 