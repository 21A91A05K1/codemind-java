import java.util.Scanner;
class Ave
{
    public static void main(String args[])
    {
        double a,b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextDouble();
        b=sc.nextDouble();
        System.out.format("%.4f",(a+b)/2);
    }
}