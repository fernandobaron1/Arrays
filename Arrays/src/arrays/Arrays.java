
package arrays;


public class Arrays {

   
    public static void main(String[] args) {
        
        double[] precosProdutos = new double[10];
        
        precosProdutos[0] = 10;
         precosProdutos[1] = 85;
          precosProdutos[2] = 320;
           precosProdutos[3] = 12;
            precosProdutos[4] = 77;
             precosProdutos[5] = 52;
              precosProdutos[6] = 100;
               precosProdutos[7] = 12;
                precosProdutos[8] = 10;
                 precosProdutos[9] = 100;
       
                 for(int i = 0; i < precosProdutos.length; i++){
                     System.out.println (i+": "+precosProdutos[i]);
    }
    }  
}
