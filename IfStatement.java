import java.util.Scanner;
class IfStatement{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("ป้อนอายุ ");
        int age=sc.nextInt();
        if(age >= 15 && age < 20 ){
            System.out.println("วัยรุ่น");
        }
        else if(age >=20 && age < 50){
            System.out.println("วัยทำงาน");
        }
        else if(age >=50 && age <60){
            System.out.println("วัยทอง");
        }
        else if(age >=60 ){
            System.out.println("วัยชรา");
        }
        else{
            System.out.println("Error");
        }

    }
}