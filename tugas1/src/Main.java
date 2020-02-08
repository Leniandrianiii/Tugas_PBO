import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nama;
        int banyak;
        int max, min;
        float rata = 0;

        System.out.print("Nama : ");
        nama = scanner.nextLine();

        System.out.print("Masukan banyak nilai = ");
        banyak = scanner.nextInt();
        int [] nilai = new int[banyak];
        for (int i = 0; i < banyak; i++) {
            System.out.print("Nilai ke-" + (i+1) + " : ");
            nilai[i] = scanner.nextInt();
        }

        max =nilai[0];
        min =nilai[0];
        rata = 0;
        for (int i = 0; i < banyak; i++) {
            if (max < nilai[i])
                max = nilai[i];
            if (min > nilai[i])
                min = nilai[i];
            rata += nilai[i];
        }
        rata /= banyak;

        System.out.print("\nNama : " + nama + "\n" +
                "Niali Tertinggi : " + max + "\n" +
                "Nilai Terendah : " + min + "\n" +
                "Nilai Rata-rata : " + rata);
    }
}