import java.util.Scanner;

public class StudiKasus206 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nama mahasiswa : ");
        String nama = sc.nextLine();
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        String jenisKegiatan = sc.nextLine().trim();

        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") || 
            jenisKegiatan.equalsIgnoreCase("BAKORMA") || 
            jenisKegiatan.equalsIgnoreCase("MANDIRI")) {
            
            System.out.print("Jumlah dokumen : ");
            int jmlDokumen = sc.nextInt();
            System.out.print("Peringkat juara : ");
            int peringkat = sc.nextInt();

            if (peringkat >= 1 && peringkat <= 3) {
                if (jmlDokumen == 4) {
                    System.out.println("Status : Dana penghargaan diberikan.");
                } else {
                    int kurang = 4 - jmlDokumen;
                    System.out.println("Status : Dokumen tidak lengkap (kurang " + kurang + " dokumen). Dana penghargaan tidak diberikan.");
                }
            } else {
                System.out.println("Status : Bukan juara 1, 2, atau 3. Dana penghargaan tidak diberikan.");
            }

        } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {
            System.out.print("Jumlah dokumen : ");
            int jmlDokumen = sc.nextInt();
            System.out.print("Status pendanaan PKM (1 = didanai, 0 = tidak) : ");
            int statusPendanaan = sc.nextInt();

            if (statusPendanaan == 1) {
                if (jmlDokumen == 4) {
                    System.out.println("Status : Dana penghargaan diberikan.");
                } else {
                    int kurang = 4 - jmlDokumen;
                    System.out.println("Status : Dokumen tidak lengkap (kurang " + kurang + " dokumen). Dana penghargaan tidak diberikan.");
                }
            } else {
                System.out.println("Status : Proposal tidak didanai. Dana penghargaan tidak diberikan.");
            }

        } else if (jenisKegiatan.equalsIgnoreCase("LAINNYA")) {
            System.out.println("Status : Kegiatan di luar ketentuan. Dana penghargaan tidak diberikan.");
        } else {
            System.out.println("Status : Jenis kegiatan tidak valid.");
        }

        sc.close();
    }
}
