import java.util.Scanner;
public class sumofseries {//1-2+3-4......n
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=0;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                System.out.println(ans-=i); //ans-=i;
            }else {
                System.out.println(ans+=i);// ans+=i;
            }
        }
        System.out.println(ans);
    }
}

