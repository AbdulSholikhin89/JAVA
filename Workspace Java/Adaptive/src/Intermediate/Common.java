package Intermediate;
import java.util.Scanner;

public class Common{
	private static Scanner scan = new Scanner(System.in);
	public static int validasiAngka(String x , String y){
		boolean a = true;
		int z = 0;
		while(a){
		System.out.print(y);
		try{
		x = scan.nextLine();
		if(x.trim().isEmpty()){
		System.out.println("Input tidak boleh kosong!");	
		}
		else{
		z = Integer.parseInt(x);
		a = false;
		}
		}catch(NumberFormatException nfe){
		System.out.println("Input harus berupa angka!");	
		}
		}return z;
	}
	public static double validasiDouble(String x , String y){
		boolean a = true;
		double z = 0;
		while(a){
		System.out.print(y);
		try{
		x = scan.nextLine();
		if(x.trim().isEmpty()){
		System.out.println("Input tidak boleh kosong!");	
		}
		else{
		z = Double.parseDouble(x);
		a = false;
		}
		}catch(NumberFormatException nfe){
		System.out.println("Input harus berupa angka!");	
		}
		}return z;
	}
	
	public static boolean isStringOnlyAlphabet(String str) 
    { 
        return ((str != null) 
                && (!str.equals("")) 
                && (str.matches("^[a-zA-Z]*$"))); 
    }
	
	public static String validasiHuruf(String x , String y){
		boolean a = true; 
		while(a){
		System.out.print(y);
		x = scan.nextLine();
		if(x.trim().isEmpty()){
		System.out.println("Input tidak boleh kosong!");	
		}
		else{
		if(isStringOnlyAlphabet(x)==false){
		System.out.println("Input tidak boleh berupa angka !");	
		}else{
		a = false;
		return x;
		}}}
		return x;
		
	}
	
}