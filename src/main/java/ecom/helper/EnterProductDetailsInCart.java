package ecom.helper;

public class EnterProductDetailsInCart {

    public EnterProductDetailsInCart(int proId, String proName, int proPrice) {
      
         int m=5,n=2,o=2;
        int[][][] data = new int[m][n][o];
        data[proId][0][0] = proId; 
        data[proId][1][0] = proPrice;
        data[proId][1][1] =data[proId][1][1]+1 ;
        for(int i=0;i<m;i++){
            if(data[i][0][0]!=0){
            System.out.print(data[i][0][0]+",");
            System.out.print(data[i][1][0]+",");
            System.out.print(data[i][1][1]+"");
            System.out.println("");
        }
        }   
    }        
}
