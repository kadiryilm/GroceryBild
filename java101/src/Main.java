import java.util.Scanner;

public class Main {public static void main(String[] args) {
   double armut , elma , domates , muz , patlican ,toplam ;
   double a=2.14 , b=3.67 , c=1.11 , d=0.95 , e=5.0 ;
   Scanner input = new Scanner(System.in);
   System.out.println("Armut kaç kilo ? :");
   armut = input.nextDouble();
   System.out.println("Elma kaç kilo ? :");
   elma = input.nextDouble();
   System.out.println("Domates kaç kilo ? :");
   domates = input.nextDouble();
   System.out.println("Muz kaç kilo ? :");
   muz = input.nextDouble();
   System.out.println("Patlıcan kaç kilo ? :");
   patlican = input.nextDouble();
   System.out.println( toplam = (armut*a)+(elma*b)+(domates*c)+(muz*d)+(patlican*e));

}

}