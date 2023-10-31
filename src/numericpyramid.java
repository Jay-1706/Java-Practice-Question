import java.util.*;
public class numericpyramid {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int r= sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=r-i;j++) {
                System.out.print(" ");
            }
            //print 1 to i
            for(int k=1;k<=i;k++){
                System.out.print(k);
            }
            //print i-1 to 1
            for(int w =i-1;w>=1;w--){
                System.out.print(w);
            }
            System.out.println();
        }
    }
}
