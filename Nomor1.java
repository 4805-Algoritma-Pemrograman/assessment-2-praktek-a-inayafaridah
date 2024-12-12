import java.util.Scanner;

public class Nomor1 {
    public static void angkaGanjil(int n) {
        System.out.println("Tampilkan angka ganjil dari 0 hingga : " + n);
        for (int i= 1; i <= n; i += 2) {
            System.out.println(i + "");
        }
        System.out.println();
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nilai n: ");
        int N = input.nextInt();
        
        angkaGanjil(N);
    }
}
