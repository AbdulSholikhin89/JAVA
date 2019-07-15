package basic;
public class LatihanPosfix {
	
	public static void main(String[] args) {
		LatihanPosfix latihanPosfix = new LatihanPosfix();
		latihanPosfix.run();
	}
		
		public void run() {
		posfixPlus();
		System.out.println("");
		posfixMinus();
		
}


		public void posfixPlus(){
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
		
		public void posfixMinus() {
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
