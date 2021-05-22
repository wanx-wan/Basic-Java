import java.util.Scanner;
public class MaxMin {
    public static void main(String[] args){
        Scanner ac = new Scanner(System.in);
        int maxnum = 0 , minnum = Integer.MAX_VALUE;
        
        while(true){
            System.out.print("ป้อนตัวเลข ");
            int num = ac.nextInt();
            if(num<=0) break;
            if(num > maxnum)maxnum = num;
            if(num < minnum)minnum = num;
        }
        System.out.println(maxnum);
        System.out.println(minnum);
    }
}
