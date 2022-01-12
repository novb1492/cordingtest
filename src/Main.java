import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
        int start=Integer.parseInt((bf.readLine()));
        int end=Integer.parseInt((bf.readLine()));
        //StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int t=0;
        boolean first=true;
        int min=0;
        for(int ii=start;ii<=end;ii++){
            boolean flag=false;
            int half=ii/2;
           // System.out.println("===============");
           // System.out.println("ii"+ii);
            if(ii==0||ii==1){
                //System.out.println("1,0");
                
            }else{
                if(division(half, ii)){
                    //System.out.println("x소수발견: "+ii);
                    flag=true;
                    
                }
                if(!flag){
                    //System.out.println("소수발견: "+ii);
                    if(first){
                        min=ii;
                        first=false;
                    }
                    t+=ii;
                }
            }
           
            //System.out.println("t: "+t+"min: "+min);
            //System.out.println("===============");

        }
        if(first){
            System.out.println(-1);
        }else{
            System.out.println(t);
            System.out.println(min);
        }
    }
    public static boolean division(int half,int max) {
       // System.out.println("half: "+half);
        for(int i=2;i<=half;i++){
            if(max%i==0){
               // System.out.println("나눠졌음:"+i);
              
                return true;
            }
        }
        //System.out.println("나눠지지않음");
      
        return false;
    }
    

}
