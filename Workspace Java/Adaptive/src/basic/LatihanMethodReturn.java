package basic;
public class LatihanMethodReturn{
	public static void main(String [] args){
		LatihanMethodReturn latihanMethodReturn = new LatihanMethodReturn();
		latihanMethodReturn.run();
	}
	public void run () {
		boolean lebihbesarBilangan1;
		int bilangan1;
		int bilangan2;
		bilangan1 = 7;
		bilangan2 = 5;
		lebihbesarBilangan1 = cekPerbandingan(bilangan1,bilangan2);
		System.out.println("bilangan1 = " + bilangan1);
		System.out.println("bilangan2 = " + bilangan2);
		System.out.println("apakah bilangan1 lebih besar dari bilangan2 = " + lebihbesarBilangan1);
		
		
		bilangan1 = hitungPenjumlahan(4,2);
		bilangan2 = hitungPenjumlahan(5,5);
		System.out.println("bilangan1 = " + bilangan1);
		System.out.println("bilangan2 = " + bilangan2);
		lebihbesarBilangan1 = cekPerbandingan(bilangan1,bilangan2);
		System.out.println("apakah bilangan1 lebih besar dari bilangan2 = " + lebihbesarBilangan1);
	}
	public int hitungPenjumlahan(int bilangan1,int bilangan2) {
		int hasil = bilangan1 + bilangan2;
		return hasil;
	}
	
	public boolean cekPerbandingan(int bilangan1,int bilangan2) {
		boolean hasil;
		if(bilangan1 > bilangan2){
			hasil = true;
		} else {
			hasil = false;
		}
		return hasil;
	}
	
}
		



	
