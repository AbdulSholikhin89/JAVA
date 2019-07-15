package basic;

	public class LatihanVariable {
		private static String namaSaya = "Abdul Sholikhin";
		private static int umurSaya = 29;
        private static String tempatLahir = "Pemalang";
		
		private static int bilangan1 = 2;
		private static int bilangan2 = 7;
		private static int hasil = 0;
		
		public static void main(String[] args) {
			System.out.println("Nama:" + namaSaya);
			System.out.println("Umur:"+ umurSaya);
			System.out.println("tempatLahir:" + tempatLahir);
			
			hasil = bilangan1 + bilangan2;
			System.out.println(bilangan1 + " + " + bilangan2 + " = " + hasil);
					
		}
	}
	

