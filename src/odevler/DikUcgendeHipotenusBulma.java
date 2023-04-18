package odevler;

import java.util.Scanner;

public class DikUcgendeHipotenusBulma {
    /*Dik Üçgende Hipotenüs Bulan Program
Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın.

Ödev
Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.

Formül
Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢

𝑢 = (a+b+c) / 2

Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)*/

    public static void main(String[] args) {
        int a, b;
        Scanner input = new Scanner(System.in);
        System.out.print("A kenar uzunluklarını giriniz : ");
        a = input.nextInt();
        System.out.print("B kenar uzunluklarını giriniz : ");
        b = input.nextInt();
        double c = Math.sqrt((a * a) + (b * b));
        double u = (a + b + c) / 2;
        System.out.println("C (Hipotenüs) uzunlugu = " + c);
        System.out.println("Üçgenin çevresi = " + u * 2);

    }
}
