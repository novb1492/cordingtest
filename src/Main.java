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
        String[]id_list2=new String[2];
        id_list2[0]="con";
        id_list2[1]="ryan";
        String[]report2=new String[4];
        report2[0]="ryan con";
        report2[1]="ryan con";
        report2[2]="ryan con";
        report2[3]="ryan con";
        int k2=3;
        System.out.println(Arrays.toString(solution(id_list, report, k)));
           
        
    }
    public static int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        LinkedHashMap<String,Integer>idAndNum=new LinkedHashMap<>();
        for(String id:id_list){
            idAndNum.put(id, 0);
        }
        LinkedHashMap<String,Object>map=new LinkedHashMap<>();
        for(String reports:report){
            //System.out.println(reports);
            String[] reportUsers=reports.split(" ");
            String reportUser=reportUsers[0];
            String targetUser=reportUsers[1];
            if(map.get(targetUser)==null){
                map.put(targetUser, reportUser);
            }else{
                String reportUserss=map.get(targetUser).toString();
                String[] reportUserArr=reportUserss.split(",");
                boolean flag=true;
                for(String s:reportUserArr){
                    //System.out.println("s:"+s+" targetUser: "+targetUser);
                    if(reportUser.equals(s)){
                        flag=false;
                        break;
                    }
                }
                if(flag){
                    reportUserss=reportUserss+","+reportUser;
                    map.put(targetUser, reportUserss);
                }
            }
        }
        //System.out.println(map.toString());
        for(Entry<String, Object> s:map.entrySet()){
            if(s.getValue().toString().split(",").length>=k){
                for(int i=0;i<id_list.length;i++){
                    if(id_list[i].equals(s.getValue().toString().split(",")[1])){
                        String[] ss=s.getValue().toString().split(",");
                        int num=idAndNum.get(ss[0]);
                        idAndNum.replace(ss[0], num+1);
                        num=idAndNum.get(ss[1]);
                        idAndNum.replace(ss[1], num+1);
                    }
                }
            }
        }
        for(int i=0;i<id_list.length;i++){
            answer[i]=idAndNum.get(id_list[i]);
        }
        return answer;
    }

   
}
