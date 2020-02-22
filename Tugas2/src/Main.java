import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputUser= new Scanner(System.in);
        double alas,tinggi,tv,pjg,lbr,tinggi1;//tinggiPrismaSegitiga,tinggiLimasSegitiga;
        char kembali=0, kembali1=0,kembali2=0;
        int pilih,pilih1,pilih2;
        do {
            System.out.println("Menu Bangun Datar");
            System.out.println("1.Persegi Panjang");
            System.out.println("2.Segitiga");
            System.out.print("Silahkan Pilih : ");
            pilih = inputUser.nextInt();
            switch (pilih) {
                case 1:
                    System.out.println("Persegi Panjang");
                    System.out.print("Panjang: ");
                    pjg = inputUser.nextDouble();
                    System.out.print("Lebar: ");
                    lbr = inputUser.nextDouble();
                    System.out.print("Tinggi: ");
                    tinggi1 = inputUser.nextDouble();
                    PersegiPanjang persegi = new PersegiPanjang(pjg, lbr );
                    System.out.println("Luas PersegiPanjang : " +  persegi.luasPersegiPanjang());
                    do {
                        System.out.println("Pilih Menu Bangun Ruang: ");
                        System.out.println("1.Balok ");
                        System.out.println("2.Limas Persegi Panjang");
                        System.out.print("PILIH:");
                        pilih2 = inputUser.nextInt();
                        switch (pilih2) {
                            case 1:
                                System.out.println("Balok: ");
                                VolBalok vol = new VolBalok(pjg,lbr);
                                System.out.print("Volume Balok : " + vol.Volume(tinggi1));
                                break;
                            case 2:
                                System.out.println("Limas Persegi Panjang: ");
                                LimasPersegiPanjang limas = new LimasPersegiPanjang (pjg, lbr);
                                System.out.println("Volume Limas PersegiPanjang : " + limas.Volume(tinggi1));
                                break;
                        }
                        System.out.print("Kembali?(y/n)");
                        kembali2 = inputUser.next().charAt(0);
                    } while (kembali2 == 'Y' || kembali2 == 'y');
                    break;
                case 2:
                    System.out.print("Alas Segitiga: ");
                    alas = inputUser.nextDouble();
                    System.out.print("Tinggi: ");
                    tinggi = inputUser.nextDouble();
                    Segitiga luasSegitiga=new Segitiga();
                    System.out.println("luas "+luasSegitiga.luas(alas,tinggi));
                    Segitiga kelilingSegitiga=new Segitiga();
                    double samaSisi=kelilingSegitiga.keliling((float)alas);
                    double samaKaki=kelilingSegitiga.keliling((float)alas,(float)tinggi);
                    System.out.println("keliling Segitiga Sama Sisi ="+samaSisi);
                    System.out.println("Keliling Segitiga Sama Kaki ="+samaKaki);
                    do {
                        System.out.println("Pilih Menu Bangun Ruang: ");
                        System.out.println("1.Limas Segitiga");
                        System.out.println("2.Prisma Segitiga");
                        System.out.print("PILIH : ");
                        pilih1 = inputUser.nextInt();
                        switch (pilih1) {
                            case 1:
                                System.out.print("Tinggi Limas Segitiga: ");
                                tv = inputUser.nextDouble();
                                Limas volumeLimas= new Limas();
                                volumeLimas.setT(tv);
                                System.out.println("Volume= "+ volumeLimas.luas(alas,tinggi));
                                break;
                            case 2:
                                System.out.print("Tinggi Prisma: ");
                                tv = inputUser.nextDouble();
                                PrismaSegitiga volumePrismaSegitiga= new PrismaSegitiga();
                                volumePrismaSegitiga.setT(tv);
                                System.out.println("Volume= "+ volumePrismaSegitiga.luas(alas,tinggi));
                                break;
                        }
                        System.out.print("Kembali?(y/n)");
                        kembali1 = inputUser.next().charAt(0);
                    }   while (kembali1 == 'Y' || kembali1 == 'y');
                    break;
            }
            System.out.print("Kembali ke menu bangun Datar?(y/n)");
            kembali = inputUser.next().charAt(0);
        }while (kembali == 'Y' || kembali == 'y');
    }
}