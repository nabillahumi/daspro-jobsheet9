import java.util.Scanner;

public class Tugas1 {
    
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Input jumlah mahasiswa : ");
        n = sc.nextInt();

        int nilaiMhs[] = new int[n];
        int total = 0;
        
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Input nilai mahasiswa ke- " +(i+1) + " : ");
            nilaiMhs[i] = sc.nextInt();
            total = total+nilaiMhs[i];
        }
        double rata2 = total/n;
        System.out.println("Rata-rata = " +rata2);

        int nilaiTertinggi = nilaiMhs[0];
        int nilaiTerendah = nilaiMhs[0];

        for (int nilai : nilaiMhs) {
            if (nilai > nilaiTertinggi) {
                nilaiTertinggi = nilai;
            }
            if (nilai < nilaiTerendah) {
                nilaiTerendah = nilai;
            } 
        }
        
        System.out.println("Nilai tertinggi : " + nilaiTertinggi);
            System.out.println("Nilai terendah : " + nilaiTerendah);

        System.out.print("Semua nilai: ");
        for (int nilai : nilaiMhs) {
            System.out.print(nilai + " ");
        }
    }
}
