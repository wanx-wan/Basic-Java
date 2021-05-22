import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("kg = ");
        double weight = sc.nextDouble();
        System.out.print("m = ");
        double height = sc.nextDouble();

        height/=100;
        double Bmi = weight/(height*height);

        System.out.println("น้ำหนัก " + weight + " กิโลกรัม");
        System.out.println("ส่วนสูง " + height/100 +" เมตร");
        System.out.println("BMI "+Bmi);

        if (Bmi<18.5){
            System.out.println("ต่ำกว่าเกณฑ์");
        }
        else if (Bmi>=18.5 && Bmi<23){
            System.out.println("สมส่วน");
        }
        else if (Bmi>=23 && Bmi<25){
            System.out.println("น้ำหนักเกิน");
        }
        else if (Bmi>=25 && Bmi<30){
            System.out.println("โรคอ้วน");
        }
        else if (Bmi>=30){
            System.out.println("โรคอ้วนระดับอันตราย");
        }
        else{
            System.out.println("Error");
        }
    }
}
