import java.util.Scanner;
public class Assigment2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("กรอกปีพ.ศ. ");
        int bd = sc.nextInt();

        bd-=543;
        System.out.println("ปีค.ศ. "+bd);
    }
}
