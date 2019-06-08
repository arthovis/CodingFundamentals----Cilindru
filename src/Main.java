import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti raza");
        int r = scanner.nextInt();
        System.out.println("Introduceti inaltimea");
        int h = scanner.nextInt();

        Cilindru c=new Cilindru(r,h);
        System.out.println(c);

        System.out.printf("Suprafata cilindrului este: %.2f\n",c.getSurface());
        System.out.printf("Volumul cilindrului este: %.2f",c.getVolume());


    }
}
