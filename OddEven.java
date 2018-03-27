import java.util.* ;

public class OddEven {
    public static void main(String args[]){
        int x;
        Scanner input=new Scanner(System.in);
        System.out.println("enter number tobe recognised");
        x=input.nextInt();
        if(x % 2==0) {
            System.out.println("you entered an even");
        } else{
            System.out.println("you entered an odd");
        }
    }
}
