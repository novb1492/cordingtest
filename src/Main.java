import java.io.BufferedReader;

import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws Exception {
        try (BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); ) {
            int up= Integer.parseInt(bf.readLine());//하루ㅈ이동
            int down=Integer.parseInt(bf.readLine());//하루 다운
            int total=Integer.parseInt(bf.readLine());//총높이
            int start=0;
            int time=0;
            while(true){
                //System.out.println(start);
                if(start>=total){
                    break;
                }
                time+=1;
                start+=up;
                if(start>=total){
                    break;
                }else{
                    start-=down;
                }
            }
            System.out.println(time);

        }
    }
}
