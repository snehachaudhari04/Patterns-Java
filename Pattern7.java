class Pattern7
{

    void star(int n){
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i*2-1;k++){
                System.out.print("*");
            }
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            System.out.println();

            

            }
        }
    
 public static void main(String args[]){ 
    Pattern7 p= new Pattern7();
    p.star(5);
   
 }
}
