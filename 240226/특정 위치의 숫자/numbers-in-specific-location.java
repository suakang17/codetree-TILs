import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());

        int[] arr = new int[10];
        int sum = 0;
        for(int a = 0; a < 10; a++) {
            arr[a] = Integer.parseInt(st.nextToken());
            if(a == 2 || a == 4 || a == 9) {
                sum += arr[a];
            }
        }

        System.out.println(sum);
    }
}