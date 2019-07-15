package basic;
public class HomeWork1 {
	private int hasil = 0;
	public static void main(String [] args) {
		HomeWork1 z = new HomeWork1();
		
		z.sayNama("Abdul");
		z.hitungPenjumlahan(3,4);
		z.rumusPytagoras(30,40);
		z.rumusSegitiga(20,30);
		z.rumusLingakaran(40);
		z.Pengurangan(60,20);
		z.Pembagian(100,50);
		z.Pengakaran(625);
		z.Perkalian(100,10);
	}
	public void sayNama(String Nama) {
		System.out.println("Saya Abdul sedang belajar java");
	}
	public void hitungPenjumlahan(int bilangan1,int bilangan2) {
		hasil = bilangan1 + bilangan2;
		System.out.println(bilangan1 + "+" + bilangan2 + " = " + hasil);
	}	
	public void rumusPytagoras(int alas,int tinggi){
	double sisimiring = Math.pow (alas,2) + Math.pow (tinggi,2);
	System.out.println(" ----------------------------- ");
	System.out.println(" Rumus Pytagoras "+ sisimiring);
	System.out.println(" ----------------------------- ");
	
	}
	public void rumusSegitiga(double alas,double tinggi){
		double luas = 0.5 * alas * tinggi;
		System.out.println(" ------------ ");
		System.out.println("rumusSegitiga = "+ luas);
		System.out.println(" ------------ ");
	}
	public void rumusLingakaran(double jari){
		double phi = 3.14;
		double luas = phi * Math.pow (jari,2);
		System.out.println(" ------------ ");
		System.out.println("rumusLingakaran = "+ luas);
		System.out.println(" ------------ ");
	}
	public void Pengurangan(int bil1,int bil2){
		int Hasil = bil1 - bil2;
		System.out.println(" ------------ ");
		System.out.println(" Pengurangan  = " + Hasil + " ekor");
		System.out.println(" ------------ ");
	}
	public void Pembagian(int bil1,int bil2){
		int Hasil = bil1 / bil2;
		System.out.println(" ------------ ");
		System.out.println(" Pembagian  = " + Hasil + " ekor");
		System.out.println(" ------------ ");
	}
	public void Pengakaran(int bil1){
		double Hasil = Math.sqrt(bil1);
		System.out.println(" ------------ ");
		System.out.println(" Pengakaran  = " + Hasil + " ekor");
		System.out.println(" ------------ ");
	}
	public void Perkalian(int bil1,int bil2){
		int Hasil = bil1 * bil2;
		System.out.println(" ------------ ");
		System.out.println(" Perkalian  = " + Hasil + " ekor");
		System.out.println(" ------------ ");
	}
	
}
	

	