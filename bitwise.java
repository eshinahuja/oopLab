import java.util.Scanner ;

class bitwise{
    public static void main(String [] args){
        int n;
        System.out.println("enter a number ");
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        
        System.out.println("Bitwise Double: " + (n << 1));
        System.out.println("Bitwise Half: " + (n >> 1));
        
        sc.close();
    }
}