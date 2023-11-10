package ygs_lys_birincileri;

public class Sayisal extends Aday {

	public Sayisal(int turkçe, int matematik, int edebiyat, int fizik, String isim) {
		super(turkçe, matematik, edebiyat, fizik, isim);
	
	}

	@Override
	public int puanHesapla() {
		return getTurkçe() *5 + getMatematik() *5 + getFizik() * 4 + getEdebiyat() * 1;
	}
	

}
