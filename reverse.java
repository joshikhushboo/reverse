public class reverse {
    public static void main(String[] args) {
        int n=1234;
        int rev=0;
        int rem;
        while (n!=0){
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;


        }
        System.out.print("reverse of the number is "+rev);
    }
}
