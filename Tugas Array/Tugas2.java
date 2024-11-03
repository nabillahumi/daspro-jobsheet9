import java.util.Scanner;

public class Tugas2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        
        int n;
        System.out.println("Jumlah makanan");
        n = sc.nextInt();

        String menu[] = new String [n];
        int harga[] = new int[n];

        for (int i = 0; i < n; i++) {
          System.out.println("Menu " + (i+1)); 
          menu[i] = sc2.next.Line;
          System.out.println("harga " + (i+1));
          harga[i] = sc.nextInt();
        }
        int total = 0;
        for (int i = 0; i <harga.length; i++) {
           total += harga[i] ;
        }
        System.out.println("Total = " +total);
        for (int i= 0; i < harga.length; i++) {
            System.out.println("menu " +);
        }
            
        
    }
}
