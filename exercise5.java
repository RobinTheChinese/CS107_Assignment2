import java.util.Scanner;

public class exercise5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] stringList = new String[n];
        for (int i = 0; i < n; i++) {
            stringList[i]= sc.next();
        }
        for (int i = 0; i < n; i++) {
            String string = stringList[i];
            char[] list = string.toCharArray();

            char[][] mid = new char[4][2];
            int index = 0;
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 2; k++) {
                    mid[j][k] = list[index];
                    index++;
                }
            }
            index--;
            for (int j = 0; j < 4; j++) {
                for (int k = 1; k > -1; k--) {
                    list[index] = mid[j][k];
                    index--;
                }
            }

            System.out.print(String.valueOf(list));
            System.out.print(" ");
        }
    }
}
