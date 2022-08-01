import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Formül
        //Kilo (kg) / Boy(m) * Boy(m)
        //
        //Çıktısı
        //Lütfen boyunuzu (metre cinsinde) giriniz : 1,72
        //Lütfen kilonuzu giriniz : 105
        //Vücut Kitle İndeksiniz : 35.49215792320173

        int kilo;
        double boy,indeks;
        Scanner inp = new Scanner(System.in);

        System.out.println("Boyunuzu metre cinsinden girin : ");
        boy = inp.nextDouble();

        System.out.println("Kilonuzu girin : ");
        kilo = inp.nextInt();

        indeks = kilo / boy * boy;
        System.out.println("Vücut kitle indeksiniz : " +indeks);
    }
}
