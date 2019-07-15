package Intermediate;
public class APIString {
	public static void main(String[]args) {
		System.out.println("API COnstructor...");
		String s = "String Test";
		System.out.println("String s : " + s);
		
		// ubah ke huruf besar atau kecil
		s= s.toUpperCase();
		System.out.println("s.toUpperCase() : " + s);
		s = s.toLowerCase();
		System.out.println("s.LowerCase() : " + s);
		
		//ubah dari tipe String ke Integers
		s = "5";
		Integer i = Integer.parseInt(s);
		System.out.println("Integer i : " + i);
		
		//ubah dari tipe Integer ke String
		s = String.valueOf(i);
		System.out.println("String valueOf(i) : " + s);
		s= i.toString();
		System.out.println("i.toString : "  + s);
		
		//perbandingan antara class
		if (s.equals(s)) {
			System.out.println("Equal");
		}else {
			System.out.println("not equal");
		}
		
		//menggabungkan 2 String 
		String firstName = "Santo";
		String lastName = "Tan";
		String username =firstName + " " + lastName;
		username = firstName.concat(" ").concat(lastName);
		System.out.println("Username : " + username);
		
		//menggabungkan Sring dengan Integer
		String age = " umur saya ";
		i  = 36;
		age = age + i;
		System.out.println(age);
		
		//mengganti sebuah karakter dengan karakter lain
		String lbl = "Nasi Goreng";
		lbl = lbl.replace(" Goreng"," Bang Abdul");
		System.out.println("lbl yang sudah diganti : " + lbl);
		
		
		//mengecek sebuah String
		boolean b = lbl.contains("Goreng");
		System.out.println("Apakah ada kata goreng : " + b);
		
		//split String sesuai dengan karakter yang kita masukan
		String testString = "Saya belajar java";
		String[]splitArr = testString.split(" ");
		System.out.println("splitArr[0] ;" + splitArr[0]);
		System.out.println("splitArr[1] ;" + splitArr[1]);
		System.out.println("splitArr[2] ;" + splitArr[2]);
		
		//Mengambil karakter tertentu dengan substring 
		String ss = lbl.substring(0,5);
		System.out.println("SubString 1 dari ss Adalah :" + ss);
		ss = lbl.substring(5);
		System.out.println("SubString 1 dari ss Adalah :" + ss);
		
		//menghilangkan spasi dalam string 
		String spasi = "   Testing spasi";
		System.out.println("spasi hilang menjadi :" + spasi.trim());
		
		//mengecek kata terakhir dari sebuah String
		String str1 = new String ("This is a test String");
		String str2 = new String ("This ABC");
		boolean var1 = str1.endsWith("String");
		boolean var2 = str1.endsWith("ABC");
		boolean var3 = str2.endsWith("String");
		boolean var4 = str2.endsWith("ABC");
		
		System.out.println("str1 ends with String : " + var1);
		System.out.println("str1 ends with ABC : " + var2);
		System.out.println("str2 ends with String : " + var3);
		System.out.println("str2 ends with ABC : " + var4);
		
		
		//index kararkter dari string 
		str1 = new String("Disini ada trainning java loh");
		System.out.println("index t dari str1 adalah:" + str1.indexOf(','));
		
		//mengambil kararkter dari index
		System.out.println("char di no 12 adalah : " + str1.charAt(12));
		
	}
}
			
			
			
			
			
			
			
			
			
			
			