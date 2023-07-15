class pattern10{
public static void main(String agrs[]){
    pattern10 p=new pattern10();
    
    p.printstar(5);
}

void printstar(int n){
    int k=1;
    for(int i=1;i<=n;i++){
        
        for(int j=1;j<=i;j++){

            
              System.out.print(k+" ");
              k=k+1;
            
            
            
            }
         System.out.println();
    }

}    
}