/*To convert from a base-10 integer to its base-2 (binary) equivalent, the number is divided by	two, and the remainder is the 
 * least-significant bit. The integer result is	again divided by two, its remainder is the next	least significant bit. This	
 * process repeats until the quotient becomes zero. Write a method that	reads a	positive integer from the terminal, and	prints out the	
binary equivalent using the	above algorithm. You can use String and	the concatenation operator to store 
the	remainders as they are produced in the correct order.*/
class Q3_Bin{
    public static void main(String[] args){
        int x = 10;
        System.out.println("The base-10 integer is: " +x);
        String a = "";
       
        while(x>0){
            if(x%2==0){
                x=x/2;
                a += 0;
            }else{
                x=x/2;
                a += 1;
            }
        }
         String neew = neww(a);
         System.out.print(neew);
    }
    public static String neww(String a){
        String reverse = "";
        for(int i = a.length()-1;i>=0;i--){
           reverse += a.charAt(i);
        }
        return ("The base-2 integer is: " + reverse );
    }


  
}
