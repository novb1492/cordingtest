import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.Arrays;

import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
        int total=Integer.parseInt(bf.readLine());
        int[][] arr =new int[total][2];
        for(int i=0;i<total;i++){
            StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
            arr[i][0]=Integer.parseInt(st.nextToken());
            arr[i][1]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr,(o1, o2) -> { 
            if(o1[0] == o2[0]){ 
                return Integer.compare(o1[1],o2[1]);
             } else{ 
                 return Integer.compare(o1[0],o2[0]); 
             }
        });
        for(int[] a:arr){
            System.out.println(a[0]+" "+a[1]);
        }

       
      
     

   
    }
   
}
