import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rdm = new Random();
        Scanner input = new Scanner(System.in);
        int randomNumber = rdm.nextInt(100);
        //   System.out.println("Gizli sayı : " + randomNumber);
        int lives = 5;
        int guessNumber;
        boolean OneChance = true;

        while (lives <= 5 && lives > 0 ){
            System.out.print("Bir tahmin giriniz : ");
            guessNumber = input.nextInt();
            if ( guessNumber<0 || guessNumber>99){
                System.out.println("Lütfen 0-100 arasında bir değer giriniz.");
                if (OneChance) {
                    System.out.println("Bir daha hatalı girişinizde canınız bir birim azalacaktır!");
                    OneChance = false;
                } else {
                    lives--;
                    System.out.println("Çok fazla hatalı giriş yaptınız. Kalan canınız : " + lives);
                }
                continue;
            }

            if (guessNumber == randomNumber){
                System.out.println("Tebrikler, tahmininiz doğru!");
                break;
            } else{
                System.out.println("Hatalı bir sayı girdiniz!");
                if (guessNumber > randomNumber){
                    System.out.println("Tahmininiz gizli sayıdan büyük.");
                }else{
                System.out.println("Tahmininiz gizli sayıdan küçük.");
                }
                lives--;
            }
        }
        if (lives<= 0) {
            System.out.println("Kaybettiniz!");
        }
    }
}