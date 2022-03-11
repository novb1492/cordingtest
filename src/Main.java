import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
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
        int[] fees=new int[4];
        fees[0]=180;//기본시간
        fees[1]=5000;//기본요금  
        fees[2]=10;//n분당
        fees[3]=600;//요금
        String[] records={"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"};

        
        System.out.println(Arrays.toString(solution(fees, records)));
           
        
    }
    public static int[] solution(int[] fees, String[] records) {
        Map<String,String>cars=new HashMap<>();
        for(String record:records){
            String carNum=record.split(" ")[1];
            if(cars.containsKey(carNum)){
                String infors=cars.get(carNum);
                infors=infors+","+record;
            }else{
                cars.put(carNum, record);
            }
        }
        System.out.println(cars.toString());
        int[] answer = {};
        return answer;
    }

   
}
