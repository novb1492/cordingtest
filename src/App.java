import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner scan = new Scanner(System.in)) {
            int up=scan.nextInt();//하루ㅈ이동
            int down=scan.nextInt();//하루 다운
            int total=scan.nextInt();//총높이
            int start=0;
            int time=0;
            while(true){
                System.out.println(start);
                if(start==total){
                    break;
                }
                time+=1;
                start+=up;
                if(start>total){
                    break;
                }else{
                    start-=down;
                }
            }
            System.out.println(time);

        }
    }
}
