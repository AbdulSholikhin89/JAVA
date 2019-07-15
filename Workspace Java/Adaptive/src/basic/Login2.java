package basic;

import java.util.Scanner;

public class Login2 {

public static void main(String[] args) {
	Login2 login2 = new Login2 ();
	login2.run();
	}

	public void run() {
		
		Scanner scanner = new Scanner(System.in);
		
		String nama = null;
		String username = "Abdul Sholikhin";
		String password = "150790";	
			
		
		System.out.print("username : ");
		nama = scanner.nextLine();
		
	if (nama.trim().isEmpty()) 
	{	
		System.out.print("nama tidak boleh kosong"); 
		
	} else if (nama.trim().equalsIgnoreCase(username)) {
		System.out.print("password : ");
		nama = scanner.nextLine();
		
		if (password.trim().isEmpty())
		{
			System.out.print("password mohon di isi ");
		} else if (nama.trim().equalsIgnoreCase(password)) {
			System.out.print(" Login Berhasil");
		} else {
			System.out.print("password salah");
		}
	} else {
		System.out.print("Username salah");
			
	}
	
	}
}

	
