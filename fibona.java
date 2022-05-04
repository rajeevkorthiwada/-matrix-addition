import java.util.*;
class fibona{
    static int n1=0,n2=1,n3;
    public static void fibi(int n){
        if(n>0){
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(" "+n3);
            fibi(n-1);
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(n1+" "+n2);
        fibi(n-2);
    }
}
