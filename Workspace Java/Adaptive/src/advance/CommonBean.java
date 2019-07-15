package advance;

import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Set;
import java.util.HashSet;

public class CommonBean{

	
		Scanner scanner = new Scanner(System.in);
		SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
		
		Student student = null;
		Set<Student> studentList= new HashSet<Student>();
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
		Long dpl = null;

	public Integer validasi(String pertanyaan){
			
			String input=null;
			Integer input2=0;
			boolean valid=true;
			while(valid){
				try{
				System.out.print(pertanyaan);
				input = scanner.nextLine();
				if (input.trim().isEmpty()){
					System.out.println("Tidak Boleh Kosong");
				}else{
					input2=Integer.parseInt(input);
					valid=false;
				}

			}catch(NumberFormatException nfe){
				System.out.println("inputan Harus Angka");
			}
		}return input2;
	}

	


	public Date validTanggal(String pertanyaan){
		Scanner scanner = new Scanner(System.in);
		SimpleDateFormat sdf= new SimpleDateFormat("dd-MM-yyyy");
		String input=null;
		Date date= null;
			boolean valid=true;
			while(valid){
				try{
				System.out.print(pertanyaan);
				input = scanner.nextLine();
				if (input.trim().isEmpty()){
					System.out.println("Tidak Boleh Kosong");
				}else{
					date=sdf.parse(input);
					valid=false;
				}
			}catch(Exception e){
			System.out.println("format Penulisan harus dd-MM-yyyy, contoh 28-08-1995");
			}

		}return date;
	}


	public String validGender(String pertanyaan){
			Scanner scanner = new Scanner(System.in);
			String input=null;
			boolean valid=true;
			while(valid){
				System.out.print(pertanyaan);
				input = scanner.nextLine();
				if (input.trim().isEmpty()){
					System.out.println("Tidak Boleh Kosong");
				}else{
					if(input.equalsIgnoreCase("L") || (input.equalsIgnoreCase("P"))){
						valid=false;
					}else{
						System.out.println("Inputan Gender Hanya Laki-laki atau Perempuan");
					}
				}

		}return input;
	}



	public String validasiStr(String pertanyaan){
			Scanner scanner = new Scanner(System.in);
			String input=null;
			boolean valid=true;
			while(valid){
				System.out.print(pertanyaan);
				input = scanner.nextLine();
				if (input.trim().isEmpty()){
					System.out.println("Tidak Boleh Kosong");
				}else{
					valid=false;
				}

		}return input;
	}

	public String validNomor(String pertanyaan){
			Scanner scanner = new Scanner(System.in);
			String input=null;
			boolean valid=true;
			while(valid){
			System.out.print(pertanyaan);
			input=scanner.nextLine();
			if(input.trim().isEmpty()){
				System.out.println("Tidak Boleh Kosong");
			}else if (input.matches("^[a-zA-Z]*$")){
				System.out.println("inputan Harus Angka");
			}else if ((input.length() < 12)||(input.length() > 13)){
							System.out.println("input harus 12 angka");
			}else{
				valid=false;
			}
		}return input;
		}
		
			
		

		
}



