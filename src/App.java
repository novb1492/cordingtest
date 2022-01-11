import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner scan = new Scanner(System.in)) {
            int sun=1;//분모
            int mother=1;//분자
            int next=1;//한줄의 최대 회수
            int upTime=1;//줄바꿈회수
            int totalTime=1;//전체 회수 
            int temp=1;//한줄의 시작 항상 1이여야한다
            int max=scan.nextInt();//조건회수
            while(true){
                //System.out.println("next: "+next);
                if(totalTime==max){//계산회수가 총회수랑 같으면 정지
                    break;
                }
                if(temp==next){//한줄 회수가 끝났다면 라인 옮기기
                    //System.out.println("line move");
                    if(upTime%2==0){//짝수번째라면 분자 +
                        sun++;
                    }else{//홀수번째라면 분모+
                        mother++;
                    }
                    temp=1;//줄 시작회수 1로 초기화
                    next++;//바뀐줄 최대회수 증가
                    upTime++;//줄 바꿈 회수 증가
                }else{
                    //System.out.println(sun+"/"+mother);
                    if(upTime%2==0){// 문제는 줄바꿈 회수가 홀수일때 분모--,분자++이지만 나는1부터 시작해서 바로 짝수가 됨
                        //System.out.println("a");
                        mother--;
                        sun++;
                    }else{
                        //System.out.println("b");
                        sun--;
                        mother++;
                    }
                    temp++;    
                }
                totalTime++;

            }
            System.out.println(sun+"/"+mother);
        }
        
    }
}
