package advance;

import java.util.Date;
public class Student8{

	private Long nomorPelajar;
	private String nama;
	private String tempatLahir;
	private Date tanggalLahir;
	private String jenisKelamin;
	private String alamat;
	private String noHp;
	private String jurusan;
	

	public void setNomorPelajar(Long nomorPelajar){
		this.nomorPelajar= nomorPelajar;
	}

		public Long getNomorPelajar(){
		return nomorPelajar;
		}

	public void setNama(String nama){
	this.nama= nama;
	}

		public String getNama(){
		return nama;
		}

	public void setTempatLahir(String tempatLahir){
	this.tempatLahir= tempatLahir;
	}

		public String getTempatLahir(){
		return tempatLahir;
		}

	public void setTanggalLahir(Date tanggalLahir){
		this.tanggalLahir = tanggalLahir;
	}

		public Date getTanggalLahir(){
		return tanggalLahir;
		}

	public void setJenisKelamin(String jenisKelamin){
		this.jenisKelamin= jenisKelamin;
	}

		public String getJenisKelamin(){
		return jenisKelamin;
		}

	public void setAlamat(String alamat){
		this.alamat= alamat;
	}

		public String getAlamat(){
		return alamat;
		}

	public void setNoHp(String noHp){
		this.noHp= noHp;
	}

		public String getNoHp(){
		return noHp;
		}

	public void setJurusan(String jurusan){
		this.jurusan= jurusan;
	}

		public String getJurusan(){
		return jurusan;
		}

}