public class Test1 {

    //1.2 variables
    static int x;
    static double y;
    static float f;
    static char z;
    static boolean b;
    static String str;

    public static void main(String[] args){
        //1.1
        System.out.println("Hello! \n");

        //1.2 output
        System.out.println("Integer : " +x);
        System.out.println("Double : " +y);
        System.out.println("Float : " +f);
        System.out.println("Char : " +z);
        System.out.println("Boolean : " +b);
        System.out.println("String : " +str);

        //1.3
        String str1 = "OOP";
        String str2 = "DSA";

        if (str1.equals(str2)){
            System.out.println("\nboth strings are  equal");
        } else
        {
            System.out.println("\nboth strings are not equal");
        }

    }
}
