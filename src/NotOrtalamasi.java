import java.util.Scanner;
public class NotOrtalamasi {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuz:");
        double math=input.nextDouble();

        System.out.print("Fizik Notunuz:");
        double physic=input.nextDouble();

        System.out.print("Kimya Notunuz:");
        double chemistry=input.nextDouble();

        System.out.print("Türkçe Notunuz:");
        double turkish= input.nextDouble();

        System.out.print("Tarih Notunuz:");
        double history= input.nextDouble();

        System.out.print("Müzik Notunuz:");
        double music = input.nextDouble();

        double average= (math+physic+chemistry+turkish+history+music)/6 ;
        System.out.println("Genel Not Ortalamanız:"+average);

        boolean result= average>=60;
        String str = result ? "Tebrikler,Sınıfı Geçtiniz." : "Üzgünüz, Sınıfta Kaldınız.";
        System.out.print(str);
    }
}
