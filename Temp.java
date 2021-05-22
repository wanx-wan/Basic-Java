import java.util.Scanner;
class Temp{
    public static void main(String [] args){
        Scanner ac = new Scanner(System.in);
        System.out.print("กรอกค่าองศาเซลเซียส ");
        float Ctotal = ac.nextFloat();
        System.out.print("กรอกค่าองศาฟาเรนไฮต์ ");
        float Ftotal = ac.nextFloat();

        Float Calc = (Ftotal-32)*5/9;
        Float Calf = (Ctotal*9/5)+32;

        System.out.println("อุณหภูมิที่แปลงจากฟาเรนไฮต์ได้ "+Calc+" องศาเซลเซียส");
        System.out.println("อุณภูมิที่แปลงจากเซลเซียสได้ "+Calf+" องศาฟาเรนไฮต์");

        if(Calc>=100 || Calf>=212){
            System.out.println("ร้อนเหี้ยๆ");
        }
        else{
            System.out.println("พออยู่ได้");
        }

    }
}