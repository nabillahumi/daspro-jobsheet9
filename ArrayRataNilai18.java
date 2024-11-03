import java.util.Scanner;

public class ArrayRataNilai18 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nilaiMhs = new int[5];
        double totalLulus = 0;
        double totalTidakLulus = 0;
        int jumlahLulus = 0, jumlahTidakLulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke- " +(i+1)+ " : ");
            nilaiMhs[i] = sc.nextInt();
        }
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] >70) {
                totalLulus += nilaiMhs[i];
                jumlahLulus++;
            } else if (nilaiMhs[i] < 70) {
                totalTidakLulus += nilaiMhs[i];
                jumlahTidakLulus++;   
            }
            
        }
        double rataLulus = jumlahLulus > 0 ? totalLulus / jumlahLulus : 0;
        double rataTidakLulus = jumlahTidakLulus > 0 ? totalTidakLulus / jumlahTidakLulus : 0;

        System.out.println("Rata-rata nilai lulus = " + rataLulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rataTidakLulus);
       
    }
}
