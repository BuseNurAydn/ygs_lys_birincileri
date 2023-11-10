package ygs_lys_birincileri;

public class Aday {
    private int turkçe;
    private int matematik;
    private int edebiyat;
    private int fizik;
    private String isim;
    
	public Aday(int turkçe, int matematik, int edebiyat, int fizik,String isim) {
		this.turkçe = turkçe;
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

	public int getTurkçe() {
		return turkçe;
	}
	public void setTurkçe(int turkçe) {
		this.turkçe = turkçe;
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
