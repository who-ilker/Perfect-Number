import java.util.Scanner;
// Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların)
// toplamı kendisine eşit olan sayıya mükemmel sayı denir.
public class Main {
    public static void main(String[] args){

        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int number = inp.nextInt();

        if (isPerfect(number))
            System.out.println("This is a perfect number");
        else
            System.out.println("This is not a perfect number");
    }
    static Boolean isPerfect(int num){
        int sum_PositiveIntegerFactors = 0;
        for(int i = 1; i < num; ++i)
            if (num % i == 0)
                sum_PositiveIntegerFactors += i;

        if(sum_PositiveIntegerFactors == num)
            return true;
        else
            return false;
    }
}