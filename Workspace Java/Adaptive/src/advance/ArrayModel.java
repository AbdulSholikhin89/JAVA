package advance;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayModel {
	
	public static void main(String [] args) {
		
		ArrayModel arrayModel = new ArrayModel(); 
		arrayModel.run();
	}
		
			
			
					public void run() {
					Scanner scan = new Scanner(System.in);
					List<Peserta>pesertaList = new ArrayList<Peserta>();
					Peserta peserta = null;
					boolean foundStudent = false;
					int jmlPeserta = 0;
					Long noPeserta = null;
					String namaPeserta = null;
					String input = null;
					
					
					
					
					
					
					
					System.out.print("Masukan jumlah peserta : ");
					jmlPeserta = Integer.parseInt(scan.nextLine());
					for(int z = 0; z<jmlPeserta;z++) {
						
						peserta = new Peserta();
						System.out.print("Masukan No Peserta : ");
						input = scan.nextLine();
						noPeserta=Long.parseLong(input);
						
						System.out.print("Masukan Nama : ");
						namaPeserta = scan.nextLine();
						
						peserta.setNoPeserta(noPeserta);
						peserta.setNamaPeserta(namaPeserta);
						pesertaList.add(peserta);
			
						}
					
					//*perulangan dengan menggunakan for each\\*
					System.out.println("===================");
					for(Peserta psrt : pesertaList) {
						System.out.println("No  :" + psrt.getNoPeserta());
						System.out.println("Nama:" + psrt.getNamaPeserta()+ "\n");
					}
					//*perulangan dengan menggunakan for biasa\\*
					System.out.println("===================");
					for(int z= 0;z<pesertaList.size();z++) {
						System.out.println("No  :" + pesertaList.get(z).getNoPeserta());
						System.out.println("Nama:" + pesertaList.get(z).getNamaPeserta() + "\n");
					}
				
			}
}
			
	
			



