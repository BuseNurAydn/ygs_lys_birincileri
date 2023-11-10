package ygs_lys_birincileri;

public class EsitAgirlik extends Aday{

	public EsitAgirlik(int turkçe, int matematik, int edebiyat, int fizik, String isim) {
		super(turkçe, matematik, edebiyat, fizik, isim);
		
	}

	@Override
	public int puanHesapla() {
		return getTurkçe() *5 + getMatematik() *5 + getFizik() * 1+ getEdebiyat() * 4;
	}
	

}
