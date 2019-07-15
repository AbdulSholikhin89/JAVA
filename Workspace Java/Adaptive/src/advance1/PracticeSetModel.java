package advance1;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class PracticeSetModel {
	
	public static void main(String[] args)
	{
		PracticeSetModel practiceSetModel = new PracticeSetModel();
		practiceSetModel.run();
	}
	
	public void run()
	{
		Scanner scan = new Scanner(System.in);
		Peserta peserta = null;
		Set<Peserta> pesertaList = new HashSet<Peserta>();
		Long noPeserta = null;
		String strNoPeserta = null;
		String nama = null;
		
		for(int i = 0; i < 3; i++)
		{
			peserta = new Peserta();
			System.out.print("Masukkan nomor peserta : ");
			strNoPeserta = scan.nextLine();
			noPeserta = Long.parseLong(strNoPeserta);
			peserta.setNoPeserta(noPeserta);
			
			System.out.print("Masukkan nama peserta : ");
			nama = scan.nextLine();
			peserta.setNamaPeserta(nama);
			
			pesertaList.add(peserta);
		}
		
		for(Peserta dataPeserta : pesertaList)
		{
			System.out.println("Nomor Peserta : " + dataPeserta.getNoPeserta());
			System.out.println("Nama Peserta : " + dataPeserta.getNamaPeserta());
		}
		
		
	}
}