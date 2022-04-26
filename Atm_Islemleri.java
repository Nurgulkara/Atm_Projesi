import java.util.Scanner;

public class Atm_Islemleri {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int bakiye=0;    //1500 tl varmış gibi
        String sifre;
        int yenibakiye;
        int yapilacakislem;
        System.out.println("Merhaba Bankamiza Hosgeldiniz");
        System.out.println("Lutfen sifrenizi giriniz:");
        sifre=inp.nextLine();
        for (int i = 1; i <4; i++) {
            if (sifre.equals("dev123")){
                System.out.println("Sifreniz dogru,basarili bir sekilde giris yaptiniz!");
                break;
            }
            else if (i==3) {
                System.out.println("Cok Sayida Hatali Sifre Girdiniz Sistemden Cikiliyor...");
                System.exit(0);
            }
            else {
                System.err.println("Hatali Sifre Girdiniz!");
                System.err.println("Lutfen sifrenizi giriniz:");
                sifre=inp.nextLine();
            }
        }
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Para cekmek icin 1'e ");
        System.out.println("Para yatirmak icin 2'e");
        System.out.println("Sifrenizi degistirmek icin 3'e ");
        System.out.println("Bakiyenizi ogrenmek icin 4'e basiniz");
        System.out.println("Lutfen Yapilacak islemi Giriniz:");
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        yapilacakislem=inp.nextInt();
        switch (yapilacakislem) {
            case 1:System.out.print("Cekilecek Tutari Giriniz:");
                int çekilecektutar;
                çekilecektutar= inp.nextInt();
                yenibakiye=bakiye-çekilecektutar;
                System.out.println("Islem basarili!");
                System.out.println("Yeni bakiyeniz:"+yenibakiye);
                break;
            case 2:
                System.out.println("Yatirilacak tutari giriniz:");
                int yatirilacaktutar;
                yatirilacaktutar=inp.nextInt();
                yenibakiye=bakiye+yatirilacaktutar;
                System.out.println("Islem basarili!");
                System.out.println("Islem basarili!");
                System.out.println("Yeni bakiyeniz:"+yenibakiye);
                break;
            case 3:
                System.out.println("Yeni sifrenizi giriniz:");
                int yenisifre;
                yenisifre=inp.nextInt();
                System.out.println("Islem başarili!");
                System.out.println("Yeni sifreniz:"+yenisifre);
                break;

            case 4:
                System.out.println("Bakiyeniz:"+bakiye);
                break;
            default:
                System.err.println("Hatali giris yaptiniz,lutfen tekrar deneyin");

        }

        }

    }



