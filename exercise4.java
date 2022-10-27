import java.util.Objects;
import java.util.Scanner;

public class exercise4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[][] list = new String[5][2];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                list[i][j] = sc.next();
            }
        }


        boolean Flush = true;
        for (int i = 0; i < 4; i++) {
            if(!Objects.equals(list[i][0], list[i + 1][0])){
                Flush = false;
                break;
            }
        }

        boolean Straight = true;
        int[] mid = new int[5];
        for (int i = 0; i < 5; i++) {
            mid[i] = Integer.parseInt(list[i][1]);
        }
        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 5; j++) {
                if(mid[i] > mid[j]){
                    int k = mid[i];
                    mid[i] = mid[j];
                    mid[j] = k;
                }
            }
        }
        for (int i = 0; i < 4; i++) {
            if (mid[i+1] - mid[i] != 1){
                Straight = false;
                break;
            }
        }

        boolean Three_of_a_Kind = false;
        if(mid[0] == mid[1] && mid[1] == mid[2]){
            Three_of_a_Kind = true;
        } else if (mid[1] == mid[2] && mid[2] == mid[3]) {
            Three_of_a_Kind = true;
        } else if (mid[2] == mid[3] && mid[3] == mid[4]) {
            Three_of_a_Kind = true;
        }

        boolean Pair = false;
        for (int i = 0; i < 4; i++) {
            if (mid[i+1] - mid[i] == 0){
                Pair = true;
                break;
            }
        }

        if(Straight && Flush){
            System.out.print("Straight Flush");
        } else if (Flush) {
            System.out.print("Flush");
        } else if (Straight) {
            System.out.print("Straight");
        } else if (Three_of_a_Kind) {
            System.out.print("Three of a Kind");
        } else if (Pair) {
            System.out.print("Pair");
        } else{
            System.out.print("High Card");
        }
    }
}
