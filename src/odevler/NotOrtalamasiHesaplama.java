package odevler;

import java.util.Scanner;

public class NotOrtalamasiHesaplama {

         /*
     Not Ortalaması Hesaplayan Program
     Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.
     Ödev;
      Aynı program içerisinde koşullu ifadeler kullanılarak,
      eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.
      Not : If ve Else kullanılmayacak...
      */


    public static void main(String[] args) {
                System.out.println("Not Ortalamasi Hesaplayan Program");
                Scanner scan = new Scanner(System.in);

                int Mat, Fiz, Kim, Turk, Tar, Muz;

                System.out.print("MATEMATIK NOTUNUZ: ");
                Mat = scan .nextInt();

                System.out.print("TURKCE NOTUNUZ: ");
                Turk = scan .nextInt();

                System.out.print("FIZIK NOTUNUZ: ");
                Fiz = scan .nextInt();

                System.out.print("KIMYA NOTUNUZ: ");
                Kim = scan .nextInt();

                System.out.print("TARIH NOTUNUZ: ");
                Tar = scan .nextInt();

                System.out.print("MUZIK NOTUNUZ: ");
                Muz = scan .nextInt();

                double toplam = Mat + Turk + Fiz + Kim + Tar + Muz;
                double sonuc = toplam / 6;
                System.out.println("GENEL NOT ORTALAMANIZ:" + sonuc);

                System.out.print(sonuc > 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı");

            }
        }



