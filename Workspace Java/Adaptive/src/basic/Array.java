package basic;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		
		String[] namaHari = {"Senin","Selasa","Rabu","Kamis","Jumat","Sabtu","Minggu"};
		
		int[] arrayInt = {1,2,3};
		int hasil = 0;
		
		for ( int z = 0; z <=6; z++) {
			System.out.println(" Hari : " + namaHari[z]);
		}
	}
}