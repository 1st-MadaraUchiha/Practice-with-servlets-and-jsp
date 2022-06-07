
package ecom.helper;

public class WordLimit {
    
    public static String word(String desc){
        String[] limiter = desc.split(" ");
        String data ="";
        if(limiter.length>10){
        for(int i=0;i<10;i++){
             data = data + limiter[i]+" ";
        }
      
    }
        else if(limiter.length<10){
            data = desc;
        }
        return data+"...";
}
}
