package advance;
 import java.util.Scanner;
 import java.util.HashSet;
 import java.util.Set;
 import java.text.SimpleDateFormat;
 import java.text.ParseException;
 
 
 public class PracticeSetMode2 {
	 public static void main(String[] args) {
		 PracticeSetModel2 practiceSetModel2 = new PracticeSetModel2();
		 practiceSetModel2.run();
	 }
	 
	 public void run() {
		 Scanner scanner = new Scanner(System.in);
		 Student student = new Student();
		 Set<Student>studentList = new HashSet<Student>();
		 Long noPelajar= null;
		 String strnoPelajar = null;
		 String nama = null;
		 String tempatLahir = null;
		 String jenisKelamin = null;
		 String alamat = null;
		 String jurusan = null;
		 int noHP =0;
		 
		 SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		String sDate = sdf.format(new Date());
		 
		 for(int z = 0; z < 8; z++) {
		 student = new Student();
		 
		 System.out.print("Masukan Nomor Pelajar : ");
		 strnoPelajar = scanner.nextLine();
		 noPelajar = Long.parseLong(strnoPelajar);
		 student.setNoPelajar(noPelajar);
		 
		 System.out.print("Masukan Nama  : ");
		 nama = scanner.nextLine();
		 Student.setNamaStudent(nama);
		 
		 System.out.println("Masukan Tempat Lahir : ");
		 tempatLahir = scanner.nextLine();
		 Student.setTempatLahir(tempatLahir);
		 
		 // Convert Date to String
			System.out.println("Masukan Tanggal : ");
			
			
		
		System.out.println("");
		 
		 System.out.println("Masukan Jenis Kelamin : ");
		 jenisKelamin = scanner.nextLine();
		 Student.setJenisKelamin(jenisKelamin);
		 
		 System.out.println("Masukan Alamat : ");
		 alamat = scanner.nextLine();
		 Student.setAlamat(alamat);
		 
		 System.out.println("Masukan Jurusan : ");
		 jurusan = scanner.nextLine();
		 Student.setJurusan(jurusan);
		 
		 System.out.println("Masukan Nomor Hp : ");
		 noHP = scanner.nextInt();
		 Student.setNoHp(noHP);
		 pesertaList.add(Student);
		 }
		 
			for(Student dataPelajar : studentList) {
				
			System.out.println("Nomor Pelajar : " + dataPelajar.getNoPelajar());
			System.out.println("Nama Pelajar : " + dataPelajar.getNama());
			System.out.println("Jenis Kelamin: " + dataPelajar.getJenisKelamin());
			System.out.println("Alamat : " + dataPelajar.getAlamat());
			System.out.println("Jurusan : " + dataPelajar.getJurusan());
			System.out.println("Nomor Hp : " + dataPelajar.getNoHp());
	 }
 }
			
			
 }	 