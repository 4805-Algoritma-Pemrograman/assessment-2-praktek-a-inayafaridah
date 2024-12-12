import java.util.ArrayList;
import java.util.Scanner;

public class Nomor2 {
    static ArrayList<Integer> keranjangBelanja = new ArrayList<>();
    static int[] hargaMenu = {35000, 45000, 20000, 15000};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pilihan;

        do {
            System.out.print("Masukan nama menu [Burger Kezel/Steak Bete/Spaghetti Overthinking/French fries sambat]: ");
            pilihan = scanner.nextLine();

            switch (pilihan.toLowerCase()) {
                case "burger kezel":
                    keranjangBelanja.add(hargaMenu[0]);
                    break;
                case "steak bete":
                    keranjangBelanja.add(hargaMenu[1]);
                    break;
                case "spaghetti overthinking":
                    keranjangBelanja.add(hargaMenu[2]);
                    break;
                case "french fries sambat":
                    keranjangBelanja.add(hargaMenu[3]);
                    break;
                default:
                    System.out.println("Menu tidak terdaftar.");
            }

            System.out.print("Input lagi (Y/N)?: ");
            pilihan = scanner.nextLine();
        } while (pilihan.equalsIgnoreCase("Y"));

        int totalBelanja = hitungTotalBelanja();
        int diskon = hitungDiskon(totalBelanja);
        int totalBayar = totalBelanja - diskon;

        System.out.println("Total item pesanan = " + keranjangBelanja.size());
        System.out.println("Total yang harus dibayar = " + totalBayar);
    }

    static int hitungTotalBelanja() {
        int total = 0;
        for (int harga : keranjangBelanja) {
            total += harga;
        }
        return total;
    }

    static int hitungDiskon(int totalBelanja) {
        if (totalBelanja < 50000) {
            return 0;
        } else if (totalBelanja >= 50000 && totalBelanja < 100000) {
            return (int) (totalBelanja * 0.05);
        } else {
            return (int) (totalBelanja * 0.1);
        }
    }
}
