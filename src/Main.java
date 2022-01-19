import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.Map.Entry;


public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
        //StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int total=Integer.parseInt(bf.readLine());
        List<Integer>arr=new ArrayList<>();
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<total;i++){
            int num=Integer.parseInt(bf.readLine());
            if(map.containsKey(num)){
                map.put(num, map.get(num)+1);
            }else{
                map.put(num, 1);
            }
            arr.add(num);
        }
        Collections.sort(arr);
        int sum=0;
        for(int i:arr){
            sum+=i;
        }
        int most=0;
        List<Integer>arr2=new ArrayList<>();
        for(Integer i:map.keySet()){
            int value=map.get(i);
            if(value>=most){
                most=value;
                arr2.add(i);
            }
            System.out.println("key: "+i+"value: "+map.get(i));
        }
        Collections.sort(arr2);
        double divi=(double)sum/total;

        System.out.println("반올"+Math.round(divi));
        System.out.println("중앙"+arr.get((total/2)));
        if(arr2.size()>1){
            System.out.println("최빈"+arr2.get(1));

        }else{
            System.out.println("최빈"+arr2.get(0));
        }
        System.out.println("범위: "+(arr.get(total-1)-arr.get(0)));
        
        
   
    }
   
}
