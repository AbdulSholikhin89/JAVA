package basic;

import java.util.Scanner;

public class LatihanLogin {

	public static void main (String[] args)
	{
		LatihanLogin latihanLogin = new LatihanLogin();
		latihanLogin.run();
	}
	
	public void run()
	{
		String inputUsername = null;
		String hasil;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Username : ");
		inputUsername = scan.nextLine();
		
		hasil = hasilLogin(inputUsername);
		System.out.println(hasil);
		
	}
	
	public String hasilLogin(String uname)
	{
		String keterangan, inputPass = null;
		String myUsername = "Abdul";
		String myPassword = "170789";
		
		Scanner scan = new Scanner(System.in);
		
		if (!uname.trim().isEmpty())
		{
			if (uname.equalsIgnoreCase(myUsername))
			{
				System.out.print("Password : ");
				inputPass = scan.nextLine();
				
				if (inputPass.equals(myPassword))
				{
					keterangan = "\nBerhasil Login.\nSelamat Datang, " + myUsername;
				}
				else if (inputPass.trim().isEmpty())
				{
					keterangan = "\nPassword tidak boleh kosong.";
				}
				else
				{
					keterangan = "\nPassword salah.";
				}
			}
			else 
			{
				keterangan = "\nUsername tidak ditemukan.";
			}
		}
		else 
		{
			keterangan = "\nSilakan isi username Anda.";
		}
		
		return keterangan;
	}
	
}