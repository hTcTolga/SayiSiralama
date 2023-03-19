import java.util.Scanner;
public class Siralama {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int a,b,c;

        System.out.print("1-Sayıyı Giriniz: ");
        a=girdi.nextInt();
        System.out.print("2-Sayıyı Giriniz: ");
        b=girdi.nextInt();
        System.out.print("3-Sayıyı Giriniz: ");
        c=girdi.nextInt();

        if (a<b && a<c){
            if (b<c){
                System.out.print("a<b<c");
            }
            else {
                System.out.print("a<c<b");
            }}
         else if (b<a && b<c){
             if (a<c){
                 System.out.print("b<a<c");
             }
             else {
                 System.out.print("b<c<a");
             } }
         if (c<a && c<b){
             if (a<b) {
                 System.out.print("c<a<b");
             }
             else {System.out.print("c<b<a");
             }
        }
        else ;
    }
}
