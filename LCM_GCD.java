import java.util.*;

public class LCM_GCD{
  static int get_LCM(int num1,int num2){
    int result;
    result=(num1>num2)?num1:num2;
    while(result%num1!=0&&result%num2!=0){
      ++result;
    }
    return result;
  }
  static int get_GCD(int num1 ,int num2){
    int greater,smaller,result=0;
    greater=num1>num2?num1:num2;
    smaller=num1<num2?num1:num2;
    while(greater%smaller!=0){
      result=greater%smaller;
      greater=smaller;
      smaller=result;
    }
    return result;
  }
  public static void main(String args[]){
    int input1,input2;
    Scanner input=new Scanner(System.in);
    System.out.println("Enter the numbers of which GCD and LCM is tobe found");
    input1=input.nextInt();
    input2=input.nextInt();
    System.out.println("GCD of "+input1+" and "+input2+" is "+get_GCD(input1,input2));
    System.out.println("LCM of "+input1+" and "+input2+" is "+get_LCM(input1,input2));
  }
}
