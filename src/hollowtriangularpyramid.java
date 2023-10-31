import java.util.*;
public class hollowtriangularpyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                if(((c==1&&c==7)&&(r==1&&r==2&&r==3)) || ((c==2&&c==6)&&(r==1&&r==2))||((c==3&&c==5)&&(r==1&&r==3))||((c==4)&&(r==2&&r==3)))
                {
                    System.out.print(" ");
                }else {
                    System.out.print(j);
                }

                }
            System.out.println();
            }
        }
    }

