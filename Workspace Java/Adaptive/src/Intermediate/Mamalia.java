package Intermediate;

public class Mamalia {
	
	private int umur;
	private String jenisKelamin;
	
	public Mamalia()
	{
		System.out.println("Mamalia Constuctor...");
		
	}
	public void setAttrMamalia(int umur,String jenisKelamin)
	{
		this.umur = umur;
		this.jenisKelamin = jenisKelamin;
	}
	public Integer getUmur() {
		return this.umur;
	}
	public String getjenisKelamin()
	{
		return this.jenisKelamin;
		}
	}