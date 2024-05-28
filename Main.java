import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double kg;
        double m;
        double kitle;

        Scanner inp= new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz :  ");
        m = inp.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz :  ");
        kg= inp.nextInt();


        kitle = kg / (m * m);

        System.out.println("Vücut Kitle İndeksiniz  :  " + kitle);
    }
}
