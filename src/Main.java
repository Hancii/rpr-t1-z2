import java.util.Scanner;

public class Main {
    public static int sumaCifara(int n){
        int pom = n, suma = 0;
        while (n > 0) {
            pom = n % 10;
            suma += pom;
            n /= 10;
        }
        return suma;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Unesi n: ");
        int n = in.nextInt();
        for (int i = 1; i < n; i++) {
            int suma = sumaCifara(i);
            if (i % suma == 0)System.out.println(i);
            //if (i % suma == 0) System.out.println(i);
        }
    }
}