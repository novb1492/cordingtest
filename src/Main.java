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
    
    // 그림예시 그래프의 연결상태를 2차원 배열로 표현
    // 인덱스가 각각의 노드번호가 될 수 있게 0번인덱스는 아무것도 없는 상태라고 생각하시면됩니다.
    //static int[][] graph = {{}, {2,3,8}, {1,6,8}, {1,5}, {5,7}, {3,4,7}, {2}, {4,5}, {1,2}};
    static int[][] graph = {{}, {1,2,3,4}, {1,2,3,4}, {1,2,3,4}, {1,2,3,4}};
    //1* start
    //1.1,1.2*,2.1,2.2,2.3*,3.1,3.2,3.3,3.4*,4.1,4.2,4.3,4.4,=1234
    //4false
    //3false=2.4*,4.1,4.2,4.3*,3.1,3.2,3.3,3.4=1243
    //3false=4.4,최상위 이동=3*
    //1.3*,3.1,3.2*,2.1,2.2,2.3.2.4*,4.1,4.2,.4.3,4.4=1324 
    //4false=3.3,3.4*,4.1,4.2,4.3,4.4=1342
    //4false,최상위 이동 =4*
    //1.4*,4.1,4.2*,2.1,2.2,2.3*,3.1,3.2,3.3,3.4=1423 
    //3false=2.4 
    //2false=4.3*,3.1,3.2*,3.3,3.4=1432
    //2flase
    //3false=4.3*,3.1,3.2*,3.3,3.4=1432
    //2false=3.3,3.4
    //3false=3.4 
    //---------------------------------
    //2*start
    //2.1*,2.1,2.2,2.3*,3.1,3.2,3.3,3.4*,4.1,4.2,4.3,4.4=2134
    //4false
    //3false=2.4*,4.1,4.2,4.3*,4.4=2143
    //4false 최상위 이동 =3*
    //2.2,2.3*,3.1*,1.1,1.2,1.3,1.4*=2314
    //1false=3.2,3.3,3.4*,4.1*,4.2,4.3,4.4=2341
    //4false  최상위 이동=4*
    //2.4,4.1*,1.1,1.2,1.3*,3.1,3.2,3.3,3.4=2413
    //3false=1.4
    //1false=4.2,4.3*,3.1*,1.1,1.2,1.3,1.4=2431
    //1false=3.2,3.3,3.4
    //3false=4.4
    //-----------------------------------
    //3*start
    //3.1*,1.1,1.2*,2.1,2.2,2.3,2.4*=3124
    //4false
    //2false=1.3,1.4*,4.1,4.2*,2.1,2.2,2.3,2.4=3142
    //2false=4.3,4.4
    //4false 최상위 이동 2
    //3.2*,2.1*,1.1,1.2,1.3,1.4*=3214
    //4false
    //1false=2.2,2.3,2.4*,4.1*,1.1,1.2,1.3,1.4=3241
    //1false=4.2,4.3,4.4 최상위 이동 3
    //3.4*,4.1*,1.1,1.2*,1.3,1.4=3412
    //2false
    //1false=4.2*,2.1*,1.1,1.2,1.3,1.4=3421
    //1false=2.2,2.3,2.4
    //2false=4.3,4.4
    //--------------------------------------
    //4* start
    //4.1*,1.1,1.2*,1.3*,3.1,3.2,3.3,3.4=4123
    //3false=1.4
    //2false=1.3*,3.1,3.2*,2.1,2.2,2.3,3.4=4132
    //2false=3.3,3.4
    //3false=1.4 
    //1false 최상위 이동=2*
    //4.2*,2.1*,2.2,2.3*,3.1,3.2,3.3,3.4=4213
    //3fasle=2.4
    //1false=2.2,2.3*,3.1*,1.1,1.2,1.3,1.4=4231
    //1false=3.2,3.3,3.4
    //3false=2.4
    //2false = 최상위 이동 3*
    //4.3*,3.1*,1.1,1.2*,2.1,2.2,2.3,2.4=4312
    //2false=1.3,1.4
    //1false=3.2*,2.1*,1.1,1.2,1.3,1.4=4321
    //4 사이클 작성완료 
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
        /*StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int max=Integer.parseInt(st.nextToken());
        int num=Integer.parseInt(st.nextToken());
        int check=0;
        Map<String,Boolean>distinctByKey=new HashMap<>();
        List<String>arr=new ArrayList<>();*/
        for(int i=1;i<=4;i++){
            int deep=1;
            String str=Integer.toString(i);
            boolean[] vistied=new boolean[5];
            dfs(i,vistied,deep,str);

        }

        //arr = arr.stream().distinct().collect(Collectors.toList());

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
    private static void dfs(int n,boolean[] vistied,int deep,String str) {
       // 방문 처리
        vistied[n] = true;
        str+=Integer.toString(n);
        System.out.println(str);
        if(deep==4){
            
           return;
        }
        for (int node : graph[n]) {
            // 인접한 노드가 방문한 적이 없다면 DFS 수행
            if(!vistied[node]) {
                deep++;
                dfs(node,vistied,deep,str);
                vistied[node]=false;
            }
        }

    }
   
}
