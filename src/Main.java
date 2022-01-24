import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.Map.Entry;
import java.util.stream.Collectors;


public class Main {
    public static boolean compare(String a,String b,int length) {
        if((int)a.charAt(0)>(int)b.charAt(0)){
            return true;
        }else if((int)a.charAt(0)<(int)b.charAt(0)){
            return false;
        }
        for(int i=0;i<length;i++){
            System.out.println("a: "+(int)a.charAt(i)+" b: "+(int)b.charAt(i));
            if((int)a.charAt(i)>(int)b.charAt(i)){
                System.out.println("더큼");
                return true;
            }           
        }
        return false;
    }
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
        //            StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int total=Integer.parseInt(bf.readLine());
        List<String> arr = new ArrayList<>();
        for(int i=0;i<total;i++){
            arr.add(bf.readLine());
        }
        //중복제거
        arr=arr.stream().distinct().collect(Collectors.toList());
        int size=arr.size();
        String[] arr2=new String[arr.size()];
        for(int i=0;i<size;i++){
            int rank=0;
            String a=arr.get(i);
            System.out.println("i: "+a);
            for(int ii=0;ii<size;ii++){
                System.out.println("ar: "+rank);
                String b=arr.get(ii);
                if(a!=b){
                    if(a.length()>b.length()){//길면 증가
                        rank++;
                    }else if(a.length()==b.length()){//길이가 같다면 사전순으로 정렬
                        //첫글자만 비교해서 실패하는중 밥먹고 모든글자 비교해서 break걸면된다
                        if(compare(a, b,a.length())){
                            rank++;
                        }
                    }
                }
            }
            System.out.println("rank: "+rank);
            arr2[rank]=a;
        }
        System.out.println("-------------------");
        for(String s:arr2){
            if(s!=null){
                System.out.println(s);

            }
        }
       
      
     

   
    }
   
}
