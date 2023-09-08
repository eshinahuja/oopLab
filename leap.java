import java.util.Scanner;

class LeapYear{
    public static void main(String[] args) {
        int year;
        
        System.out.println("Enter the year");
        Scanner sc = new Scanner(System.in);

        year = sc.nextInt();

        sc.close();

        boolean isLeap;

        if(year%4!=0) isLeap = false;
        else if(year%100!=0) isLeap = true;
        else if(year%400!=0) isLeap = false;
        else isLeap = true;

        if(isLeap) System.out.println("leap year");
        else System.out.println("common year");
    }
}