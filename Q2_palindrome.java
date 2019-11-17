class Q2_palindrome{
    public static void main(String[] args){

        String x = "racecar";
        System.out.println(x);
        for(int i = 0; i<x.length();i++){
            if(x.charAt(i)==x.charAt(x.length()-i-1)){

                palin();
                break;
            }else{
                no();
                break;
            }

        }
    }

    public static void palin(){
        System.out.println("true");

    }

    public static void no(){
        System.out.println("false");

    }
}
