import java.util.*;

class Factorial{
  public static void main(String args[]){
    int number,count,fact;
    System.out.println("Enter number of which factorial is calculated");
    Scanner input=new Scanner(System.in);
    number=input.nextInt();
    fact=1;
    if(number<0){
      System.out.println("number should be positive");
    }else{
      for(count=1;count<=number;count++){
        fact=fact*count;
      }
    }
    System.out.println("Factorial of "+number+"is "+fact);
  }
}
