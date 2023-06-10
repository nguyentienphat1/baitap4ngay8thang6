import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        int k;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so luong mang");
        n = scanner.nextInt();
        System.out.println("nhap k");
        k = scanner.nextInt();
        int array[] = new int[n];
        for (int i=0; i<n;i++) {
            System.out.println("nhap phan tu : " + i);
            array[i] = scanner.nextInt();
        }
        for (int i=k;i<n-1;i++){
            array[i] = array[i+1];
        }
        int a1[]= new int[n-1];
        for (int i=0;i< a1.length;i++){
            a1[i] = array[i];
            System.out.println(a1[i]);
        }
    }
}