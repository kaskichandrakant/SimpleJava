import java.util.*;

public class MultiplicationTable{
  public static void main(String args[]){
    int number,count;
    Scanner input =new Scanner(System.in);
    System.out.println("enter the number of which table is tobe shown");
    number=input.nextInt();
    System.out.println("Multiplication Table for "+number+" is :-");
    for (count=1;count<=10 ;count++ ) {
      System.out.println(number*count );
    }
  }
}
