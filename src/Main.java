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
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int max=Integer.parseInt(st.nextToken());
        int num=Integer.parseInt(st.nextToken());
        int check=0;
        while(true){
            check+=1;
            for(int i=1;i<max;i++){
                for(int ii=0;ii<num;ii++){
                    System.out.println(i);
                }
            }
            if(check==max){
                break;
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
        /*int s=arr.length;
        for(int i=0;i<s;i++){
            int a=arr[i];
             if(a>0){
                 for(int ii=0;ii<a;ii++){
                    bw.write(i+"\n");   //버퍼에 있는 값 전부 출력
                    bw.flush();   //남아있는 데이터를 모두 출력시킴 
                 }
            }
        }
        bw.close();*/
       
      
     

   
    }
   
}
