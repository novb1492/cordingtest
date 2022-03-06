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
    //1이 시작
    //1.1,1.2*,2.1,2.2,2.3*,3.1,3.2,3.3,3.4*,4.1,4.2,4.3,4.4,=1234
    //4=false,3=false,2=false
    //3.4*,4.1,4.2,4.3*,3.1,3.2,3.3,3.4=1243
    //3=false,4=false,2=false ,최상위 이동
    //1.3*,3.1,3.2*,2.1,2.2,2.3.2.4*,4.1,4.2,.4.3,4.4=1324
    //4=false,3=false,2flase
    //3.3,3.4*,4.1,4.2*,2.1,2.2,2.3,2.4=1342
    //2=false,4fasle,최상위 이동 
    //1.4*,4.1,4.2*,2.1,2.2,2.3*,3.1,3.2,3.3,3.4=1423 올라와서 
    //3false=2.4 =true 상태 
    //2false=4.3*,3.1,3.2*,3.3,3.4=1432
    static int a=1;
    static boolean[] vistied2=new boolean[5];
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
        /*StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int max=Integer.parseInt(st.nextToken());
        int num=Integer.parseInt(st.nextToken());
        int check=0;
        Map<String,Boolean>distinctByKey=new HashMap<>();
        List<String>arr=new ArrayList<>();*/
        boolean[] vistied=new boolean[5];
        int deep=1;
        for(int i=1;i<=4;i++){
            dfs(i,vistied,deep);

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
    private static void dfs(int n,boolean[] vistied,int deep) {
       // 방문 처리
        vistied[n] = true;
        // 방문 노드 출력
        System.out.print(n );
        if(deep==4){
            System.out.println("");
           return;
        }
        // 방문한 노드에 인접한 노드 찾기
        for (int node : graph[n]) {
            // 인접한 노드가 방문한 적이 없다면 DFS 수행
            if(!vistied[node]) {
                deep++;
                dfs(node,vistied,deep);
                vistied[node]=false;
            }
        }

    }
   
}
