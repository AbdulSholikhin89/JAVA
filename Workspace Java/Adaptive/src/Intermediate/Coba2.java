import java.util.Sacanner;

public class Coba2 {
	public static void main(String[] args) {
		Coba2 coba2 = new Coba();
		coba.runApp();
	}
	public void runApp() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Masukan Jumlah Siswa : ");
		int siswa = Integer.parseInt(scan.nextLine());
		Human[] human = new Human[siswa];
	}
		
		for (int isi =0; isi<siswa;isi++) {
			Human varHuman = new Human();
			System.out.println("nama depan : ");

			String tempNama= scan.nextLine();
			System.out.println("nama belakang : ");
			String tempBelakang = scan.nextLine();
			System.out.println("Umur : ");
			int tempumur = Integer.parseInt(scan.nextLine());
			System.out.println("Jenis Kelamin : ");
			String tempGender = scan.nextLine();
			System.out.println("Golongan Darah : ");
			String tempGolDar = scan.nextLine();
			System.out.println("Alamat : ");
			String tempAlamat = scan.nextLine();
			
			varHuman.setNamaDepan(tempNama);
			varHuman.setNamaBelakang(tempBelakang);
			varHuman.setAttrMamalia(tempUmur,tempGender);
			varHuman.setGolonganDarah(tempGolDar);
			varHuman.setTempatTinggal(tempAlamat);
			human{isi] = varHuman;
			}
			for (int isi = 0; isi<siswa;isi++) {
			System.out.println("======================");
			System.out.println(human[isi].getNamaDepan() +"" + human[isi].getNamaBelakang());
			System.out.println(human[isi].getJenisKelamin());
			System.out.println(human[isi].getUmur());
			System.out.println(human[isi].getGoonganDarah());
			System.out.println(human[isi].getTempatTinggal());
		}
		}
	}
