public class VaribleNorrowing {
    /*
    double>float>long>int>char>short>byte
    การทำจากใหญ่ไปเล็กทำเอง
    */
    public static void main(String[] args){
        double numDouble=10.0;
        int numInt=(int)numDouble;
        System.out.println(numDouble);
        System.out.println(numInt);
        
    }
}
