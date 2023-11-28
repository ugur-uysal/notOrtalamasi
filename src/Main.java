import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //Not ortalamalarını alıp Geçti/Kaldı sonucu veren method yazımı...
        //Değişkenleri tanımlayalım.
        int turkce, matematik, fizik, kimya, tarih, muzik;

        Scanner inp = new Scanner(System.in);

        System.out.print("Türkçe notunuzu giriniz : ");
        turkce = inp.nextInt();

        System.out.print("Matematik notunuzu giriniz : ");
        matematik = inp.nextInt();

        System.out.print("Fizik notunuzu giriniz : ");
        fizik = inp.nextInt();

        System.out.print("Kimya notunuzu giriniz : ");
        kimya = inp.nextInt();

        System.out.print("Tarih notunuzu giriniz : ");
        tarih = inp.nextInt();

        System.out.print("Müzik notunuzu giriniz : ");
        muzik = inp.nextInt();

        int toplam = (turkce + matematik + fizik + kimya + tarih + muzik);
        double ortalama = toplam / 6.0;
        System.out.println("Ortalamanız : " + ortalama);
        boolean sonuc = ortalama > 60;
        String durum = sonuc ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println("Sonuç : " + durum);
    }
}