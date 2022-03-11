import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Map.Entry;
import java.util.stream.Collectors;


public class Main {
    
  
    public static void main(String[] args) throws Exception {
        String[]id_list=new String[4];
        id_list[0]="muzi";
        id_list[1]="frodo";
        id_list[2]="apeach";
        id_list[3]="neo";
        String[]report=new String[5];
        report[0]="muzi frodo";
        report[1]="apeach frodo";
        report[2]="frodo neo";
        report[3]="muzi neo";
        report[4]="apeach muzi";
        int k=2;
        Map<String,Object>map=new HashMap<>();
        for(String s:report){
            String[] ss=s.split(" ");
            if(map.containsKey(ss[1])){
                String attack=map.get(ss[0]).toString();

            }else{
                map.put(ss[1], ss[0]);
            }
        }
        System.out.println(map.toString());
    }

   
}
