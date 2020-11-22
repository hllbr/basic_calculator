
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("*******************************");
        String islemler = "1.işlem toplama\n"+
                "2.işlem çıkarma\n"+
                "3.işlem çarpma\n"+
                "4.işlem bölme\n"+
                "5.işlem kalan";
        System.out.println(islemler);
                System.out.println("*******************************");
                System.out.println("Yapmak istediğiniz işlemi seçin");
        String islem = scn.nextLine();
        double a ;
        double b ;
        switch(islem){
            case "1" :
                System.out.println("toplama işlemi için gereken ilk sayıyı giriniz = ");
                 a = scn.nextDouble();
                System.out.println("toplama işlemi için gereken ikinci sayıyı giriniz = ");
                 b = scn.nextDouble();
                System.out.println("Toplama işlemimizin sonucu = " +(double)(a+b));
                break;
                case "2" :
                System.out.println("Çıkarma işlemi için gereken ilk sayıyı giriniz = ");
                 a = scn.nextDouble();
                System.out.println("Çıkarma işlemi için gereken ikinci sayıyı giriniz = ");
                 b = scn.nextDouble();
                System.out.println("Çıkarma işlemimizin sonucu = " +(double)(a-b));
                break;
                case "3" :
                System.out.println("Çarpma işlemi için gereken ilk sayıyı giriniz = ");
                 a = scn.nextDouble();
                System.out.println("Çarpma işlemi için gereken ikinci sayıyı giriniz = ");
                 b = scn.nextDouble();
                System.out.println("Çarpma işlemimizin sonucu = " +(double)(a*b));
                break;
                case "4" :
                System.out.println("Bölme işlemi için gereken ilk sayıyı giriniz = ");
                 a = scn.nextDouble();
                System.out.println("bölme işlemi için gereken ikinci sayıyı giriniz = ");
                 b = scn.nextDouble();
                System.out.println("bölme işlemimizin sonucu = " +(double)(a/b));
                break;
                case "5" :
                System.out.println("Kalan işlemi için gereken ilk sayıyı giriniz = ");
                 a = scn.nextDouble();
                System.out.println("Kalan işlemi için gereken ikinci sayıyı giriniz = ");
                 b = scn.nextDouble();
                System.out.println("Kalan işlemimizin sonucu = " +(a%b));
                break;
                default:
                    System.out.println("YANLIŞ VEYA HATALI TUŞLAMA YAPTINIZ...!!!!");

        }
        
    }
    
}
