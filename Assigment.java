import java.util.Scanner;
public class Assigment {
    public static void main(String[] args){
        Scanner ac = new Scanner(System.in);
        System.out.print("กรอกตัวเลขครั้งที่หนึ่ง ");
        int num1 = ac.nextInt();
        System.out.print("กรอกตัวเลขครั้งที่สอง ");
        int num2 = ac.nextInt();

        if (num1>num2){
            System.out.println("ครั้งแรกมากกว่าครั้งที่สอง");
        }
        else if(num1==num2){
            System.out.println("มีค่าเท่ากัน");
        }
        else{
            System.out.println("ครั้งที่สองมากกว่าครั้งแรก");
        }
    }
}
