class pattern13{
    void printstar(int n){
        for( int i=1;i<=n;i++){
            for(char ch='A';ch<'A'+i;ch++){
                System.out.print(ch+"");
            }
            System.out.println();
        }

    }
    public static void main(String agrs[]){
        pattern13 p= new pattern13();
       p. printstar(5);
    }
}