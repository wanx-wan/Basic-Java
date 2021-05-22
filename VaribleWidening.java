public class VaribleWidening {
    /*
    byte>short>char>int>long>float>double
    การแปลงจากเล็กไปใหญ่ทำอัตโนมัติ
    */
    public static void main(String[] args) {
        int numInt=100;
        double numDouble=numInt;
        System.out.println(numInt);
        System.out.println(numDouble);
    }
    
}
