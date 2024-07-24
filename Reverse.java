import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int num=r.nextInt();
        int rev=0,rem=0;
        while(num!=0)
            {
                rem=num%10;
                rev=rev*10+rem;
                num/=10;
            }
            System.out.println(rev);
    }
}
