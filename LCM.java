import java.util.*;
public class LCM{
  public static void main(String args[]){
    int input1,input2,result;
    Scanner input=new Scanner(System.in);
    System.out.println("Enter the numbers of which LCM is tobe found");
    input1=input.nextInt();
    input2=input.nextInt();
    result=(input1>input2) ? input1 : input2 ;
    while(result%input1!=0&&result%input2!=0){
      ++result;
    }
    System.out.println("LCM of "+input1+" and "+input2+" is "+result);
  }
}
