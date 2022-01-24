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
        int total=Integer.parseInt(bf.readLine());
        List<String> arr = new ArrayList<>();
        for(int i=0;i<total;i++){
            StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
            arr.add(st.nextToken()+","+st.nextToken());
        }
        int size=arr.size();
        String[]arr2=new String[size];
        for(int i=0;i<size;i++){
            int rank=0;
            String s=arr.get(i);
            for(int ii=0;ii<size;ii++){
                int age=Integer.parseInt(s.split(",")[0]);
                int age2=Integer.parseInt(arr.get(ii).split(",")[0]);
                if(age>age2){
                    rank++;
                }else if(age==age2){
                    if(i>ii){
                        rank++;
                    }
                }
            }
            arr2[rank]=s;
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
        for(String s:arr2){
                  bw.write(s.replace(",", " ")+"\n");   //버퍼에 있는 값 전부 출력
        bw.flush();   //남아있는 데이터를 모두 출력시킴

        }
        bw.close();
       
      
     

   
    }
   
}
