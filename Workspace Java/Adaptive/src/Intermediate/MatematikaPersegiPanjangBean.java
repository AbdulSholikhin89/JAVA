package Intermediate;

public class MatematikaPesegiPanjangBean {
	public static void main(String[]args) {
		
		MatematikaService matematikaService = new MatematikaServiceImpl();
		
		System.out.println("Segitiga -> panjang : 2,lebar = 6");
		System.out.println("luas : " + matematikaService.luasSegitiga(2,6));
		System.out.println("\nPersegi Panjang -> panjan : 2,lebar = 6");
		System.out.println("luas : " + matematikaService.luasPersegiPanjang(2,6));
	}
}					