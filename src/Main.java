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
        String[] arr = new String[total];
        for(int i=0;i<total;i++){
            StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
            arr[i]=st.nextToken()+" "+st.nextToken();
        }
        Arrays.sort(arr,(o1, o2) -> { 
            int a=Integer.parseInt(o1.split(" ")[0]);
            int b=Integer.parseInt(o2.split(" ")[0]);
            if(a==b){
                return 0;
            }
            return Integer.compare(a, b);
        });
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
        for(String s:arr){
            bw.write(s+"\n");   //버퍼에 있는 값 전부 출력
            bw.flush();   //남아있는 데이터를 모두 출력시킴

        }
        bw.close();
       
      
     

   
    }
   
}
