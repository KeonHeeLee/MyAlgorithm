import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] argv) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int gcd = GCD(A, B);
        System.out.println(gcd);
        System.out.println(A*B/gcd);

        br.close();
    }

    private static int GCD(int A, int B) {
        int a = Math.max(A, B);
        int b = Math.min(A, B);
        int r = a % b;

        while(r > 0){
            a = b;
            b = r;
            r = a % b;
        }

        return b;
    }
}
