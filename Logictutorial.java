public class Logictutorial {
    public static void main(String[] args){
        /*
        &&  and
        || or 
        ! not
        */
        int a=10 , b=20;
        boolean c = (a==b);
        boolean d = (a<b);

        System.out.println(("False adn True = ")+(c&&d));
        System.out.println(("False or True = ")+(c||d));
        System.out.println(("not True = ")+(!d));

    }
}
