package basic;
import java.util.Scanner;

public class perulanganFor {
	

    public static void main(String[] args) {
        // buat variabel
        int i, j , tinggi;
 
        // input via keyboard dengan memanfaatkan Class Scanner
        Scanner scan = new Scanner(System.in);
 
        // Tampilkan deskripsi tentang Tinggi Segitiga :
        System.out.print("Masukan Jumlah Baris  : ");
 
        // simpan inputan ke dalam variabel tinggi
        tinggi = scan.nextInt();

        // Proses pembuatan bidang segitiga menggunakan dua perulangan
        // perulangan 1
        for (int z = 1 ; z <= tinggi; z++) {
			for(int a=5;a>=z;a--) {
			System.out.print("");
		}
            // perulangan 2
            for (  int x = 1; x <= z; x++)
                System.out.print("*");
 
                System.out.println();
        }
    }


}