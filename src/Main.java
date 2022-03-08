import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.Map.Entry;
import java.util.stream.Collectors;


public class Main {
    
  
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
        int totalCount=Integer.parseInt(bf.readLine());
        int[][]times=new int[totalCount][2];
        for(int i=0;i<totalCount;i++){
            StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
            int[] startAndEnd=new int[2];
            startAndEnd[0]=Integer.parseInt(st.nextToken());
            startAndEnd[1]=Integer.parseInt(st.nextToken());
            times[i]=startAndEnd;
        }
        Arrays.sort(times,new Comparator<int[]>(){ 
            @Override 
            public int compare(int[] o1, int[] o2){ 
                if(o1[1] < o2[1]){ 
                    return -1; 
                }else{ 
                    return 1; 
                } 
            } 
        });
        int top=0;
        totalCount=0;
        for(int[]time:times){
            if(top<=time[0]){
                totalCount++;
                top=time[1];
            }
        }
        System.out.println(totalCount);
 
      
   
    }

   
}
