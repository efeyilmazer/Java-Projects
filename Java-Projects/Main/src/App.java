öimport java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.annotation.Repeatable;
import javax.lang.model.util.ElementScanner14;
import javax.swing.event.SwingPropertyChangeSupport;

public class App {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
                            //Ekrana yazdırma
        System.out.println("Hello, World!");
                            //Sayı ve karakter değerleri
 int a = 32;
    double b = 3.14;
    float c = 3.14f;
    char d = 'A';
    String test = "Test";
    boolean e = true;
        System.out.println ("a:" + a);
        System.out.println ("b:" + b);
        System.out.println ("c:" + c);
        System.out.println ("d:" + d);
        System.out.println ("e:" + e);
        System.out.println ("test:" + test);
                            //Cebirsel işlemler
 int a = 20;
    int b = 15;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / (double)b);
        System.out.println(a % b);
                            //Değer arttırma yolları (Hepsi 1 arttırır)
  int a = 5;
  a = a + 1;
  a += 1;
  a++;
  System.out.println(a); 

                            //Girilen sayıyı ekrana yazdıran program
System.out.println("Sayi giriniz");
String sayi = br.readLine();
System.out.println("Girilen sayi = "+sayi);

                            //50'den fazlaysa geçiren not programı

System.out.println ("Not giriniz");
String s =br.readLine();
int not = Integer.parseInt(s);

if (not >= 50)
        System.out.println("Geçti");
if (not < 50)
        System.out.println("Kaldı");

                            //Sayının tek mi çift mi olduğunu bulan program
 System.out.println("Sayı giriniz");
String s = br.readLine();
int sayi = Integer.parseInt(s);
if (sayi % 2 == 0)
        System.out.println("Sayı çifttir");
else
        System.out.println("Sayı tektir");
        
                            //Tüketilen voltaja bağlı olarak fatura hesaplama programı         
 System.out.println("Voltaj birimini giriniz");
String s = br.readLine();
int voltaj = Integer.parseInt(s);
int fatura;

if (voltaj > 100) {
    if (voltaj > 200) {
        if (voltaj > 300) {
            fatura = 200 + 100 * 5 + 100 * 6 +(voltaj - 300)* 8;
        }
        else 
            fatura = 200 + 100 * 5 + (voltaj - 200) * 6;
    }
    else 
        fatura = 200 + (voltaj - 100) * 5; 
}
else
    fatura = 200;
    System.out.println("Ödenecek Fatura = " + fatura); */

                        //Girilen sayıyı Küçük/Büyük sıralaması yapar
   int sayi1, sayi2;
System.out.println("Bir sayı giriniz");
String s = br.readLine();
sayi1 = Integer.parseInt(s);
System.out.println("Bir sayı giriniz");
s = br.readLine();
sayi2 = Integer.parseInt(s);

if (sayi1<sayi2) {
    System.out.println("Küçük sayı : " + sayi1);
    System.out.println("Büyük sayı : " + sayi2);
}
else {
    System.out.println("Küçük sayı : " + sayi2);
    System.out.println("Büyük sayı : " + sayi1);
}

                            // Girilen 3 tam sayıdan en büyüğünü yazdıran program
int sayi1,sayi2,sayi3;
    System.out.println("Bir sayı giriniz");
    String s = br.readLine();
    sayi1 = Integer.parseInt(s);
    System.out.println("Bir sayı giriniz");
    s = br.readLine();
    sayi2 = Integer.parseInt(s);
    System.out.println("Bir sayı giriniz");
    s = br.readLine();
    sayi3 = Integer.parseInt(s);
    if (sayi1>=sayi2 && sayi1>=sayi3)
        System.out.println("En büyük sayı = "+ sayi1); 
        else
            if (sayi2>=sayi1 && sayi2 >=sayi3)
                System.out.println("En büyük sayı = " + sayi2);
                    else
                    System.out.println("En büyük sayı = " + sayi3);
                     
                            //Klavyeden girilen sayıya denk gelen hata kodu
 System.out.println("Hata kodunu giriniz");
String s = br.readLine();
    int HataKodu = Integer.parseInt(s);

    switch (HataKodu) {
        case 1: System.out.println("OK"); break;
        case 2: System.out.println("WARNING"); break;
        case 3: System.out.println("ERROR"); break;
        case 4: System.out.println("PANIC"); break;
        case 5: System.out.println("UNKNOWN"); break;
        default: System.out.println("YANLIŞ KOD GİRDİNİZ"); break;
    } 
                            //İki sayı üzerinde switch komutu kullanarak cebirsel işlem
 int sayi1,sayi2;
System.out.println(" + - * /");
String s = br.readLine();
char c = s.charAt(0);
System.out.println("1. Sayıyı giriniz");
s = br.readLine();
sayi1 = Integer.parseInt(s);
System.out.println("2. Sayıyı giriniz");
s = br.readLine();
sayi2 = Integer.parseInt(s);
switch (c) {
    case '+':
        System.out.println("Sonuç = " + (sayi1+sayi2)); break;
    case '-':
        System.out.println("Sonuç = " + (sayi1-sayi2)); break;
    case '*':
        System.out.println("Sonuç = " + (sayi1*sayi2)); break;
    case '/':
        System.out.println("Sonuç = " + (sayi1/sayi2)); break;
            default: System.out.println("Yanlış operator girdiniz");
    } 
    
                            //1 ile 100 arasındaki tam sayıların, tek sayıların ve çift sayıların toplamını hesaplayan program

int tam=0, tek=0, cift=0;
    for (int i=1; i<101;i++) {
        tam = tam + i;
        if (i%2 != 0)
        tek = tek + i;
        else
        cift = cift + i;
    }
        System.out.println("Tamsayılar toplamı = " + tam);
        System.out.println("Tek sayılar toplamı = " + tek);
        System.out.println("Çift sayılar toplamı = " + cift);

                            //Girilen herhangi bir tamsayının basamaklarını ayrı ayrı ekrana yazdıran program
/int sayi, basamak;
    System.out.println("Sayı giriniz");
    String s = br.readLine();
    sayi = Integer.parseInt(s);
    while (sayi!=0) {
        basamak = sayi%10;
        System.out.println(basamak);
        sayi = (sayi-basamak)/10;
    }

                            //-1 Değeri girilene kadar sayı okuyup ortalamasını alan program
int Toplam=0, Sayi=123, Sayac=0;
float Ortalama;
    while (Sayi!=-1) {
        System.out.println("Sayı giriniz:");
        String s = br.readLine();
        Sayi = Integer.parseInt(s);
        Toplam += Sayi;
        Sayac++;
    }
    Ortalama = (float)++Toplam/--Sayac;
    System.out.println("Ortalama = "+ Ortalama);

                            //Sürekli sayı okuyup sıfır girilene kadar teklerin ve çiftlerin ayrı ortalamasını alan program
 int sayi,Tektoplam = 0, CiftToplam=0, Teksayac=0,Ciftsayac=0;
float CiftOrtalama,TekOrtalama;
    String s;
        do {
            System.out.println("Sayı giriniz");
            s= br.readLine();
            sayi = Integer.parseInt(s);
                if (sayi%2==0) {
                    CiftToplam += sayi;
                    Ciftsayac++;
                }
                    else {
                        Tektoplam += sayi;
                        Teksayac++;
                    }
        }
        while (sayi!=0);
        TekOrtalama = (float)Tektoplam/Teksayac;
        CiftOrtalama = (float) CiftToplam/--Ciftsayac;
            System.out.println("Tek sayıların ortalaması = " +TekOrtalama);
            System.out.println("Çift sayıların ortalaması = " +CiftOrtalama); 

            //Eleman sayısı ve değerlerini girip elemanların toplamını yazan program
                            
int [] ilkdizimiz;
int diziuzunlugu, Toplam=0;
        System.out.println("Dizinin eleman sayısını giriniz");
        String s = br.readLine();
        diziuzunlugu = Integer.parseInt(s);
        ilkdizimiz = new int [diziuzunlugu];
        for (int i=0;i<diziuzunlugu;i++) {
            System.out.println("Dizinin " + (i+1) + ". elemanını giriniz");
            s = br.readLine();
            ilkdizimiz [i] = Integer.parseInt(s);
            Toplam += ilkdizimiz[i];
        }
            System.out.println("Toplam = " +Toplam); 

/* 
• Bir nakliye şirketi için uygulama geliştireceğimizi düşünelim.
• Kutu kavramını soyutlayarak, kutuları programımızda temsil eden bir sınıf yazalım.
• Bir kutu için 3 adet temel veriye sahibiz: En, Boy, Yükseklik.
• Ayrıca kırılacak eşya olup olmadığı ve eğer bir zorunluluk varsa hangi yüzeyin tabana geleceği.
*/

class Kutu {
    public double x;
    public double y;
    public double z;
    public boolean kirilir;
    public int taban_kodu;
    public Kutu() {
        x=y=z=5.0;
        kirilir = false;
        taban_kodu = 0;
    }
    public Kutu(double xe, double ye, double ze, boolean kr, int tk) {
        x= xe;
        y= ye;
        z= ze;
        kirilir = kr;
        taban_kodu = tk;
    }
}
Kutu K1 = new Kutu(10.0,20.0,3.0,true,3);
Kutu K2 = new Kutu();
//K1 VERİLERİ
    K1.x = 3.0;
    K1.y = 4.0;
    K1.z = 5.0;
    K1.kirilir = false;
    K1.taban_kodu = 0;
//K2 VERİLERİ
    K2.x = 5.0;
    K2.y = 10.0;
    K2.z = 7.5;
    K2.kirilir = true;
    K2.taban_kodu = 1;
        System.out.println("K1 Hacmi : " + (K1.x*K1.y*K1.z));
            if (K1.kirilir==false)
                System.out.println("K1'de kırılacak şey yok");
            else
                System.out.println("K1'de kırılacak şey var");

                if (K1.taban_kodu==0)
                    System.out.println("Yüzey farketmez");
                else 
                    System.out.println("Tabana " + K1.taban_kodu + ". yüzey gelmeli");

        System.out.println("K2 Hacmi : " + (K2.x*K2.y*K2.z));
            if (K2.kirilir==false)
                System.out.println("K2'de kırılacak şey yok");
            else
                System.out.println("K2'de kırılacak şey var");

                if (K2.taban_kodu==0)
                    System.out.println("Yüzey farketmez");
                else 
                    System.out.println("Tabana " + K2.taban_kodu + ". yüzey gelmeli");


    }
}
