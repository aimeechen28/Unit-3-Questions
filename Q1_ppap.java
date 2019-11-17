import java.util.Scanner;
public class Q1_ppap{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String object1;
        String object2;
        String x = "I have a pen, I have a Aimee";
       int front1 = 0;
       int comma = 0;
       int period = x.length();
       int front2 = 0;
        for(int i = 0; i<x.length();i++){
            
            if(front1 == 0 && x.charAt(i)=='a'&&x.charAt(i+1)==' ') {
      
                front1=i+1;
            }
            
            if(x.charAt(i)==',')comma=i;  
            
            

        }
        for(int i = x.length(); i>0;i--){
            if(front2 == 0 && x.charAt(i-1)=='a'&&x.charAt(i)==' ')  
            front2 = i+1;
            

        }
        
        object1 = x.substring(front1,comma);
        object2 = x.substring(front2,period);
        String newSentence = words(object1,object2);
        System.out.println(newSentence);
    }

    public static String words(String object1, String object2){
      return ("Uh!" + object2 + object1);
    }
}
