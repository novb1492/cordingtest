import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
        int t=Integer.parseInt((bf.readLine()));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        List<Integer>arr=new ArrayList<>();
       while(st.hasMoreTokens()){
            //for(int i=1;i<=1000;i++){
                //arr.add(i);

            //}
           arr.add(Integer.parseInt(st.nextToken()));
        }
        int c=0;
        for(int i:arr){
         System.out.println("시작:"+i);
         if(i==1||i==0){
            c++;
        }
         else if(division(i/2,i)){
                c++;
            
         }
        }
     

        System.out.println(arr.size()-c);
    }
    public static boolean division(int half,int max) {
        System.out.println("half: "+half);
        for(int i=2;i<=half;i++){
            if(max%i==0){
                System.out.println("나눠졌음:"+i);
                System.out.println("===============");
                return true;
            }
        }
        System.out.println("나눠지지않음");
        System.out.println("===============");
        return false;
    }
    

}
