import java.util.Scanner;

public class GreedyAlgorithm01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        int count = 0;

        while(true){
            if(input %5 ==0){
                count += input/5;
                break;
            }else{

                if(input <3){
                    count = -1;
                    break;
                }
                input -= 3;
                count++;
            }
        }
        System.out.println(count);
    }
}
