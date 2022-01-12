import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total=Integer.parseInt(br.readLine());
        String result=",";//배열말고 스프링으로 구별하기
        for(int i=0;i<total;i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int height = Integer.parseInt(st.nextToken());//최대 층수
            int width = Integer.parseInt(st.nextToken());//최대 실수 
            int num = Integer.parseInt(st.nextToken());// n번째 손님
            int startWidth=1;//방은 항상 1부터 시작
            int mok=num/height;
            int nam=num%height;
            if(num<=height){// 첫번째 줄이라면 연산 x
                nam=num;
            }else{
                if(nam==0){//나머지 0= 제일 위에층
                    mok-=1; //줄이동이 일어난게 아니기 때문에 -1
                    nam=height;//제일위에층 그냥 부여
                }
                startWidth+=mok;
            }
            nam*=100;//호실은 100단위 부터시작
            int room=nam+startWidth;//층+실 더하기
            result+=room+"\n";
        }
        System.out.println(result.replace(",", ""));//첫문자열제거
		
       
       

        
    }
}
