package ygs_lys_birincileri;

import java.util.Scanner;

public class Test {
	public static<E extends Aday> E birinci(E e1,E e2,E e3){
		
      if(e1.puanHesapla() > e2.puanHesapla() && e1.puanHesapla() > e3.puanHesapla()) {
    	  return e1;
      }else if(e2.puanHesapla() > e1.puanHesapla() && e2.puanHesapla() > e3.puanHesapla()) {
    	  return e2;
      }else if(e2.puanHesapla() > e1.puanHesapla() && e2.puanHesapla() > e3.puanHesapla()) {
         return e3;
      }else {
    	  return e3;
      }

		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ygs-Lys Birincileri Hesaplama Programý");
		
		String islemler = "Ýþlemler...\n"
				          +"1- Eþitaðýrlýk ögrencileri birincisi\n"
				          +"2- Sayýsal ögrencileri birincisi\n"
				          +"Çýkýþ : q";
		
		System.out.println("***********************");
		System.out.println(islemler);
		System.out.println("************************");
 
		while(true) {
			//BÝRÝNCÝ ÖGRENCÝ
			System.out.print("1.öðrencinin ismini giriniz: ");
			String isim1 = scan.nextLine();
			System.out.print("Netler..(Türkçe Matematik Edebiyat Fizik ): ");
			int turkçe1 = scan.nextInt();
			int mat1 = scan.nextInt();
			int edeb1 = scan.nextInt();
			int fizik1 = scan.nextInt();
			scan.nextLine();
			 
			//ÝKÝNCÝ ÖGRENCÝ
			System.out.print("2.öðrencinin ismini giriniz: ");
			String isim2 = scan.nextLine();
			System.out.print("Netler..(Türkçe Matematik Edebiyat Fizik ): ");
			int turkçe2 = scan.nextInt();
			int mat2 = scan.nextInt();
			int edeb2 = scan.nextInt();
			int fizik2 = scan.nextInt();
			scan.nextLine();
			
			//ÜÇÜNCÜ ÖÐRENCÝ
			System.out.print("3.öðrencinin ismini giriniz: ");
			String isim3 = scan.nextLine();
			System.out.print("Netler..(Türkçe Matematik Edebiyat Fizik ): ");
			int turkçe3 = scan.nextInt();
			int mat3 = scan.nextInt();
			int edeb3 = scan.nextInt();
			int fizik3 = scan.nextInt();
			scan.nextLine();
			
			
			System.out.println("Yapacaðýnýz iþlemi giriniz: ");
			String iþlem = scan.nextLine();
			
			
			if(iþlem.equals("q")) {
				System.out.println("Programdan çýkýlýyor...");
				break;
			}else if(iþlem.equals("1")) {
				
				EsitAgirlik ogrenci1 = new EsitAgirlik(turkçe1, mat1, edeb1, fizik1, isim1);
				EsitAgirlik ogrenci2 = new EsitAgirlik(turkçe2, mat2, edeb2, fizik2, isim2);
				EsitAgirlik ogrenci3 = new EsitAgirlik(turkçe3, mat3, edeb3, fizik3, isim3);
				
				EsitAgirlik birinci = birinci(ogrenci1, ogrenci2, ogrenci3);
				System.out.println("Birinci Eþit aðýrlýk ögrencisi: " + birinci.getIsim());
				
				
			}else if(iþlem.equals("2")) {
				
				Sayisal ogrenci1 = new Sayisal(turkçe1, mat1, edeb1, fizik1, isim1);
				Sayisal ogrenci2 = new Sayisal(turkçe2, mat2, edeb2, fizik2, isim2);
				Sayisal ogrenci3 = new Sayisal(turkçe3, mat3, edeb3, fizik3, isim3);
				
				Sayisal birinci = birinci(ogrenci1, ogrenci2, ogrenci3);
				System.out.println("Birinci Sayýsal ögrencisi: " + birinci.getIsim());
				
			}else {
				System.out.println("Geçersiz iþlem girdiniz...");
			}
		}
	}

}
