import java.util.Scanner;

/*public class ABProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a + b);
        sc.close();
    }
}*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 *
 * A+B问题
 * */
public class ABProblem {
    public static void main(String[] args)throws IOException{

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] str = bf.readLine().split(" ");
        int[] input = new int[str.length];
        for (int i = 0; i < input.length; i++){
            input[i] = Integer.parseInt(str[i]);
        }
        System.out.print(input[0] + input[1]);
    }
}


/*
*
* A+B问题
* */

