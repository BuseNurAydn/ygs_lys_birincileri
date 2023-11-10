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
		System.out.println("Ygs-Lys Birincileri Hesaplama Program�");
		
		String islemler = "��lemler...\n"
				          +"1- E�ita��rl�k �grencileri birincisi\n"
				          +"2- Say�sal �grencileri birincisi\n"
				          +"��k�� : q";
		
		System.out.println("***********************");
		System.out.println(islemler);
		System.out.println("************************");
 
		while(true) {
			//B�R�NC� �GRENC�
			System.out.print("1.��rencinin ismini giriniz: ");
			String isim1 = scan.nextLine();
			System.out.print("Netler..(T�rk�e Matematik Edebiyat Fizik ): ");
			int turk�e1 = scan.nextInt();
			int mat1 = scan.nextInt();
			int edeb1 = scan.nextInt();
			int fizik1 = scan.nextInt();
			scan.nextLine();
			 
			//�K�NC� �GRENC�
			System.out.print("2.��rencinin ismini giriniz: ");
			String isim2 = scan.nextLine();
			System.out.print("Netler..(T�rk�e Matematik Edebiyat Fizik ): ");
			int turk�e2 = scan.nextInt();
			int mat2 = scan.nextInt();
			int edeb2 = scan.nextInt();
			int fizik2 = scan.nextInt();
			scan.nextLine();
			
			//���NC� ��RENC�
			System.out.print("3.��rencinin ismini giriniz: ");
			String isim3 = scan.nextLine();
			System.out.print("Netler..(T�rk�e Matematik Edebiyat Fizik ): ");
			int turk�e3 = scan.nextInt();
			int mat3 = scan.nextInt();
			int edeb3 = scan.nextInt();
			int fizik3 = scan.nextInt();
			scan.nextLine();
			
			
			System.out.println("Yapaca��n�z i�lemi giriniz: ");
			String i�lem = scan.nextLine();
			
			
			if(i�lem.equals("q")) {
				System.out.println("Programdan ��k�l�yor...");
				break;
			}else if(i�lem.equals("1")) {
				
				EsitAgirlik ogrenci1 = new EsitAgirlik(turk�e1, mat1, edeb1, fizik1, isim1);
				EsitAgirlik ogrenci2 = new EsitAgirlik(turk�e2, mat2, edeb2, fizik2, isim2);
				EsitAgirlik ogrenci3 = new EsitAgirlik(turk�e3, mat3, edeb3, fizik3, isim3);
				
				EsitAgirlik birinci = birinci(ogrenci1, ogrenci2, ogrenci3);
				System.out.println("Birinci E�it a��rl�k �grencisi: " + birinci.getIsim());
				
				
			}else if(i�lem.equals("2")) {
				
				Sayisal ogrenci1 = new Sayisal(turk�e1, mat1, edeb1, fizik1, isim1);
				Sayisal ogrenci2 = new Sayisal(turk�e2, mat2, edeb2, fizik2, isim2);
				Sayisal ogrenci3 = new Sayisal(turk�e3, mat3, edeb3, fizik3, isim3);
				
				Sayisal birinci = birinci(ogrenci1, ogrenci2, ogrenci3);
				System.out.println("Birinci Say�sal �grencisi: " + birinci.getIsim());
				
			}else {
				System.out.println("Ge�ersiz i�lem girdiniz...");
			}
		}
	}

}
