import java.util.Scanner;

public class Main {
    // Method untuk mengkonversi suhu dari Reamur ke Celcius
    public static double reamurToCelcius(double reamur) {
        return (5.0 / 4.0) * reamur;
    }

    // Method untuk mengkonversi suhu dari Reamur ke Fahrenheit
    public static double reamurToFahrenheit(double reamur) {
        return ((9.0 / 4.0) * reamur) + 32;
    }

    // Method untuk mengkonversi suhu dari Reamur ke Kelvin
    public static double reamurToKelvin(double reamur) {
        return ((5.0 / 4.0) * reamur) + 273.15;
    }

    // Method untuk menghitung umur berdasarkan tahun lahir
    public static int hitungUmur(int tahunLahir) {
        int tahunSekarang = 2024;
        return tahunSekarang - tahunLahir;
    }

    // Method untuk menghitung luas segitiga
    public static double hitungLuasSegitiga(double alas, double tinggi) {
        return 0.5 * alas * tinggi;
    }

    // Method untuk menghitung keliling segitiga
    public static double hitungKelilingSegitiga(double sisi1, double sisi2, double sisi3) {
        return sisi1 + sisi2 + sisi3;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Konversi suhu dari Reamur
        System.out.print("Masukkan suhu dalam Reamur: ");
        double reamur = scanner.nextDouble();
        double celcius = reamurToCelcius(reamur);
        double fahrenheit = reamurToFahrenheit(reamur);
        double kelvin = reamurToKelvin(reamur);
        System.out.println("Konversi suhu:");
        System.out.println("Celcius: " + celcius);
        System.out.println("Fahrenheit: " + fahrenheit);
        System.out.println("Kelvin: " + kelvin);

        // Hitung umur
        System.out.print("Masukkan tahun lahir Anda: ");
        int tahunLahir = scanner.nextInt();
        int umur = hitungUmur(tahunLahir);
        System.out.println("Umur Anda: " + umur);

        // Hitung luas dan keliling segitiga
        System.out.print("Masukkan panjang alas segitiga: ");
        double alas = scanner.nextDouble();
        System.out.print("Masukkan tinggi segitiga: ");
        double tinggi = scanner.nextDouble();
        System.out.print("Masukkan panjang sisi pertama segitiga: ");
        double sisi1 = scanner.nextDouble();
        System.out.print("Masukkan panjang sisi kedua segitiga: ");
        double sisi2 = scanner.nextDouble();
        System.out.print("Masukkan panjang sisi ketiga segitiga: ");
        double sisi3 = scanner.nextDouble();

        double luasSegitiga = hitungLuasSegitiga(alas, tinggi);
        double kelilingSegitiga = hitungKelilingSegitiga(sisi1, sisi2, sisi3);

        System.out.println("Luas segitiga: " + luasSegitiga);
        System.out.println("Keliling segitiga: " + kelilingSegitiga);

        scanner.close();
    }
}
