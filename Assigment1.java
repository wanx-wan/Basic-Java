import java.util.Scanner;
public class Assigment1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("กรอกตัวเลข ");
        int num = sc.nextInt();

        String result="";
        result = (num%2 == 0) ? "เลขคู่" : "เลขคี่";
        System.out.println(result);
    }
    
}
