package syahrul2309066.soal1_pertemuan8_9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sisi1: ");
        double s1 = input.nextDouble();
        System.out.print("Masukkan sisi2: ");
        double s2 = input.nextDouble();
        System.out.print("Masukkan sisi3: ");
        double s3 = input.nextDouble();

        System.out.print("Masukkan warna segitiga: ");
        String warna = input.next();

        System.out.print("Apakah segitiga diisi? (true/false): ");
        boolean isi = input.nextBoolean();

        Segitiga segi = new Segitiga(s1, s2, s3);
        segi.setWarna(warna);
        segi.setIsi(isi);

        System.out.println();
        System.out.println(segi.toString());
        System.out.printf("Luas segitiga: %.2f\n", segi.getArea());
        System.out.printf("Keliling segitiga: %.2f\n", segi.getPerimeter());
        System.out.println("Warna: " + segi.getWarna());
        System.out.println("Terisi: " + segi.isIsi());
    }
}
