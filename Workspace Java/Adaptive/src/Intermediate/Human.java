package Intermediate;

public class Human extends Mamalia {
	
	private String tempatTinggal;
	private String golonganDarah;
	private String depan;
	private String belakang;
	

	public Human()
	{
		System.out.println("Human Constructor....");
		//super.voice();
	}
	
	public void human()
	{
		
		
		
		System.out.println("data diri saya adalah : ");
		
		System.out.println("Nama :" + depan);
		System.out.println("Nama :" + belakang);	
		System.out.println("Tempat tinggal : " + tempatTinggal);
		System.out.println("golongan darah : " +golonganDarah);
		System.out.println("umur :" + getUmur());
		System.out.println("jenis kelamin : "+ getjenisKelamin());
		
	}
	public void voice()
	{
		System.out.println("Manusia berbicara");
	}
	public void setGolonganDarah(String golonganDarah)
	{
		this.golonganDarah = golonganDarah;
	}
	public String getGolonganDarah()
	{
		return this.golonganDarah;
	}
	public void setTempatTinggal(String tempatTinggal)
	{
	
		this.tempatTinggal = tempatTinggal;
	}
	public  String gettempatTinggal()
	{
		return this.tempatTinggal;
	}
	public void setdepan(String depan)
	{
		this.depan = depan;
	}
	public void setbelakang(String belakang)
	{
		this.belakang = belakang;
	}
		
	public String getdepan()
	{
		return this.depan;
	}
	public String getbelakang()
	{
		return this.belakang;
	}


	}	
	
