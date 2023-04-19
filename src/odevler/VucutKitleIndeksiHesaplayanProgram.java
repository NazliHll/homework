package odevler;

import java.util.Scanner;

public class VucutKitleIndeksiHesaplayanProgram {
    /*Vücut Kitle İndeksi Hesaplama
Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.

Formül
Kilo (kg) / Boy(m) * Boy(m)

Çıktısı
Lütfen boyunuzu (metre cinsinde) giriniz : 1,72
Lütfen kilonuzu giriniz : 105
Vücut Kitle İndeksiniz : 35.49215792320173*/

    public static void main(String[] args) {
      Scanner scan= new Scanner(System.in);
        System.out.print("Lütfen Kilonuzu Kilogram Cinsinden Giriniz: ");
        double kilo= scan.nextDouble();
        System.out.print("Lütfen Boyunuzu Metre Cinsinden Giriniz: ");
        double boy= scan.nextDouble();
        double vKitleInd= kilo/(boy*boy);
        System.out.println("Vücut Kitle İndeksiniz: "+vKitleInd);

    }
}
