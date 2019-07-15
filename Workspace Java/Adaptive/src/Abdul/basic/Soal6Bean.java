package Abdul.basic;

import java.util.*;

public class Soal6Bean
{
	Scanner scan = new Scanner(System.in);
	
	String strInput = null;
	Integer inputan = 0;
	boolean bool = true;
	
	UserModel userModel = null;
	Set<UserModel> userList = new HashSet<UserModel>();
	
	String nama = null;
	String username = null;
	String password = null;
	
	public static void main(String[] args)
	{
		Soal6Bean soal6 = new Soal6Bean();
		soal6.run();
	}
	
	public void run()
	{
		Menu();
	}
	
	public void Menu()
	{
		try 
		{
			System.out.println("\n==============================");
			System.out.println("Aplikasi Pengolahan User");
			System.out.println("==============================");
			System.out.println("1. Input User Baru");
			System.out.println("2. Lihat Semua User");
			System.out.println("3. Cari User");
			System.out.println("4. Exit");
			System.out.print("Masukkan menu : ");
				
			strInput = scan.nextLine();
			
			if (strInput.trim().isEmpty())
			{
				System.out.println("Jangan kosong.");
				Menu();
			}
			else
			{
				inputan = Integer.parseInt(strInput);
				
				switch(inputan)
				{
					case 1  : inputUserBaru();
							  break;
					case 2  : lihatSemuaUser();
							  break;
					case 3  : cariUser();
							  break;
					case 4  : System.exit(0);
							  break;
					default : System.out.println("Hanya menerima input 1-4.");
							  Menu();
							  break;
				}
			}	
		}
		catch (NumberFormatException nfe)
		{
			System.err.println("Masukkan bilangan bulat.");
			Menu();
		}
	}
	
	public void inputUserBaru()
	{
		bool = true;
		int i = 1;
		strInput = null;
		inputan = 0;
		boolean tambahUser = true;
		
		while (bool)
		{	
			while (tambahUser)
			{
				try 
				{
					System.out.println("\n==============================");
					System.out.printf("%19s%n", "Tambah User");
					System.out.println("==============================");	
					
					System.out.print("Masukkan jumlah user : ");
					strInput = scan.nextLine();
					
					if (strInput.trim().isEmpty())
					{
						System.out.println("Jangan kosong.\n");
					}
					else
					{
						inputan = Integer.parseInt(strInput);
						tambahUser = false;
					}
				}
				catch (NumberFormatException nfe)
				{
					System.err.println("Masukkan bilangan bulat.\n");
				}
			}
			
			
			for (int j = 1; j <= inputan; j++)
			{
					boolean inputData = true;
					boolean inputPassword = false;
					boolean inputNama = false;
					
					userModel = new UserModel();
					
					System.out.println("\nData User ke " + (j));
					System.out.println("==============================");
					
					while (inputData)
					{
						System.out.print("Username : ");
						username = scan.nextLine();
						
						if (username.trim().isEmpty())
						{
							System.out.println("Masukan tidak boleh kosong.\n");
						}
						else if (cekUsername(username))
						{
							System.out.println("Username sudah digunakan.\n");
						}
						else
						{
							inputData = false;
							inputPassword = true;
						}	
					}
					
					while (inputPassword)
					{
						System.out.print("Password : ");
						password = scan.nextLine();
						
						if (password.trim().isEmpty())
						{
							System.out.println("Masukan tidak boleh kosong.\n");
						}
						else
						{
							inputPassword = false;
							inputNama = true;
						}
					}
					
					while(inputNama)
					{
						System.out.print("Nama     : ");
						nama = scan.nextLine();
						
						if (nama.trim().isEmpty())
						{
							System.out.println("Masukan tidak boleh kosong.\n");
						}
						else 
						{
							userModel.setUsername(username);
							userModel.setNama(nama);
							userModel.setPassword(password);
							
							userList.add(userModel);
							inputNama = false;
							bool = false;
						}
					}
				
			}
		}
		
		back();	
	}
	
	public void lihatSemuaUser()
	{
		if (userList.size() <= 0)
		{
			System.out.println("Belum ada data User.");
			back();
		}
		else
		{
			System.out.println("\nTotal User : " + userList.size());
			System.out.println(" ============================================================= ");
			System.out.printf(" | %-6s | %-14s | %-16s | %-16s |\n", "No", "Username", "Password", "Nama");
			System.out.println(" ============================================================= ");
			
			Integer nomor = 1;
			
			for(UserModel dataUser : userList)
			{	
				int passLength = dataUser.getPassword().length();
				String[] passTemp = new String[passLength];
				
				for (int y = 0; y < passLength; y++)
				{
					passTemp[y] = "*";
				}
				
				String tempPass = Arrays.toString(passTemp);
				tempPass = tempPass.substring(1, tempPass.length()-1).replace(",", "");
				
				System.out.printf(" | %-6s | %-14s | %-16s | %-16s |\n", 
				nomor, dataUser.getUsername(), tempPass, dataUser.getNama());
				
				nomor++;
			}
			
			back();
		}
		
	}
	
	public void cariUser()
	{
		if (userList.size() <= 0)
		{
			System.out.println("Belum ada data User.");
			back();
		}
		else
		{
			boolean cari = true;
			
			while (cari)
			{
				System.out.print("\nUsername : ");
				username = scan.nextLine();
				
				if (username.trim().isEmpty())
				{
					System.out.println("Masukkan Anda kosong.");
					back();
				}
				else
				{
					for (UserModel dataUser : userList)
					{
						if(dataUser.getUsername().equals(username))
						{
							System.out.println("==============================");
							System.out.printf("%18s%n", "Data User");
							System.out.println("==============================");	
							System.out.println("Username : " + dataUser.getUsername());
							System.out.println("Password : " + dataUser.getPassword());
							System.out.println("Nama     : " +  dataUser.getNama());
							
							cari = false;
							back();
							break;
						}
						else
						{
							System.out.println("Data tidak ditemukan.");
							break;
						}
					}
				}
			}	
		}
		
	}
	
	public void back()
	{
		strInput = null;
		System.out.print("\nTekan Enter untuk kembali ke menu... ");
		strInput = scan.nextLine();
		if (strInput.trim().isEmpty())
		{
			Menu();
		}
		else
		{
			System.out.println("Perintah tidak dikenali.");
			back();
		}
	}
	
	public boolean cekUsername(String username)
	{
		boolean foundUsername = false;
		
		for (UserModel s : userList)
		{
			if(s.getUsername().equals(username))
			{
				foundUsername = true;
				break;
			}
		}
		
		return foundUsername;
	}
}