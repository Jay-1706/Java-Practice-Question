import java.util.Scanner;
public class reversetheno {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int reverseno=0;
        while(n>0){
            reverseno=reverseno*10+n%10;
            n/=10;
        }
        System.out.println("reverse the no is"+n+"="+reverseno);
    }
}
