import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
        //StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int target=Integer.parseInt(bf.readLine());
        int num=0;
        int start=666;
        while(true){
            if(Integer.toString(start).contains("666")){
                num+=1;
            }
            if(num==target){
                break;
            }
            start+=1;
        }
        System.out.println(start);
        
        
   
    }
   
}
