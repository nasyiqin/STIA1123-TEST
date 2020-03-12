public class Test1 {

    public static void main(String[] args){
        //1.1
        System.out.println("Hello! \n");

        //1.2
        int x = 10;
        double y = 3.245;
        char z = 'j';
        boolean b = true;
        String str = "Programming Test";

        System.out.println("Integer type: " +x);
        System.out.println("Double type: " +y);
        System.out.println("Char type: " +z);
        System.out.println("Boolean type: " +b);
        System.out.println("String type: " +str);

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
