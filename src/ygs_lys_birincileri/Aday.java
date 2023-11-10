package ygs_lys_birincileri;

public class Aday {
    private int turk�e;
    private int matematik;
    private int edebiyat;
    private int fizik;
    private String isim;
    
	public Aday(int turk�e, int matematik, int edebiyat, int fizik,String isim) {
		this.turk�e = turk�e;
		this.matematik = matematik;
		this.edebiyat = edebiyat;
		this.fizik = fizik;
		this.isim=isim;
	}
	
	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public int getTurk�e() {
		return turk�e;
	}
	public void setTurk�e(int turk�e) {
		this.turk�e = turk�e;
	}
	public int getMatematik() {
		return matematik;
	}
	public void setMatematik(int matematik) {
		this.matematik = matematik;
	}
	public int getEdebiyat() {
		return edebiyat;
	}
	public void setEdebiyat(int edebiyat) {
		this.edebiyat = edebiyat;
	}
	public int getFizik() {
		return fizik;
	}
	public void setFizik(int fizik) {
		this.fizik = fizik;
	}
	public int puanHesapla() {
		return 0;
		
	}
	
    
}
