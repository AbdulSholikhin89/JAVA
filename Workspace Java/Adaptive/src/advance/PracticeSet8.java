package advance;

import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.ArrayList;

public class PracticeSet8 extends Common8{
	List<Student> studentList= new ArrayList<Student>();
	
	
	public static void main(String[] args){
		PracticeSet7 panggil= new PracticeSet7();
		panggil.run();
		panggil.saveData();
	}

	public void run(){
		SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
		Scanner scanner = new Scanner(System.in);
		
		Student student = null;
		
		Long nomorPelajar=null;
		String nama=null;
		String tempatLahir=null;
		Date tanggalLahir=null;
		String jenisKelamin=null;
		String alamat=null;
		String noHp=null;
		String jurusan=null;
		String input=null;
		int jumlah=0;
		int z = 0;
		
		boolean foundNomorPelajar = false;
		boolean cecker = true;
		boolean cek = true;
		boolean cek1 =true;
		
		
		jumlah=validasi("Masukan Jumlah Siswa : ");

		

		while (cecker) {
			
		boolean valid = true;
		student = new Student();

		System.out.println("====================");
		System.out.println("DATA PELAJAR KE -" + (z+1));
		System.out.println("=====================");
		while(valid){
				try{
				System.out.print("Masukan No pelajar :");
				input = scanner.nextLine();
	
			
				if (input.trim().isEmpty()&& z == 0){
					System.out.println("Tidak Boleh Kosong");
				}else if (input.trim().isEmpty()) {
					saveData();
					valid=false;
					cecker =false;
				}
					
				else{
					
					
					nomorPelajar = Long.parseLong(input);
					
					if(isDuplicateNomorPelajar(nomorPelajar)) {
				
					System.out.println("Nomor sudah ada");
					}
					else {
						
						valid = false;
					
					}
				}
				
			}catch (NumberFormatException nfe) {
				System.out.println("Inputan Harus Angka");
			}

		}
		
		
		student.setNomorPelajar(nomorPelajar);

		nama=validasiStr("Masukan Nama Pelajar: ");
		student.setNama(nama);

		tempatLahir=validasiStr("Masukan Tempat Lahir : ");
		student.setTempatLahir(tempatLahir);

		tanggalLahir=validTanggal("Masukan Tanggal Lahir: ");
		student.setTanggalLahir(tanggalLahir);

		jenisKelamin=validGender("Masukan Jenis Kelamin : ");
		student.setJenisKelamin(jenisKelamin);

		alamat=validasiStr("Masukan Alamat: ");
		student.setAlamat(alamat);

		noHp=validNomor("Masukan Nomor Hp Siswa: ");
		student.setNoHp(noHp);

		jurusan=validasiStr("Masukan Jurusan: ");
		student.setJurusan(jurusan);

		studentList.add(student);
		z++;
		}

	
	}
	
	
	/*System.out.println("====================");
	System.out.println("DATA SEMUA PELAJAR ");
	System.out.println("=====================");
	for (Student dataSiswa : studentList){
		System.out.println("Nomor Siswa: " + dataSiswa.getNomorPelajar());
		System.out.println("Nama Peserta: " + dataSiswa.getNama());
		System.out.println("Tempat Lahir: " + dataSiswa.getTempatLahir());
		System.out.println("Tanggal Lahir: " + dataSiswa.getTanggalLahir());
		System.out.println("Jenis Kelamin: " + dataSiswa.getJenisKelamin());
		System.out.println("Alamat: " + dataSiswa.getAlamat());
		System.out.println("No Hp: " + dataSiswa.getNoHp());
		System.out.println("Jurusan: " + dataSiswa.getJurusan());
		}
	}
}*/
		public void saveData() {

	System.out.println("\n Total Pelajar: " + studentList.size());
		System.out.println(" ===================================================================================================== ");
		System.out.printf(" | %-6s | %-7s | %-21s | %-11s | %-15s | %-12s | %-7s |\n", "No", "Nama", "TTL", "Gender", "Alamat", "No Hp", "Jurusan");
		System.out.println(" ===================================================================================================== ");
		for (Student s : studentList) {
			String strTanggalLahir = sdf.format(s.getTanggalLahir());
			jenisKelamin = null;
			if (s.getJenisKelamin().equalsIgnoreCase("L")) {
				jenisKelamin = "Laki - laki";
			} else {
				jenisKelamin = "Perempuan";
			}
		System.out.printf(" | %-6s | %-7s | %-21s | %-11s | %-15s | %-12s | %-7s |\n",
		s.getNomorPelajar(), s.getNama() ,s.getTempatLahir() + ", " + strTanggalLahir, jenisKelamin, s.getAlamat(), s.getNoHp(), s.getJurusan());
		}

System.out.println(" ===================================================================================================== ");
	}
	
	public boolean isDuplicateNomorPelajar(Long nomorPelajar) {
			boolean cariNomor = false;
		
	for(Student b : studentList) {
				if(nomorPelajar.equals(b.getNomorPelajar())) {
				cariNomor = true;
				break;
				}
				
		}
		return cariNomor;
	}
	
		public void model(){
		boolean cek =true;
			while(cek){	
			try{
				System.out.print("Masukan Dicari : ");
				input=scanner.nextLine();
				if (input.trim().isEmpty()){
				System.exit(0);
				}else{
					nomorPelajar=Long.parseLong(input);
					student = new Student();
					student = findByNoPelajar(nomorPelajar);
					if (student !=null){
					tampil(student);
					}else{
					System.out.println(" Data Pelajar Tidak Ditemukan");
					}
				}

			}catch(NumberFormatException nfe){
					System.out.println("Inputan Harus Angka");}
				}
			}
		
	
			public void tampil(){
			System.out.println("\n Total Pelajar: " + studentList.size());
			System.out.println(" ===================================================================================================== ");
			System.out.printf(" | %-6s | %-7s | %-21s | %-11s | %-15s | %-12s | %-7s |\n", "No", "Nama", "TTL", "Gender", "Alamat", "No Hp", "Jurusan");
			System.out.println(" ===================================================================================================== ");
			for (Student s : studentList) {
			String strTanggalLahir = sdf.format(s.getTanggalLahir());
			jenisKelamin = null;
				if (s.getJenisKelamin().equalsIgnoreCase("L")) {
					jenisKelamin = "Laki - laki";
				}else{
				jenisKelamin = "Perempuan";}
			System.out.printf(" | %-6s | %-7s | %-21s | %-11s | %-15s | %-12s | %-7s |\n",
			s.getNomorPelajar(), s.getNama() ,s.getTempatLahir() + ", " + strTanggalLahir, jenisKelamin, s.getAlamat(), s.getNoHp(), s.getJurusan());
			System.out.println(" ===================================================================================================== ");
				}
			}
			public void tampil(Student student){
			System.out.println("\n Total Pelajar: " + studentList.size());
			System.out.println(" ===================================================================================================== ");
			System.out.printf(" | %-6s | %-7s | %-21s | %-11s | %-15s | %-12s | %-7s |\n", "No", "Nama", "TTL", "Gender", "Alamat", "No Hp", "Jurusan");
			System.out.println(" ===================================================================================================== ");
			String strTanggalLahir = sdf.format(student.getTanggalLahir());
			jenisKelamin = null;
				if (student.getJenisKelamin().equalsIgnoreCase("L")) {
					jenisKelamin = "Laki - laki";
				}else{
				jenisKelamin = "Perempuan";}
			System.out.printf(" | %-6s | %-7s | %-21s | %-11s | %-15s | %-12s | %-7s |\n",
			student.getNomorPelajar(), student.getNama() ,student.getTempatLahir() + ", " + strTanggalLahir, jenisKelamin, student.getAlamat(), student.getNoHp(), student.getJurusan());
			System.out.println(" ===================================================================================================== ");
			}
			

		public Student findByNoPelajar(long nomorPelajar){
	Student student=null;
	for (Student s : studentList) {
	if(s.getNomorPelajar().equals(nomorPelajar)){
		student = new Student();
		student.setNomorPelajar(s.getNomorPelajar());
		student.setNama(s.getNama());
		student.setTempatLahir(s.getTempatLahir());
		student.setTanggalLahir(s.getTanggalLahir());
		student.setJenisKelamin(s.getJenisKelamin());
		student.setAlamat(s.getAlamat());
		student.setNoHp(s.getNoHp());
		student.setJurusan(s.getJurusan());
		break;
		}
	}
	return student;
	}

}