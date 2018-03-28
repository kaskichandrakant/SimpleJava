import java.util.*;

public class GCD{
  public static void main(String args[]){
    int smaller,greater,input1,input2,result=0;
    Scanner input=new Scanner(System.in);
    System.out.println("Enter the numbers of which GCD is tobe found");
    input1=input.nextInt();
    input2=input.nextInt();
    if(input1>input2){
      greater=input1;
      smaller=input2;
    }else{
      greater=input2;
      smaller=input1;
    }
    while(greater%smaller!=0){
      result=greater%smaller;
      greater=smaller;
      smaller=result;
    }
    System.out.println("GCD of "+input1+" and "+input2+" is "+result);
  }
}
