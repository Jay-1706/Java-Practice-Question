import java.util.Scanner;
public class noofDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int noofdigit=0;
        int original_n=n;
        while(n>0){
            n/=10;
            noofdigit++;
        }
        System.out.println("no of digits in " +original_n+"="+noofdigit);
    }
}
