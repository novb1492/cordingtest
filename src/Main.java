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
        List<String>arr=new ArrayList<>();
        for(int i=0;i<total;i++){
            arr.add(bf.readLine());
        }
        Map<Integer,String>map=new HashMap<>();
        int max=0;
        for(String s:arr){
            int rank=0;
            System.out.println("s: "+s);
            for(String ss:arr){
                if(!s.equals(ss)){
                    System.out.println("s: "+s+" ss: "+ss);
                    if(s.length()>ss.length()){
                        System.out.println("김");
                        rank++;
                    }else if(s.length()==ss.length()){
                        char a=s.charAt(0);
                        char b=s.charAt(0);
                        if((int)a>(int)b){
                            System.out.println("뒤에 짤");
                            rank++;
                        }
                    }
                }
            }
            if(max<rank){
                max=rank;
            }
            System.out.println("s: "+s+" rank: "+rank);
            map.put(rank, s);
        }
        System.out.println("-----------------");
        for(int i=0;i<max;i++){
            System.out.println(map.get(i));
        }

       
      
     

   
    }
   
}
