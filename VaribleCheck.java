public class VaribleCheck {
    public static void main(String[] args) {
       //เช็คชนิดข้อมูล
        int a;
        double b;
        String c="Hello";
        boolean d;
        char e;
        float f;

        boolean result=c instanceof String;
        System.out.println(result);
    }
}
