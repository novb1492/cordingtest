import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
		int up = Integer.parseInt(st.nextToken());
		int down = Integer.parseInt(st.nextToken());
		int total = Integer.parseInt(st.nextToken());
        int mok=(total-down)/(up-down);
        int nam=(total-down)%(up-down);
        if(nam!=0){
            mok+=1;
        }  
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
        bw.write(Integer.toString(mok));
        bw.flush(); // write로 담은 내용 출력 후, 버퍼를 비움.
        bw.close(); 

        
    }
}
