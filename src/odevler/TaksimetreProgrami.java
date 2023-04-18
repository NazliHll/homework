package odevler;

import java.util.Scanner;

public class TaksimetreProgrami {
    public static void main(String[] args) {
       /* Taksimetre Programı
        Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

        Taksimetre KM başına 2.20 TL tutmaktadır.
        Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
        Taksimetre açılış ücreti 10 TL'dir.*/
        float kmBasina = 2.2f, minTutar = 20f, tAcilis = 10f, toplamUcret;
        int KM;
        Scanner girdi = new Scanner(System.in);

        System.out.print("Gidilecek Mesafeyi Giriniz (KM) : ");
        KM = girdi.nextInt();

        toplamUcret = (KM * kmBasina) + tAcilis;

        double b = (toplamUcret <= 20) ? 20 : toplamUcret;

        System.out.println("Toplam Ödemeniz Gereken Tutar : " + b);

    }
}
