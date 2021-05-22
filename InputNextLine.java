import java.util.Scanner;
public class InputNextLine {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ป้อนชื่อของคุณ ");
        String name=sc.nextLine(); //nextไม่อ่านช่องว่าง nextLineอ่านช่องว่าง
        System.out.println("ชื่อของคุณคือ "+name);
    }
}
