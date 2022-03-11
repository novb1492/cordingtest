import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Map.Entry;
import java.util.stream.Collectors;


public class Main {
    
  
    public static void main(String[] args) throws Exception {
        int[] fees={120, 0, 60, 591};
        /*fees[0]=180;//기본시간
        fees[1]=5000;//기본요금  
        fees[2]=10;//n분당
        fees[3]=600;//요금*/
        String[] records={"16:00 3961 IN","16:00 0202 IN","18:00 3961 OUT","18:00 0202 OUT","23:58 3961 IN"};

        
        System.out.println(Arrays.toString(solution(fees, records)));
           
        
    }
    public static int[] solution(int[] fees, String[] records) {
        Map<String,Object>cars=new HashMap<>();
        for(String record:records){
            String carNum=record.split(" ")[1];
            if(cars.containsKey(carNum)){
                String infors=cars.get(carNum).toString();
                infors=infors+","+record;
                cars.replace(carNum, infors);
            }else{
                cars.put(carNum, record);
            }
        }
        //System.out.println(cars.toString());
        Map<String,Integer>totalMinByCars=new HashMap<>();
        for(Entry<String, Object> car:cars.entrySet()){
            String[] infors=car.getValue().toString().split(",");
            String carNum=car.getKey();
            System.out.println(Arrays.toString(infors));
            if(infors.length%2!=0){
                //System.out.println(Arrays.toString(infors));
                int in=0;
                int out=0;
                Boolean flag=false;
                for(int i=0;i<infors.length;i++){
                    if(i==infors.length-1){
                        if(infors[i].split(" ")[2].equals("IN")){
                            String[] times=infors[i].split(" ")[0].split(":");
                            in=Integer.parseInt(times[0])*60+Integer.parseInt(times[1]);
                            flag=true;
                        }
                        if(flag){
                            out=23*60+59;
                            int minusMin=out-in;
                            if(totalMinByCars.containsKey(carNum)){
                                int originMinusMin=totalMinByCars.get(carNum);
                                originMinusMin=originMinusMin+minusMin;
                                totalMinByCars.replace(carNum, originMinusMin);
                            }else{
                                totalMinByCars.put(carNum, minusMin);
                            }
                            flag=false;
                        }
                    }else{
                        if(infors[i].split(" ")[2].equals("IN")){
                            String[] times=infors[i].split(" ")[0].split(":");
                            in=Integer.parseInt(times[0])*60+Integer.parseInt(times[1]);
                        }else{
                            String[] times=infors[i].split(" ")[0].split(":");
                            out=Integer.parseInt(times[0])*60+Integer.parseInt(times[1]);
                            int minusMin=out-in;
                            if(totalMinByCars.containsKey(carNum)){
                                int originMinusMin=totalMinByCars.get(carNum);
                                originMinusMin=originMinusMin+minusMin;
                                totalMinByCars.replace(carNum, originMinusMin);
                            }else{
                                totalMinByCars.put(carNum, minusMin);
                            }
                        }
                    }
                }
            }else{
                int in=0;
                int out=0;
                for(int i=0;i<infors.length;i++){
                    if(infors[i].split(" ")[2].equals("IN")){
                        String[] times=infors[i].split(" ")[0].split(":");
                        in=Integer.parseInt(times[0])*60+Integer.parseInt(times[1]);
                    }else{
                        String[] times=infors[i].split(" ")[0].split(":");
                        out=Integer.parseInt(times[0])*60+Integer.parseInt(times[1]);
                        int minusMin=out-in;
                        if(totalMinByCars.containsKey(carNum)){
                            int originMinusMin=totalMinByCars.get(carNum);
                            originMinusMin=originMinusMin+minusMin;
                            totalMinByCars.replace(carNum, originMinusMin);
                        }else{
                            totalMinByCars.put(carNum, minusMin);
                        }
                    }
                }
            }
        }
        //System.out.println(totalMinByCars.toString());
        for(Entry<String, Integer> totalMinByCar:totalMinByCars.entrySet()){
            System.out.println(totalMinByCar.toString());
            int totalMin=totalMinByCar.getValue()-fees[0];
            System.out.println(totalMin);
            if(totalMin<=0){
                totalMinByCars.replace(totalMinByCar.getKey(), fees[1]);
            }else{
                int mok=totalMin/fees[2];
                int nam=totalMin%fees[2];
                int price=0;
                if(nam>0){
                    price=mok*fees[3]+fees[1]+fees[3];
                }else{
                    price=mok*fees[3]+fees[1];
                }
                totalMinByCars.replace(totalMinByCar.getKey(), price);
            }
        }
        System.out.println(totalMinByCars.toString());
        int[] answer = new int[totalMinByCars.size()];
        return answer;
    }

   
}
