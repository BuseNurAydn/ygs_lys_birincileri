package ygs_lys_birincileri;

public class EsitAgirlik extends Aday{

	public EsitAgirlik(int turk�e, int matematik, int edebiyat, int fizik, String isim) {
		super(turk�e, matematik, edebiyat, fizik, isim);
		
	}

	@Override
	public int puanHesapla() {
		return getTurk�e() *5 + getMatematik() *5 + getFizik() * 1+ getEdebiyat() * 4;
	}
	

}
