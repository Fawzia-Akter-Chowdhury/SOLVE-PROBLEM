import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        int N ;
        System.out.println("Give the number : ");
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        if (N % 2 == 0)
            System.out.println("The number is even .")  ;
        else
            System.out.println("The number is odd .")  ;
    }
}