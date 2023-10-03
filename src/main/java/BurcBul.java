import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.MonthDay;
import java.util.Date;
import java.util.Scanner;

public class BurcBul {
    public static void main(String[] args) {

        start();
    }

    static Scanner inp = new Scanner(System.in);

    private static void start() {
        boolean isValid;


        do {

            System.out.println("Lütfen doğduğunuz ayı rakam ile giriniz");
            int ay = inp.nextInt();
            System.out.println("Lütfen ayın kaçıncı günü doğduğunuzu giriniz");
            int gun = inp.nextInt();

            switch (ay) {

                case 1:

                    String s1 = gun < 22 ? "Oğlak Burcuna Kaydoldunuz :)" : "Kova Burcuna Kaydoldunuz :)";

                    System.out.println(s1);

                    break;

                case 2:
                    String s2 = gun < 20 ? "Kova Burcuna Kaydoldunuz :)" : "Balık Burcuna Kaydoldunuz :)";

                    System.out.println(s2);

                    break;


                case 3:

                    String s3 = gun < 21 ? "Balık Burcuna Kaydoldunuz :)" : "Koç Burcuna Kaydoldunuz :)";
                    System.out.println(s3);
                    break;


                case 4:

                    String s4 = gun < 21 ? "Koç Burcuna Kaydoldunuz :)" : "Boğa Burcuna Kaydoldunuz :)";
                    System.out.println(s4);

                    break;

                case 5:

                    String s5 = gun < 22 ? "Boğa Burcuna Kaydoldunuz :)" : "İkizler Burcuna Kaydoldunuz :)";
                    System.out.println(s5);
                    break;

                case 6:

                    String s6 = gun < 23 ? "ikizler Burcuna Kaydoldunuz :)" : "Yengeç Burcuna Kaydoldunuz :)";
                    System.out.println(s6);
                    break;


                case 7:

                    String s7 = gun < 23 ? "Yengeç Burcuna Kaydoldunuz :)" : "Aslan Burcuna Kaydoldunuz :)";
                    System.out.println(s7);
                    break;

                case 8:

                    String s8 = gun < 23 ? "Aslan Burcuna Kaydoldunuz :)" : "Başak Burcuna Kaydoldunuz :)";
                    System.out.println(s8);
                    break;
                case 9:

                    String s9 = gun < 23 ? "Başak Burcuna Kaydoldunuz :)" : "Terazi Burcuna Kaydoldunuz :)";
                    System.out.println(s9);
                    break;
                case 10:

                    String s10 = gun < 23 ? "Terazi Burcuna Kaydoldunuz :)" : "Akrep Burcuna Kaydoldunuz :)";
                    System.out.println(s10);
                    break;
                case 11:
                    String s11 = gun < 22 ? "Akrep Burcuna Kaydoldunuz :)" : "Yay Burcuna Kaydoldunuz :)";
                    System.out.println(s11);
                    break;
                case 12:
                    String s12 = gun < 22 ? "Yay Burcuna Kaydoldunuz :)" : "Kova Burcuna Kaydoldunuz :)";
                    System.out.println(s12);
                    break;

                default:
                    System.out.println("Lütfen geçerli bir değer giriniz");

                    System.out.println();
                    System.out.println();
                    System.out.println();





            }

            System.out.println("Devam etmek için 1 \nBitirmek için 2 ye basınız");
            int tamamDevam=inp.nextInt();

            System.out.println();
            System.out.println();

            if (tamamDevam==1){
                isValid=true;


            }else isValid=false;
            System.out.println("See you Latter");


} while (isValid) ;






    }
}
