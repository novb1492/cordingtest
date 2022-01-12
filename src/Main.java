import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        BigInteger a=new BigInteger(st.nextToken());
        BigInteger b=new BigInteger(st.nextToken());
        System.out.println(a.add(b));

    }

}
