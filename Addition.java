import java.util.*;
public class Addition {
    public static void main(String args[]){
        int x,y,z;
        System.out.println("Enter two numbers to be added");
        Scanner input = new Scanner(System.in);
        x=input.nextInt();
        y=input.nextInt();
        z=x+y;
        System.out.println("sum  is  "+z);
    }
}
