public class Main{
    public static void main(String args[]){
        int cont=0;
        for(int i=1;i<101;i++){
            System.out.print(i);
            cont=0;
            for(int j=i-1;j>2;j--){
                if(i%j==0){
                    cont++;
                     
                }

            }

            if(cont==0){
                System.out.print("Primo.");
            }
        }
    }
}