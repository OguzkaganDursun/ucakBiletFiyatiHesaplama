import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Degiskenler tanimlandi.
        int km, yas, ucusTipi;
        double kmUcreti, toplamUcret, yasIndirimi, indirimliTutar, ciftYonIndirimi;

        /*
        Kullanicidan yas, mesafe ve ucus tipi bilgileri alindi.
        Alinan bilgilere gore bilet fiyati hesaplanip kullaniciya bilgi verildi.
        */
        Scanner scan = new Scanner(System.in);

        System.out.println("--------------------------------" +
                "\nBilet Fiyati Hesaplama \n--------------------------------");

        System.out.print("Lutfen Yasinizi Giriniz : ");
        yas = scan.nextInt();

        System.out.print("Lutfen Mesafeyi KM Cinsinden Giriniz : ");
        km = scan.nextInt();

        System.out.print("Lutfen Ucus Tipini Giriniz! \n1. Tek Yon \n2. Gidis Donus \nSeciminizi Giriniz (1-2) : ");
        ucusTipi = scan.nextInt();

        if (yas >= 0 && yas <= 12)
        {
            kmUcreti = km * 0.10;
            toplamUcret = kmUcreti/2;
            if (ucusTipi == 1)
            {
                System.out.println("Toplam Tutar : " + toplamUcret + " TL");
            }
            else if (ucusTipi == 2)
            {
                ciftYonIndirimi = toplamUcret * 0.20;
                toplamUcret = (toplamUcret - ciftYonIndirimi) * 2;
                System.out.println("Toplam Tutar : " + toplamUcret + " TL");
            }
            else
            {
                System.out.println("--------------------------------");
                System.out.println("Hatali Veri Girdiniz! \nLutfen Bilgilerinizi Kontrol Ettikten Sonra Uygulamayi Tekrar Aciniz!");
            }
        }
        else if (yas >= 12 && yas <= 24)
        {
            kmUcreti = km * 0.10;
            yasIndirimi = kmUcreti * 0.10;
            toplamUcret = kmUcreti - yasIndirimi;
            if (ucusTipi == 1)
            {
                System.out.println("--------------------------------");
                System.out.println("Toplam Tutar : " + toplamUcret + " TL");
            }
            else if (ucusTipi == 2)
            {
                ciftYonIndirimi = toplamUcret * 0.20;
                toplamUcret = (toplamUcret - ciftYonIndirimi) * 2;
                System.out.println("--------------------------------");
                System.out.println("Toplam Tutar : " + toplamUcret + " TL");
            }
            else
            {
                System.out.println("--------------------------------");
                System.out.println("Hatali Veri Girdiniz! \nLutfen Bilgilerinizi Kontrol Ettikten Sonra Uygulamayi Tekrar Aciniz!");
            }
        }
        else if (yas < 65)
        {
            kmUcreti = km * 0.10;
            toplamUcret = kmUcreti;
            if (ucusTipi == 1)
            {
                System.out.println("--------------------------------");
                System.out.println("Toplam Tutar : " + toplamUcret + " TL");
            }
            else if (ucusTipi == 2)
            {
                ciftYonIndirimi = toplamUcret * 0.20;
                toplamUcret = (toplamUcret - ciftYonIndirimi) * 2;
                System.out.println("--------------------------------");
                System.out.println("Toplam Tutar : " + toplamUcret + " TL");
            }
            else
            {
                System.out.println("--------------------------------");
                System.out.println("Hatali Veri Girdiniz! \nLutfen Bilgilerinizi Kontrol Ettikten Sonra Uygulamayi Tekrar Aciniz!");
            }
        }
        else if (yas >= 65)
        {
            kmUcreti = km * 0.10;
            yasIndirimi = kmUcreti * 0.30;
            toplamUcret = kmUcreti - yasIndirimi;
            if (ucusTipi == 1)
            {
                System.out.println("--------------------------------");
                System.out.println("Toplam Tutar : " + toplamUcret + " TL");
            }
            else if (ucusTipi == 2)
            {
                ciftYonIndirimi = toplamUcret * 0.20;
                toplamUcret = (toplamUcret - ciftYonIndirimi) * 2;
                System.out.println("--------------------------------");
                System.out.println("Toplam Tutar : " + toplamUcret + " TL");
            }
            else
            {
                System.out.println("--------------------------------");
                System.out.println("Hatali Veri Girdiniz! \nLutfen Bilgilerinizi Kontrol Ettikten Sonra Uygulamayi Tekrar Aciniz!");
            }
        }
    }
}
