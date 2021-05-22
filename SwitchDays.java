import java.util.Scanner;
public class SwitchDays {
    public static void main(String[] args){
        Scanner ac = new Scanner(System.in);
        System.out.print("กรอกตัวเลข ");
        int Days = ac.nextInt();

        switch(Days){
            case (1) : System.out.print("วันจันทร์");
            break;
            case (2) : System.out.print("วันอังคาร");
            break;
            default : System.out.print("ไม่พบรายการ");
        }

    }
}
