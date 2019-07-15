package Intermediate;
import java.util.Scanner;

public class MatematikaBean extends CommonBean {
	private Scanner scan = new Scanner(System.in);
	MatematikaService mtk = new MatematikaServiceImpl();
	String strinput = null;
	int input = 0;
	int counter = 0;

	public static void main (String[] args){
		MatematikaBean mtkBean = new MatematikaBean();
		mtkBean.menu();
		
	}
	
	
	public void menu(){	

		System.out.println("");
		System.out.println("======================================|");
		System.out.println("Menghitung rumus bangun ruang / datar |");
		System.out.println("=======================================");
		System.out.println("");
		System.out.println("===========Pilih menu============");
		System.out.println("1. luas Segitiga");
		System.out.println("2. luas Persegi Panjang");
		System.out.println("3. volume Prisma Segitiga");
		System.out.println("4. volume Kubus");
		System.out.println("5. Exit");
		System.out.println("");
		
		
		
			
		try {
		System.out.print("Masukan Menu : ");
		 strinput = scan.nextLine();
		if(strinput.trim().isEmpty()) {
			System.out.println("Menu tidak boleh kosong");
			menu();
		} else { 
		input = Integer.parseInt(strinput);
		
	
		switch(input){
			case 1 : 
					
					luasSegitiga();
					menu();
					break;
			case 2 : 
			
					 LuasPersegiPanjang ();
					 menu();
					break;
			case 3 : 
				
					PrismaSegitiga();
					 menu();
					break;
			case 4 : 
					
					VolumeKubus ();
					menu();
					break;
			case 5 : System.out.println("===========program selesai============");
					System.exit(0);
					break;
			default : System.out.println("Input hanya boleh 1 - 4");
					menu();
					break;
		}
		
		}
		}catch (NumberFormatException nfe) {
			System.err.println("masukan harus angka");
			menu();
			
			
		}
	}

	
	public void luasSegitiga () {
		double alas = valid("Masukan Alas : ");
		double tinggi = valid("Masukan Tinggi : ");
		double hasil = mtk.luasSegitiga(alas,tinggi);
		System.out.println(alas+ " * " +tinggi+ " = " +hasil);
		
	}

	public void LuasPersegiPanjang (){
		double panjang = valid ("Masukan Panjang : ");
		double lebar = valid("Masukan Lebar : ");
		double hasil = mtk.luasPersegiPanjang(panjang,lebar);
		System.out.println("Luas Persegi Panjang : " +panjang+ " * " +lebar+ " = " +hasil);
		
	}

	public void VolumeKubus (){
		double Sisi = valid("Masukan Sisi : ");
		
		double hasil = mtk.volumeKubus(Sisi);
		System.out.println("Volume Kubus : " +Sisi+ " * " +Sisi+ " * " +Sisi+ " = " +hasil);
	
	}
	public void PrismaSegitiga() {
		double Panjang = valid ("Masukan panjang : ");
		double lebar = valid ("Masukan lebar : ");
		double tPrisma =valid(" Masukan tinggiPrisma : ");
		double hasil = mtk.luasPrismaSegitiga(Panjang,lebar,tPrisma);
		System.out.println("Volume prisma Segitiga : "+ Panjang+ "*" + lebar +"*" +tPrisma +"=" + hasil);
		
	}
	
}

