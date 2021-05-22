import java.util.Scanner;
public class Assigment3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("กรอกจำนวนเงิน ");
        int money = sc.nextInt();
        System.out.println(money);

        if (money>=1000){
            System.out.println("แบงค์ 1000 = "+(money/1000));
            money = money%1000;
        }
        if (money>=500){
            System.out.println("แบงค์ 500 = " + (money/500));
        money = money%500;
        }
        if (money>=100){
                System.out.println("แบงค์ 100 = " + (money/100));
            money = money%100;
        }
        if (money>=50){
                System.out.println("แบงค์ 50 = " + (money/50));                    
            money = money%50;
        }
        if (money>=20){
            System.out.println("แบงค์ 20 = " + (money/20));
            money = money%20;
        }
        System.out.print("เหลือเศษ "+money);
        

    }    
}
