package basic;
public class LatiahanParameter {
	private int hasil = 0;
	public static void main(String [] args) {
		LatihanParameter x = new LatihanParameter();
		
		x.sayNama("Abdul");
		x.hitungPenjumlahan(2,4);
	}
	public void sayNama(String Nama) {
		System.out.println("nama:" + Nama);
	}
	public void hitungPenjumlahan(int bilangan1,int bilangan2) {
		hasil = bilangan1 + bilangan2;
		System.out.println(bilangan1 + "+" + bilangan2 + " = " + hasil);
	}
}

	