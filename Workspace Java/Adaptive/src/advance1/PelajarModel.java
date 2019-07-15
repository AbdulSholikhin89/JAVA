package advance1;

import java.util.Date;

public class PelajarModel
{
	private Long noPelajar;
	private String nama;
	private String tempatLahir;
	private Date tanggalLahir;
	private String jenisKelamin;
	private String alamat;
	private String noHp;
	private String jurusan;
	
	public Long getNoPelajar()
	{
		return noPelajar;
	}
	
	public void setNoPelajar(Long noPelajar)
	{
		this.noPelajar = noPelajar;
	}
	
	public String getNama()
	{
		return nama;
	}
	
	public void setNama(String nama)
	{
		this.nama = nama;
	}
	
	public String getTempatLahir()
	{
		return tempatLahir;
	}
	
	public void setTempatLahir(String tempatLahir)
	{
		this.tempatLahir = tempatLahir;
	}
	
	public Date getTanggalLahir()
	{
		return tanggalLahir;
	}
	
	public void setTanggalLahir(Date tanggalLahir)
	{
		this.tanggalLahir = tanggalLahir;
	}
	
	public String getJenisKelamin()
	{
		return jenisKelamin;
	}
	
	public void setJenisKelamin(String jenisKelamin)
	{
		this.jenisKelamin = jenisKelamin;
	}
	
	public String getAlamat()
	{
		return alamat;
	}
	
	public void setAlamat(String alamat)
	{
		this.alamat = alamat;
	}
	
	public String getNoHp()
	{
		return noHp;
	}
	
	public void setNoHp(String noHp)
	{
		this.noHp = noHp;
	}
	
	public String getJurusan()
	{
		return jurusan;
	}
	
	public void setJurusan(String jurusan)
	{
		this.jurusan = jurusan;
	}
}