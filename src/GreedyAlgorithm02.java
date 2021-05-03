import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class GreedyAlgorithm02 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); //테스트 케이스 수

        for(int i = 0; i<T; i++ ){
            int N = Integer.parseInt(br.readLine()); //지원자 수
            int [][] score = new int[N][2]; //각 지원자의 점수
            int count = 1;

            for(int j= 0; j<N; j++){
                String line = br.readLine();
                int pos = line.indexOf(" ");
                score[j][0] = Integer.parseInt(line.substring(0,pos));
                score[j][1] = Integer.parseInt(line.substring(pos+1));
            }

            Arrays.sort(score, new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    return o1[0] - o2[0];
                }
            });

            int min = score[0][1];
            for(int j = 1; j<N; j++){
                if(score[j][1] == 1){
                    count++;
                    break;
                }
                if(score[j][1] < min){
                    count++;
                    min = score[j][1];
                }
            }
            System.out.println(count);
        }
    }
}
