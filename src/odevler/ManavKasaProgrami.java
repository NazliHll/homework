package odevler;

import java.util.Scanner;

public class ManavKasaProgrami {
    /*Manav Kasa Programı
Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.
Meyveler ve KG Fiyatları

Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL
Örnek Çıktı;

Armut Kaç Kilo ? :0
Elma Kaç Kilo ? :1
Domates Kaç Kilo ? :1
Muz Kaç Kilo ? :2
Patlıcan Kaç Kilo ? :3
Toplam Tutar : 21.68 TL*/
        public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        double armut= 2.14,elma= 3.67,domates = 1.11,muz=0.95,patlican= 5.00;

        System.out.println("Kaç Kg Armut istediğinizi Yazınız: ");
        double arKg= scan.nextDouble();

        System.out.println("Kaç Kg Elma İstediğinizi Yazınız");
        double elKg= scan.nextDouble();

        System.out.println("Kaç Kg Domates İstediğinizi Yazınız");
        double domKg= scan.nextDouble();

        System.out.println("Kaç Kg Muz İstediğinizi Yazınız");
        double muzKg= scan.nextDouble();

        System.out.println("Kaç Kg Patlıcan İstediğinizi Yazınız");
        double patKg= scan.nextDouble();

        double arFiyat= arKg*armut,elFiyat=elKg*elma, domFiyat=domKg*domates,muzFiyat=muzKg*muz,patFiyat=patKg*patlican;
        double toplam=arFiyat+elFiyat+domFiyat+muzFiyat+patFiyat;

        System.out.println("Armut: "+arFiyat+"TL"+"\nElma: "+elFiyat+"TL"+"\nDomates: "+domFiyat+"TL"+"\nMuz: "
                +muzFiyat+"TL"+"\nPatlıcan: "+patFiyat+"TL"+"\nToplam: "+toplam+"TL");

    }
}
