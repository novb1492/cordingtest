import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num=Integer.parseInt(br.readLine());
       for(int i=1;i<num;i++){//num보다 작을때
          // System.out.println(i);
           int n=i;
           int sum=0;
           int total=0;
           while(true){//몫이 0이될때까지 나눔
            int a=n%10;
            sum+=a;
            n/=10;
           if(n==0){//0이라면 나온 수 +원래수 더하기
            //System.out.println(i+":"+sum+"="+(i+sum));
            total=i+sum;
            break;
           }
           }
           if(total==num){//더한값이 원래수랑 같다면 출력
               System.out.println(i);
               return;
           }
       }
       System.out.println(0);
       
        
        
    }
}
