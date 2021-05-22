import java.util.Scanner;
public class Mod {
    public static void main(String[] args){
        Scanner ac = new Scanner(System.in);

        while(true){
            System.out.print("กรอกค่า ");
            int num = ac.nextInt();
            if(num <= 0) break;
            if(num%2 == 0) System.out.println("เลขคู่");
            if(num%2 != 0) System.out.println("เลขคี่");
        }
    }
}
