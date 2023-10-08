import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

     int math, music,chemistry,physics,turkish;

     Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuz :");
        math = input.nextInt();

        System.out.print("Müzik Notunuz :");
        music = input.nextInt();

        System.out.print("Kimya Notunuz :");
        chemistry = input.nextInt();

        System.out.print("Fizik Notunuz :");
        physics = input.nextInt();

        System.out.print("Türkçe Notunuz :");
        turkish = input.nextInt();

        if ( math < 0 || math > 100 || physics < 0 || physics > 100 || music < 0 || music > 100 || chemistry < 0 || chemistry > 100 || turkish < 0 || turkish > 100 ){

            System.out.println(" Hata! Lütfen Notları Tekrar Girip 0 ile 100 arasında olduğuna dikkat ediniz!");

        } else {

            double avarge = ( math + chemistry + physics + music + turkish) / 5 ;


            if ( avarge >= 55 ) {
                System.out.println("Tebrikler sınıfı başarıyla geçtiniz!");
            } else if (avarge < 55 ){

                System.out.println("Maalesef ortalamanız istenilen değerinin altında sınıf tekrarına mecburi tutuldunuz!");
            }

            System.out.print("Ortalamanız :" + avarge ) ;
        }


    }
}