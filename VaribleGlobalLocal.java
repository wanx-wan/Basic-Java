public class VaribleGlobalLocal {
    public static void main(String[] args){
       //Global 
        int a=10;
        System.out.println(a);
        {
            //local 
            //สามารถนำGlobalมาprintในlocalได้
            int c=30;
            System.out.println(c);
        }
    }
}
