import java.util.Scanner;

public class StrukMain {

    public static void main(String[] args) {
        StrukService stk = new StrukService(8);
        Scanner sc = new Scanner(System.in);
        char pilih, pick;
        int voucher = 0;
        do {
            System.out.print("No Struk : ");
            int nt = sc.nextInt();
            System.out.print("Tgl/Bulan : ");
            String tgb = sc.next();
            System.out.print("Jumlah barang : ");
            int jb = sc.nextInt();
            System.out.print("Total bayar : ");
            int tb = sc.nextInt();

            Struk st = new Struk(nt, tgb, jb, tb);
            System.out.print("Apakaha anda ingin menambahkan data baru ke stack (y/n) ? : ");
            pilih = sc.next().charAt(0);
            stk.push(st);
        } while (pilih == 'y');

        stk.print();

        do {
            System.out.print("Apakah anda ingin menambahkan / mengurangi barang (t/k dan n untuk no) ? ");
            pick = sc.next().charAt(0);
            if (pick == 't') {
                do {
                    System.out.print("No Struk : ");
                    int nt = sc.nextInt();
                    System.out.print("Tgl/Bulan : ");
                    String tgb = sc.next();
                    System.out.print("Jumlah barang : ");
                    int jb = sc.nextInt();
                    System.out.print("Total bayar : ");
                    int tb = sc.nextInt();

                    Struk st = new Struk(nt, tgb, jb, tb);
                    System.out.print("Apakaha anda ingin menambahkan data baru ke stack (y/n) ? : ");
                    pilih = sc.next().charAt(0);
                    stk.push(st);
                } while (pilih == 'y');
            } else if (pick == 'k') {
                do {
                    stk.pop();
                    voucher++;
                    System.out.println("penukaran struk berhasil, voucher anda sekarang : "+voucher);
                    stk.peek();
                    stk.print();
                    System.out.print("Apakaha anda ingin mengurangi data lagi (y/n) ? : ");
                    pilih = sc.next().charAt(0);
                } while (pilih == 'y');
            }
            System.out.println("lagi ? y/n");
            pick = sc.next().charAt(0);
        } while (pick == 'y');
        stk.print();
    }
}