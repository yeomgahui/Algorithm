import java.util.Scanner;

public class GreedyAlgorithm03 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        int A =0;
        int B = 0;
        int C = 0;

            if(T%10 != 0){
                System.out.println(-1);
            }else{
                A += T / 300;
                T  -= A*300;
                B += T/60;
                T -= B*60;
                C += T/10;
                System.out.println(A+" "+B+" "+C);
            }

    }
}
