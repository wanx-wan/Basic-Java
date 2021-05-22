import java.util.Scanner;
public class SumNum {
    public static void main(String[] args){
        Scanner number = new Scanner(System.in);
        int sum = 0 , count =0 , total=0 ;
        while(true){
            System.out.print("กรอกค่าที่ต้องการหา ");
            int num = number.nextInt();
            if (num <= 0) break;
            count++;
            sum += num;
            total = sum/count;
        }
        System.out.println("ผลรวม = "+sum);
        System.out.println("จำนวนครั้งที่กรอก = "+count);
        System.out.println("ค่าเฉลี่ย = "+total);

        
    }
}
