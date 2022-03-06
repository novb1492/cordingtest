import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;



public class Main {
    
    // 그림예시 그래프의 연결상태를 2차원 배열로 표현
    // 인덱스가 각각의 노드번호가 될 수 있게 0번인덱스는 아무것도 없는 상태라고 생각하시면됩니다.
    //static int[][] graph = {{}, {1,2,3,4}, {1,2,3,4}, {1,2,3,4}, {1,2,3,4}};
    //1* start --4 before =1
    //1.1,1.2*,before=2,2.1,2.2,2.3*,before=3,3.1,3.2,3.3,3.4*,before=4,4.1,4.2,4.3,4.4=1234 
    //4false 
    //3false 2.4* before=4, 4.1,4.2,4.3* return;
    //3false
    //4false
    //1.3* before=3,3.1,3.2* return;
    //2false
    //1.4* before=4,4.1,4.2* return;
    //2false
    //4false
    //----------------------------
    //2 * start --3 before=2
    //2.1* return;
    //1 false
    //2.3* before=3,3.1* return;
    //1false 3.2,3.4* =234
    //4false
    //3false 2.4*,4.1* return;
    //1false
    //4 false
    //------------------------------
    
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int max=Integer.parseInt(st.nextToken());
        int num=Integer.parseInt(st.nextToken());
        int[][] graph = {{},{1,2,3,4,5,6,7,8},{1,2,3,4,5,6,7,8},{1,2,3,4,5,6,7,8},{1,2,3,4,5,6,7,8},{1,2,3,4,5,6,7,8},{1,2,3,4,5,6,7,8},{1,2,3,4,5,6,7,8},{1,2,3,4,5,6,7,8}};
        for(int i=1;i<=max;i++){
            int deep=1;
            String str="";
            boolean[] vistied=new boolean[max+1];
            int beforeN=0;
            dfs(i,vistied,deep,str,num,graph,max,beforeN);

        }


        //BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
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
    private static void dfs(int n,boolean[] vistied,int deep,String str,int num,int[][] graph,int max,int beforeN) {
       // 방문 처리
        vistied[n] = true;
        if(beforeN!=0){
            if(beforeN>n){
               // System.out.println(beforeN+":"+n);
                return;
            }
        }
        str=str+" "+Integer.toString(n);
        if(deep==num){ 
           System.out.println(str.trim());  
           return;
        }
        for (int i=1;i<=max;i++) {
            if(!vistied[i]) {
                beforeN=n;
                dfs(i,vistied,deep+1,str,num,graph,max,beforeN);
                vistied[i]=false;
            }
        }

    }
   
}
