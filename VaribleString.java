public class VaribleString {
    public static void main(String[] args) {
        //ทีละตัว
        char a='A';
        System.out.println(a); 
        //ได้หลายตัว
        String b="100";
        b = b+0; //นำข้อความมาต่อกัน
        System.out.println(b);
        //แปลงStringให้เป็นInt
        int c;
        c = Integer.parseInt(b);
        c = c+100;
        System.out.println(c);
        //แปลงIntให้เป็นString
        int num = 100;
        String age = String.valueOf(num);
        System.out.println(age);
        //เช็คชนิดข้อมูล
        age = age+20;
        System.out.println(age);
    }
}
