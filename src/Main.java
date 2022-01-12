import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int cradCount=Integer.parseInt(st.nextToken());
		int max=Integer.parseInt(st.nextToken());
        List<Integer>integers=new ArrayList<>();
        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");

        while(st2.hasMoreTokens()){
            integers.add(Integer.parseInt(st2.nextToken()));
        }
        int result=0;
        for(int i=0;i<integers.size();i++){
            for(int ii=i+1;ii<integers.size();ii++){
                for(int iii=ii+1;iii<integers.size();iii++){
                   // System.out.println("i: "+integers.get(i)+"ii: "+integers.get(ii)+"iii: "+integers.get(iii));
                    int sum=integers.get(i)+integers.get(ii)+integers.get(iii);
                   // System.out.println("sum: "+sum);
                    if(sum==max){
                        System.out.println(sum);
                        //System.out.println("final");
                        return;
                    }else if(sum<max){
                        if(result<sum){
                            result=sum;
                        }
                    }
                }
            }
            
        }
        System.out.println(result);
        
    }
}
