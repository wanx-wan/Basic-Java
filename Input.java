import java.util.Scanner;
public class Input {
    //รับค่าข้อมูล
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("ป้อนชื่อของคุณ ");
        String name = sc.nextLine(); //รับค่าจากแป้นพิมพ์แล้วเก็ที่ name 

        System.out.print("ป้อนปีเกิดของคุณ ");
        Integer age = sc.nextInt();

        int agetotal = 2563-age;

        System.out.println(name);
        System.out.println(age);
        System.out.println(agetotal);

    }
}
