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
        List<int[]>times=new ArrayList<>();
        for(int i=0;i<totalCount;i++){
            StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
            int[] startAndEnd=new int[2];
            startAndEnd[0]=Integer.parseInt(st.nextToken());
            startAndEnd[1]=Integer.parseInt(st.nextToken());
            times.add(startAndEnd);
        }
        List<int[]>sortArr=new ArrayList<>();
        for(int i=0;i<times.size();i++){
            int endTime=times.get(i)[1];
            System.out.println(endTime);
            for(int ii=0;ii<times.size();ii++){
                if(i!=ii){
                    if(endTime>=times.get(ii)[0]){
                       // System.out.println("start:"+times.get(i)[0] );
                        int[] startAndEnd=new int[2];
                        startAndEnd=times.get(ii);
                        sortArr.add(startAndEnd);
                        endTime=times.get(ii)[0];
                    }
                }
            }
        }
        for(int[]a:sortArr){
            System.out.println(Arrays.toString(a));
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
  
   
    }

   
}
