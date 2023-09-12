import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Değişkenleri oluşturacağız
        int mat,fizik,kimya,turkce,tarih,muzik;

        //scanner sınıfını tanımladım
        Scanner inp = new Scanner(System.in);

        //kullanıcıdan değerleri alalım
        System.out.print("Mat Notunuzu Giriniz");
        mat= inp.nextInt();
        System.out.println(mat);

        System.out.println("Fizik Notunuzu Giriniz");
        fizik= inp.nextInt();
        System.out.println(fizik);

        System.out.println("Kimya Notunuzu Giriniz");
        kimya= inp.nextInt();
        System.out.println(kimya);

        System.out.println("Türkçe Notunuzu Giriniz");
        turkce= inp.nextInt();
        System.out.println(turkce);

        System.out.println("Tarih Notunuzu Giriniz");
        tarih= inp.nextInt();
        System.out.println(tarih);

        System.out.println("Müzik Notunuzu Giriniz");
        muzik= inp.nextInt();
        System.out.println(muzik);

        int toplam = mat+fizik+kimya+turkce+tarih+muzik;
        double sonuc= toplam/6.0;
        System.out.println("Ortalamanız " + sonuc);


        // Eğer ortalama >= 60 ise  geçti yazmalı değilse de kaldı yazmalı.

        String sonDurum = sonuc>=60 ? "Geçtiniz" : "Kaldınız";
        System.out.println(sonDurum);

    }
}