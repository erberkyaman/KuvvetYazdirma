import java.util.Scanner;
public class KuvvetBulma {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Sınır Sayısını Giriniz:");
        n = input.nextInt();
        System.out.println("Girilen Sayıya Kadar Olan 4'ün Katları : ");
        for (int i=1; i <n; i*=4)
        {

            System.out.println(i);
        }
        System.out.println("Girilen Sayıya Kadar Olan 5'in Katları : ");
        for (int j=1;j<n; j*=5)
        {

            System.out.println(j);
        }
    }
}
