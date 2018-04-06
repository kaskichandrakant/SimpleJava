import java.util.*;

public class Guessing {
    public static void main(String args[]){
        int x,y,turns=10;
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number tobe guessed");
        y=input.nextInt();
        do{
            System.out.println("guess the number");
            x=input.nextInt();
            if(x>y){
                System.out.println("you entered the greater number");
            }
            if(x<y){
                System.out.println("you entered the smaller number");
            }
            turns--;
            System.out.println(turns+" Turns Left");
        }while(turns!=0&&x!=y);
        if(x==y){
          System.out.println("you Won");
        }else{
          System.out.println("you Lose");

        }
    }
}
