import java.util.Scanner;

public class TypeConvert {
    public static void main(String[] args) {
        int i;
        double d;
        char c;

        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter int");
        i = sc.nextInt();
        System.out.println("enter double");
        d = sc.nextDouble();
        System.out.println("enter char");
        c= sc.next().charAt(0);

        sc.close();

        byte intToByte = (byte)i;
        int charToInt = (int)c;
        byte doubleToByte = (byte)d;
        int doubleToInt = (int)d; 

        System.out.println("Covertions are: \n");
        System.out.println(intToByte);
        System.out.println(charToInt);
        System.out.println(doubleToByte);
        System.out.println(doubleToInt);

    }
}