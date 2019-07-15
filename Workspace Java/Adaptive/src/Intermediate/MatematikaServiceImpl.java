package Intermediate;

public class MatematikaServiceImpl implements MatematikaService {
	public double luasSegitiga(double panjang,double lebar) {
		double hasil = (panjang * lebar)/2;
		return hasil;
	}
	
	public double luasPersegiPanjang(double panjang,double lebar) {
	double hasil = (panjang * lebar);
	return hasil;
	}
	
	public double luasPrismaSegitiga(double pAlas,double lAlas,double tPrisma) {
	double hasil =(pAlas*lAlas*tPrisma)/2;
	return hasil;
	
	
	}
	
	public double volumeKubus(double Sisi) {
	double hasil = Sisi*Sisi*Sisi;
	return hasil;
	

	}
	
}