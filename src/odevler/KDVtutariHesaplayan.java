package odevler;

import java.util.Scanner;

public class KDVtutariHesaplayan {
    /*Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.

(Not : KDV tutarını 18% olarak alın)

KDV'siz Fiyat = 10;

KDV'li Fiyat = 11.8;

KDV tutarı = 1.8;

Ödev
Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.*/

    public static void main(String[] args) {
        float fiyat;

        Scanner input = new Scanner(System.in);
        System.out.print("Ürün fiyatini giriniz : ");
        fiyat = input.nextFloat();
        System.out.println("KDV'siz Fiyat : " + fiyat);

        if (fiyat <= 1000) {
            float tmp = fiyat;
            fiyat *= 1.18;
            System.out.println("KDV oranı : %18");
            System.out.println("KDV tutari: " + (fiyat - tmp));
            System.out.println("KDV'li Fiyat: " + fiyat);
        } else {
            float tmp = fiyat;
            fiyat *= 1.08;
            System.out.println("KDV oranı: %8");
            System.out.println("KDV tutari: " + (fiyat - tmp));
            System.out.println("KDV li Fiyat: " + fiyat);
        }
    }
}
