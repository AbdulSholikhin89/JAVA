package basic;
public class LatihanPrefix {
	
	public static void main(String[] args) {
		LatihanPrefix latihanPrefix = new LatihanPrefix();
		latihanPrefix.run();
	}
		
		public void run() {
		prefixPlus();
		System.out.println("");
		prefixMinus();
		
}


		public void prefixPlus(){
		int x = 0;
	
	
		x++;	
		System.out.println("Hitung maju : " + x);
		x++;
		System.out.println("Hitung maju : " + x);
		x++;
		System.out.println("Hitung maju : " + x);
		x++;
		System.out.println("Hitung maju : " + x);
		x++;
		System.out.println("Hitung maju : " + x);
		
		}
		
		public void prefixMinus() {
		int x = 6;
	
	
		x--;	
		System.out.println("Hitung mundur : " + x);
		x--;
		System.out.println("Hitung mundur : " + x);
		x--;
		System.out.println("Hitung mundur : " + x);
		x--;
		System.out.println("Hitung mundur : " + x);
		x--;
		System.out.println("Hitung mundur : "  + x);
		
		}
		
}
