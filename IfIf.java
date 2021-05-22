import java.util.Scanner;
public class IfIf {
    public static void main(String[] args){

        Scanner ac = new Scanner(System.in);
        System.out.print("กรอกอายุ ");
        int age = ac.nextInt();
        if(age>=16 && age<=18){
            if(age==16){
                System.out.println("ชั้นม.4");
            }
            else if(age==17){
                System.out.println("ชั้นม.5");
            }
            else if(age==18){
                System.out.println("ชั้นม.6");
            }
        }
        else{
            System.out.println("ไม่ตรงกับค่าที่กำหนด");
        }
    }
}
