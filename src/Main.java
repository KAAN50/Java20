import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Sayı Giriniz: ");
        int k=input.nextInt();
        int basSayac = 0;
        int k2 = k;
        int basdegeri;
        int toplam = 0;

        while(k2 != 0){
            k2/=10;
            basSayac++;
        }

        k2=k;
        while (k2 != 0){
            basdegeri =k2%10;
            System.out.println(basdegeri);
            k2/=10;

            toplam+=basdegeri;
        }
        
        System.out.println(toplam);

}
}