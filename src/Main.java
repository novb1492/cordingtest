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
        int total=Integer.parseInt(bf.readLine());
        int[][] arr =new int[total][total];
        for(int i=0;i<total;i++){
            StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
            int x=Integer.parseInt(st.nextToken());
            arr[i][0]=x;
            arr[i][1]=Integer.parseInt(st.nextToken());
        }
        int max=0;
        Map<Integer,int[]>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int rank=0;
            for(int ii=0;ii<arr.length;ii++){
                if(i!=ii){
                    int a=arr[i][0];
                    int b=arr[ii][0];
                    if(a>b){
                        rank++;
                    }else if(a==b){
                        int c=arr[i][1];
                        int d=arr[ii][1];
                        if(c>d){
                            rank++;
                        }
                    }
                }
            }
            if(max<rank){
                max=rank;
            }
            map.put(rank, arr[i]);
        }  
     

   
    }
   
}
