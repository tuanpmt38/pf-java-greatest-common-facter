public class UCLN {
    public static void main(String[] args) {
        int a;
        int b;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter a:");
        a=sc.nextInt();
        System.out.println("Enter b:");
        b=sc.nextInt();
        // ham tra ve gia tri tuyet doi
        a = Math.abs(a);
        b = Math.abs(b);
        if(a==0 || b==0)
            System.out.println("No greatest common factor:");
        while (a!=b){
            if(a>b)
                a=a-b;
            else
                b=b-a;
        }
        System.out.println("Greatest common factor: " + a);
    }
}
