import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
        int t=Integer.parseInt((bf.readLine()));
        List<int[]>lIntegers=new ArrayList<>();
        for(int i=0;i<t;i++){//입력 수 만큼 사람정보 받기
            StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
            int[] arr = new int[2];
            arr[0]=Integer.parseInt(st.nextToken());
            arr[1]=Integer.parseInt(st.nextToken());
            lIntegers.add(arr);
        }
        String ranks="";
        for(int i=0;i<lIntegers.size();i++){//배열수 검사
            int rank=1;
            for(int ii=0;ii<lIntegers.size();ii++){
                if(ii!=i){//본인과 본인의 정보라면 건너뛰게
                    int[]a=lIntegers.get(i);
                    int[]b=lIntegers.get(ii);
                    //System.out.println("a1:"+a[0]+" a2:"+a[1]+" b1:"+b[0]+" b2:"+b[1]);
                    if(a[0]<b[0]&&a[1]<b[1]){//둘다 작아야 랭크가 떨어짐
                        //System.out.println("up");
                        rank++;
                    }
                }
            }
            ranks+=Integer.toString(rank)+",";
        }
        System.out.println(ranks.replace(",", "\n"));
    }
   
}
