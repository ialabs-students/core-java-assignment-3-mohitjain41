import java.util.Scanner;

public class WrapperClassConvert {
    public static void main(String[] args) {
        System.out.println("enter number");
        Scanner sc=new Scanner(System.in);
        int object=sc.nextInt();
        // for string ----
        //  String a = sc.nextLine();
        convertToWrapper(object);  //for integer
        // convertToWrapper(a);

    }
    //for String
    //	    private static String convertToWrapper(String a) {
//	    	String ab = String.valueOf(a);
//	        if(a instanceof  String){
//	            System.out.println("Converted value is "+ ab);
//	        }
//			return ab;
//		}



    public static  Integer convertToWrapper(int object){
        Integer abc = Integer.valueOf(object);
        System.out.println(abc);
        if(abc instanceof Integer){
            System.out.println("Converted value is "+ abc);
        }
        else {
            System.out.println("give proper input");
        }
        return abc;
    }
}

