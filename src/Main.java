import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.Map.Entry;


public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
        //            StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int total=Integer.parseInt(bf.readLine());
        String[] arr = new String[total];
        for(int i=0;i<total;i++){
            arr[i]=bf.readLine();
        }
 
        Arrays.sort(arr, new Comparator<String>() {		
            @Override
            public int compare(String s1, String s2) {
               if(s1.length()<s2.length()){
                   return -1;
               }else{
                   char a=s1.charAt(0);
                   char b=s2.charAt(0);
                   if((int)a>(int)b){
                       return -1;
                   }else{
                       return 1;
                   }
               }
            }
        });
        System.out.println("-------------------");
        for(String s:arr){
            System.out.println(s);
        }
       
      
     

   
    }
   
}
