import java.util.Scanner;
//Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın.
// Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın.
// Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki
// koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;
//
//Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
// Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
//Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
//Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
//Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
//Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
public class furkenkss {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz: "); int mesafe= input.nextInt();
        System.out.print("Yaşınızı giriniz: "); int yas= input.nextInt();
        System.out.print("Yolculuk tipini seçiniz(1 => Tek Yön , 2 => Gidiş Dönüş): "); int yolculuktipi= input.nextInt();

        double normaltutar,yasindirimi,indirimlitutar, gitgelbiletindirim,toplamtutar;
        if (mesafe>0 && yas>=0 && (yolculuktipi==1 || yolculuktipi==2)){


            switch (yolculuktipi){
                case 1:
                    if (yas<12){
                        normaltutar=mesafe*0.10;
                        yasindirimi=normaltutar*0.50;
                        indirimlitutar=normaltutar-yasindirimi;
                        System.out.print("Toplam ücret: "+indirimlitutar+" TL");
                    } else if (yas>=12 && yas<=24) {
                        normaltutar=mesafe*0.10;
                        yasindirimi=normaltutar*0.10;
                        indirimlitutar=normaltutar-yasindirimi;
                        System.out.print("Toplam ücret: "+indirimlitutar+" TL");
                    } else if (yas>24 && yas<65) {
                        normaltutar=mesafe*0.10;
                        System.out.print("Toplam ücret: "+normaltutar+" TL");
                    } else if (yas>=65) {
                        normaltutar=mesafe*0.10;
                        yasindirimi=normaltutar*0.30;
                        indirimlitutar=normaltutar-yasindirimi;
                        System.out.print("Toplam ücret: "+indirimlitutar+" TL");
                    }
                    break;

                case 2:
                    if (yas<12){
                        normaltutar=mesafe*0.10;
                        yasindirimi=normaltutar*0.50;
                        indirimlitutar=normaltutar-yasindirimi;
                        gitgelbiletindirim=indirimlitutar*0.20;
                        toplamtutar=(indirimlitutar-gitgelbiletindirim)*2;
                        System.out.print("Toplam ücret: "+toplamtutar+" TL");

                    } else if (yas>=12 && yas<=24) {
                        normaltutar=mesafe*0.10;
                        yasindirimi=normaltutar*0.10;
                        indirimlitutar=normaltutar-yasindirimi;
                        gitgelbiletindirim=indirimlitutar*0.20;
                        toplamtutar=(indirimlitutar-gitgelbiletindirim)*2;
                        System.out.print("Toplam ücret: "+toplamtutar+" TL");
                    } else if (yas>24 && yas<65) {
                        normaltutar=mesafe*0.10;
                        gitgelbiletindirim=normaltutar*0.20;
                        toplamtutar=(normaltutar-gitgelbiletindirim)*2;
                        System.out.print("Toplam ücret: "+normaltutar+" TL");
                    } else if (yas>=65) {
                        normaltutar=mesafe*0.10;
                        yasindirimi=normaltutar*0.30;
                        indirimlitutar=normaltutar-yasindirimi;
                        gitgelbiletindirim=indirimlitutar*0.20;
                        toplamtutar=(indirimlitutar-gitgelbiletindirim)+2;
                        System.out.print("Toplam ücret: "+toplamtutar+" TL");
                    }
                    break;


            }


        }
        else {
            System.out.print("Hatalı giriş yaptınız!!!!!");
        }

    }
}
