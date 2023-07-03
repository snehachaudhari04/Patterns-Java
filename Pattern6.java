
class Pattern6
{

     void star(int n) {
        // code here
        for(int i=1;i<=n;i++){// outer loop is for  total column
            for(int j=1;j<=n-i;j++){// to print spaces before star
                System.out.print(" ");
            }
            for(int k=1;k<=i*2-1;k++){//print star
                System.out.print("*");
            }
             for(int j=1;j<=n-i;j++){ // print spaces after star 
                System.out.print(" ");
            }
            
            System.out.println();
            
        }
    }
    
 
    
 public static void main(String args[]){ 
    Pattern6 p= new Pattern6();
    p.star(5);
   
 }
} 
