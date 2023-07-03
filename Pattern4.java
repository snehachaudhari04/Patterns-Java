
class Pattern4
{

    void star(int n){
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
 public static void main(String args[]){ 
    Pattern4 p= new Pattern4();
    p.star(5);
   
 }
}