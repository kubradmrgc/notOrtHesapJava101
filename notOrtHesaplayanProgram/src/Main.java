import java.util.Scanner;

public class Main {
    public static double avg(int a, int b, int c) {
        double averege=(a+b+c)/3;
        return (a+b+c)/3;
    }
    public static void main(String[] args) {
        //Pratik - Not Ortalaması Hesaplayan Program
         //Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.
        //Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.
        //Not: Ternary Operator kullanarak yapılacak.
        System.out.println("*************************************************************************");
        System.out.println("NOT ORTALAMASI HESAPLAYAN PROGRAM");
        System.out.println("*************************************************************************");
        Scanner data = new Scanner(System.in);
        System.out.println("Matematik dersi notlarını giriniz : ");
        System.out.print("1.Sınav notu : ");
        int mNot1 = data.nextInt();
        System.out.print("2.Sınav notu : ");
        int mNot2 = data.nextInt();
        System.out.print("3.Sınav notu : ");
        int mNot3 = data.nextInt();
       // System.out.println("Matematik dersi not ortalaması : "+ avg(mNot1, mNot2, mNot3) + " Dersi geçme durumunuz");
        double matOrt =avg(mNot1,mNot2,mNot3);
        //fizik
        System.out.println("Fizik dersi notlarını giriniz : ");
        System.out.print("1.Sınav notu : ");
        int fNot1 = data.nextInt();
        System.out.print("2.Sınav notu : ");
        int fNot2 = data.nextInt();
        System.out.print("3.Sınav notu : ");
        int fNot3 = data.nextInt();
        double fizOrt = avg(fNot1,fNot2,fNot3);
        //Kimya
        System.out.println("Kimya dersi notlarını giriniz : ");
        System.out.print("1.Sınav notu : ");
        int kNot1 = data.nextInt();
        System.out.print("2.Sınav notu : ");
        int kNot2 = data.nextInt();
        System.out.print("3.Sınav notu : ");
        int kNot3 = data.nextInt();
        double kOrt = avg(kNot1,kNot2,kNot3);
        //türkçe
        System.out.println("Türkçe dersi notlarını giriniz : ");
        System.out.print("1.Sınav notu : ");
        int tNot1 = data.nextInt();
        System.out.print("2.Sınav notu : ");
        int tNot2 = data.nextInt();
        System.out.print("3.Sınav notu : ");
        int tNot3 = data.nextInt();
        double tOrt=avg(tNot1,tNot2,tNot3);
        //tarih
        System.out.println("Tarih dersi notlarını giriniz : ");
        System.out.print("1.Sınav notu : ");
        int tarNot1 = data.nextInt();
        System.out.print("2.Sınav notu : ");
        int tarNot2 = data.nextInt();
        System.out.print("3.Sınav notu : ");
        int tarNot3 = data.nextInt();
        double tarOrt = avg(tarNot1,tarNot2,tarNot3);
        //müzik
        System.out.println("Müzik dersi notlarını giriniz : ");
        System.out.print("1.Sınav notu : ");
        int müzNot1 = data.nextInt();
        System.out.print("2.Sınav notu : ");
        int müzNot2 = data.nextInt();
        System.out.print("3.Sınav notu : ");
        int müzNot3 = data.nextInt();
        double müzOrt = avg(müzNot1,müzNot2,müzNot3);

        String text1 = (matOrt >= 60) ? "Matematik ortalaman " +matOrt+ " Geçtin": "Matematik ortalaman "+matOrt+" Kaldın";
        String text2 = (fizOrt >= 60) ? "Fizik ortalaman " +fizOrt+ " Geçtin": "Fizik ortalaman "+fizOrt+" Kaldın";
        String text3 = (kOrt >= 60) ? "Kimya ortalaman " +kOrt+ " Geçtin": "Kimya ortalaman "+kOrt+" Kaldın";
        String text4 = (tOrt >= 60) ? "Türkçe ortalaman " +tOrt+ " Geçtin": "Türkçe ortalaman "+tOrt+" Kaldın";
        String text5 = (müzOrt >= 60) ? "Müzik ortalaman " +müzOrt+ " Geçtin": "Müzik ortalaman "+müzOrt+" Kaldın";
        String text6 = (tarOrt >= 60) ? "Tarih ortalaman " +tarOrt+ " Geçtin": "Tarih ortalaman "+tarOrt+" Kaldın";
        System.out.println(text1);
        System.out.println(text2);
        System.out.println(text3);
        System.out.println(text4);
        System.out.println(text5);
        System.out.println(text6);









    }
}