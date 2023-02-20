import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.
        //Armut : 2,14TL Elma : 3,67TL Domates : 1,11 TL Muz: 0,95 TL Patlıcan : 5,00TL

        double elma , armut, domates, muz, patlican, toplam;
        //Kullanıcıdan verileri alalım
        Scanner input = new Scanner(System.in);

        System.out.print("Elma kaç kilo ? : ");
        elma = input.nextDouble();

        System.out.print("Armut kaç kilo ? : ");
        armut = input.nextDouble();

        System.out.print("Domates kaç kilo ? : ");
        domates = input.nextDouble();

        System.out.print("Muz kaç kilo ? : ");
        muz = input.nextDouble();

        System.out.print("Patlıcan kaç kilo ? : ");
        patlican = input.nextDouble();

        toplam = (armut * 2.14 + elma * 3.67 + domates * 1.11 + muz * 0.95 + patlican * 5.0);
        System.out.println("Toplam Tutar  : " + toplam);


    }
}
