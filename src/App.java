import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int sun=1;
        int mother=1;
        int next=1;
        int upTime=1;
        int totalTime=1;
        try (Scanner scan = new Scanner(System.in)) {
            int temp=1;
            int max=scan.nextInt();
            while(true){
                //System.out.println("next: "+next);
                if(totalTime==max){
                    break;
                }
                if(temp==next){
                    //System.out.println("line move");
                    if(upTime%2==0){
                        sun++;
                    }else{
                        mother++;
                    }
                    temp=1;
                    next++;
                    upTime++;
                }else{
                    System.out.println(sun+"/"+mother);
                    if(upTime%2==0){
                        System.out.println("a");
                        mother--;
                        sun++;
                    }else{
                        System.out.println("b");
                        sun--;
                        mother++;
                    }
                    temp++;    
                }
                totalTime++;

            }
            System.out.println("fianl "+sun+"/"+mother);
        }
        
    }
}
