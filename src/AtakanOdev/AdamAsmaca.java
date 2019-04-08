package AtakanOdev;

import java.util.Random;
import java.util.Scanner;

public class AdamAsmaca {
	public static void main(String[] args) {
	
		
		AnaMenu();
	}
	
	public static void AnaMenu()
	{
		String [] dictionary= {"bilahare","mahcubiyet","tebessum","kuleli","harbiye","istanbul","gaziantep"};
		int hak=3;
		Random rand = new Random();
		Scanner input=new Scanner(System.in);
		for(int a =0; a<99999999;a++) {
			System.out.println();
			
			
			System.out.println("***************************ATATKAN*********************************");
			System.out.println();
		System.out.println("Oyuna Baslamak Icin (B)");
		System.out.println("Sozluge yeni kelime eklemek icin (Y)");
		System.out.println("Cıkmak icin (C)");
		System.out.println("Seciminiz: ");
		String secim= input.next().toUpperCase();
		if (secim.equals("B"))
		{
			int n=rand.nextInt(dictionary.length)+1;
			oyunaBasla(hak,dictionary[n]);
		}
		else if (secim.equals("Y"))
		{
			dictionary=kelimeEkle(dictionary);
		}
		else if(secim.equals("C"))
		{
			cikis();
			break;
		}
		else {
			System.out.println("Lutfen gecerli bir secim yapiniz!");
		}
		}
	}
	public static void oyunaBasla(int hak, String kelime)
	{
		
		Scanner input=new Scanner(System.in);
		System.out.println("Hak adediniz : "+hak+"tur. Arttirmak ister misiniz ? "
				+ "\nEvet -> E"
				+ "\nHayır -> H");
		String hakArttırımı= input.next().toUpperCase();
		for(int o=0;o<12234234;o++)
		{
		if(hakArttırımı.equals("E"))
		{
			System.out.println("Yeni hak sayısını giriniz");
			hak=input.nextInt();
			break;
		}
		else if(hakArttırımı.equals("Y"))
		{
			System.out.println("Hakkiniz 3 olarak kalmistir.");
			break;
		}
		else
		{
			System.out.println("Yanlis Secim Yaptiniz"
					+ "Tekrar deneyiniz");
		}
		}
		String gizliKelime="";
		for(int i=0; i<kelime.length();i++)
		{
			gizliKelime+="*";
		}
		
		for (int j=hak;j>=0;j--)
		{
			System.out.println("Kelimeniz= "+gizliKelime);
			if(j==0)
			{
				System.out.println("Hakkiniz bitmiştir");
				break;
			}
			System.out.println("Oyuna Başladınız..... Kalan Hak = " + j);
			
			System.out.println("Harf giriniz");
			Scanner input2=new Scanner(System.in);
			char tahmin=input2.nextLine().charAt(0);
			
			
				for(int i=0;i<kelime.length();i++)
				{	
					
					if(kelime.charAt(i)==tahmin)
					{
						gizliKelime=gizliKelime.substring(0,i)+tahmin+gizliKelime.substring(i+1,kelime.length());
					}
				}
			
			
		}
	}

	public static String[] kelimeEkle(String[] dictionary)
	{
		
		Scanner input=new Scanner(System.in);
		String copy[]=new String[dictionary.length+1];
		for(int m = 0 ; m<dictionary.length;m++)
		{
			copy[m]=dictionary[m];
		}
		System.out.println("Eklemek istediğiniz kelimeyi giriniz");
		copy[copy.length-1]=input.next();
		return copy;
	}
	public static void cikis()
	{
		System.out.println("Cikis Yapiliyor... Iyi Gunler");
	}
}
