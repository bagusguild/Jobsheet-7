import java.util.Scanner;

public class StackMain {
    
    public static void main(String[] args) {
        Stack stk = new Stack(5);
        Scanner sc = new Scanner(System.in);
        Scanner scn = new Scanner(System.in);
        char pilih, pick;
        do {
            System.out.print("Jenis : ");
            String j = sc.nextLine();
            System.out.print("Warna : ");
            String w = sc.nextLine();
            System.out.print("Merk : ");
            String m = sc.nextLine();
            System.out.print("Ukuran : ");
            String u = sc.nextLine();
            System.out.print("Harga : ");
            double h = scn.nextDouble();

            Pakaian p = new Pakaian(j, w, m, u, h);
            System.out.print("Apakaha anda ingin menambahkan data baru ke stack (y/n) ? : ");
            pilih = sc.next().charAt(0);
            sc.nextLine();
            stk.push(p);
        } while (pilih == 'y');

        stk.print();

        do {
            System.out.print("Apakah anda ingin menambahkan / mengurangi barang (t/k dan n untuk no) ? ");
            pick = sc.next().charAt(0);
            if (pick == 't') {
                do {
                    System.out.println("Masukkan data barang yang ingin anda tambahkan");
                    System.out.println(" ");
                    System.out.print("Jenis : ");
                    String j = sc.next();
                    System.out.print("Warna : ");
                    String w = sc.next();
                    System.out.print("Merk : ");
                    String m = sc.next();
                    System.out.print("Ukuran : ");
                    String u = sc.next();
                    System.out.print("Harga : ");
                    double h = sc.nextDouble();

                    Pakaian p = new Pakaian(j, w, m, u, h);
                    System.out.print("Apakaha anda ingin menambahkan data baru lagi (y/n) ? : ");
                    pilih = sc.next().charAt(0);
                    sc.nextLine();
                    stk.push(p);
                } while (pilih == 'y');
            } else if (pick == 'k') {
                do {
                    stk.pop();
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
        System.out.println("");
        stk.getMin();
    }
}
