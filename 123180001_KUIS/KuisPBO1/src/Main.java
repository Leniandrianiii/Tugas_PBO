import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner inputNama = new Scanner(System.in);
        int pilih, bykSeleksi, jmlh;
        int nilaiTulis, nilaiPraktekCoding, nilaiWawancara, nilaiMicroteaching, nilaiPraktekJaringan, nim;
        String nama;
        char lanjut;
        do {
            try {
                System.out.println("\n=====FORMULIR PENDAFTARAN=====");
                System.out.println("1. Aslab");
                System.out.println("2. Admin Labor");
                System.out.print("\nPilihan : ");
                pilih = input.nextInt();
                if (pilih == 1) {
                    System.out.println("\nFORM PENDAFTARAN CALON ASLAB");
                    jmlh = 1;
                    System.out.print("\nMasukkan jumlah inputan : ");
                    bykSeleksi = input.nextInt();
                    if (bykSeleksi < 1) {
                        throw new RuntimeException();
                    }
                    while (jmlh <= bykSeleksi) {
                        System.out.print("\nMasukkan Nama : ");
                        nama = "";
                        nama += inputNama.nextLine();
                        System.out.print("Masukkan Nim : ");
                        nim = input.nextInt();
                        System.out.print("Nilai Test Tulis : ");
                        nilaiTulis = input.nextInt();
                        System.out.print("Nilai Praktek Koding : ");
                        nilaiPraktekCoding = input.nextInt();
                        System.out.print("Nilai Wawancara : ");
                        nilaiWawancara = input.nextInt();
                        System.out.print("Nilai Microteaching : ");
                        nilaiMicroteaching = input.nextInt();
                        if (nilaiTulis >100 || nilaiMicroteaching>100 || nilaiPraktekCoding>100 || nilaiWawancara>100 || nilaiTulis <1 || nilaiMicroteaching <1 || nilaiPraktekCoding <1 || nilaiWawancara <1 ) {
                            throw new RuntimeException();
                        }
                        PencarianNilai pn = new PencarianNilai(nilaiTulis, nilaiPraktekCoding, nilaiWawancara, nilaiMicroteaching);
                        System.out.println("Nilai Akhir : " + pn.getRata());
                        if (pn.getRata() > 85) {
                            System.out.println("Keterangan : " + pn.checkLulus());
                            System.out.println("Selamat, " + nim + " Telah Berhasil lolos Seleksi Calon Aslab! ");
                        } else {
                            System.out.println("Keterangan : " + pn.checkLulus());
                            System.out.println("Maaf, " + nim + " ditolak sebagai Calon aslab, coba lagi!");
                        }
                        jmlh++;
                    }
                } else if (pilih == 2) {
                    jmlh = 1;
                    System.out.println("\nFORM PENDAFTARAN CALON ADMIN LABOR");
                    System.out.print("\nMasukkan jumlah inputan : ");
                    bykSeleksi = input.nextInt();
                    if (bykSeleksi < 1) {
                        throw new RuntimeException();
                    }
                    while (jmlh <= bykSeleksi) {
                        System.out.print("\nMasukkan Nama : ");
                        nama = "";
                        nama += inputNama.nextLine();
                        System.out.print("Masukkan Nim : ");
                        nim = input.nextInt();
                        System.out.print("Nilai Test Tulis : ");
                        nilaiTulis = input.nextInt();
                        System.out.print("Nilai Praktek Koding : ");
                        nilaiPraktekCoding = input.nextInt();
                        System.out.print("Nilai Wawancara : ");
                        nilaiWawancara = input.nextInt();
                        System.out.print("Nilai Praktek Jaringan : ");
                        nilaiPraktekJaringan = input.nextInt();
                        if (nilaiTulis >100 || nilaiPraktekJaringan>100 || nilaiPraktekCoding>100 || nilaiWawancara>100 || nilaiTulis <1 || nilaiPraktekJaringan <1 || nilaiPraktekCoding <1 || nilaiWawancara <1 ) {
                            throw new RuntimeException();
                        }
                        PencarianNilai pn = new PencarianNilai(nilaiTulis, nilaiPraktekCoding, nilaiWawancara, nilaiPraktekJaringan);
                        System.out.println("Nilai Akhir : " + pn.getRata());
                        if (pn.getRata() > 85) {
                            System.out.println("Keterangan : " + pn.checkLulus());
                            System.out.println("Selamat, " + nim + " Telah Berhasil lolos Seleksi Calon Aslab! ");
                        } else {
                            System.out.println("Keterangan : " + pn.checkLulus());
                            System.out.println("Maaf, " + nim + " ditolak sebagai Calon aslab, coba lagi!");
                        }
                        jmlh++;
                    }
                } else {
                    throw new RuntimeException();
                }
            } catch (Exception e) {
                System.err.println("Invalid Input");
                input.nextLine();
            } finally {
                System.out.print("\nApakah anda ingin lanjut ? (y/n) : ");
                lanjut = input.next().charAt(0);
            }
        } while (lanjut == 'y');

    }

}