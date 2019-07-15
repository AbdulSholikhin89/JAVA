package Intermediate;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.Scanner;
public class DataPribadi extends Human
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("Data Pribadi Constructor...");
		DataPribadi cls = new DataPribadi();
		cls.setDataPribadi();
		
	}
	public void setDataPribadi() 
	{
		
		String depan = null;
		String belakang = null;
		String TempatTinggal = null;
		String GolonganDarah = null;
		String gender = null;
		String x = null;
		int age = 0;
		depan = validasiHuruf(x , "Nama Depan :");
		belakang = validasiHuruf(x , "Nama Belakang :");
		TempatTinggal = validasiHuruf(x , "Tempat Tinggal :");
		GolonganDarah = validasiGoldar(x , "Golongan Darah :");
		age = validasiAngka(x, "Masukkan Umur :");
		gender = validasiHuruf(x , "Masukkan Jenis Kelamin :");
			
		voice();
		human(age,gender,depan,belakang,TempatTinggal,GolonganDarah);
	}
		
		voice();
		setAttrMamalia(age,gender);
		human();
		
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
	public static String validasiGoldar(String x , String y){
		boolean a = true; 
		String xy = "Bukanlah Golongan Darah!";
		boolean xyz = false;
		while(a){
		System.out.print(y);
		x = scan.nextLine();
		if(x.trim().isEmpty()){
		System.out.println("Input tidak boleh kosong!");	
		}
		else{
		if(!isStringOnlyAlphabet(x)){
		System.out.println("Input tidak boleh berupa angka !");	
		}else{
		if(x.equals("A") || x.equals("a")){xyz = false;}else if(x.equals("B") || x.equals("b")){xyz= false;}else if(x.equals("O") || x.equals("o")){xyz=false;}else if(x.equals("AB") || x.equals("ab")){xyz = false;	
		
		}else{
		xyz = true;
		a = false;
		return x;
		}
		if(!xyz){System.out.println(x + xy);}
		}}}
		return x;
		
	}
	
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
	

	

