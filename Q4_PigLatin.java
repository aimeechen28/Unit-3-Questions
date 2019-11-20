class Q4_PigLatin{
    public static void main(String[] args){
        String x = "I love starcraft";
        
        while(x.length()>0){
            int space = x.indexOf(" ");
            if(space<0){
                System.out.print(neew(x));
                x="";
            }else{
                String sepetate = x.substring(0,space);
                System.out.print(neew(sepetate)+" ");
                x = x.substring(space+1);
                
            }

        }
    }
        public static String neew(String x){ 
        if(x.length()<=2){
            return x;
        }
        return (x.substring(1)+x.substring(0,1)+"ay");
    }
}
