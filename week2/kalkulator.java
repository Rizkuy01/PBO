package week2;

import java.util.Scanner;

class Kalkulator {
    private int angka1;
    private int angka2;

    public void setAngka1(int angka) {
        this.angka1 = angka;
    }

    public void setAngka2(int angka) {
        this.angka2 = angka;
    }

    public int getAngka1() {
        return angka1;
    }

    public int getAngka2() {
        return angka2;
    }

    public int tambah() {
        return angka1 + angka2;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Kalkulator kalkulator = new Kalkulator();

        System.out.print("Masukkan angka pertama: ");
        int angka1 = scanner.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int angka2 = scanner.nextInt();

        kalkulator.setAngka1(angka1);
        kalkulator.setAngka2(angka2);

        int hasil = kalkulator.tambah();
        System.out.println("Hasil penambahan: " + hasil);

        scanner.close();
    }
}
