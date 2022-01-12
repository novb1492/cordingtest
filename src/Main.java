import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total=Integer.parseInt(br.readLine());
        int count=0;
        while(true){
            if(total%5==0){//5로나눠지나 확인
                count+=total/5;
                System.out.println(count);
                return;
            }
            total-=3;//안나눠진다면 3키로 빼기
            count++;//가방개수증가 
            if(total<0){
                break;
            }
            
        }
        System.out.println(-1);
    }
}
