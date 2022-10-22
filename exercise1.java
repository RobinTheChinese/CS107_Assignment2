import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for(int i = 0;i < n;i++){
            int p = sc.nextInt();
            int q = sc.nextInt();
            int[] p_list = new int[p];
            int[] q_list = new int[q];
            int[] sum = new int[51];
            for(int num = 0;num < p;num++){
                p_list[num] = sc.nextInt();
            }
            for(int num = 0;num < q;num++){
                q_list[num] = sc.nextInt();
            }
            for(int num = -1;num >= -p;num--){
                sum[51+num] += p_list[p_list.length+num];
            }
            for(int num = -1;num >= -q;num--){
                sum[51+num] += q_list[q_list.length+num];
            }
            for(int num = -1;num >= -50;num--){
                if(sum[51+num]  >= 10){
                    sum[50+num] ++;
                    sum[51+num] -= 10;
                }
            }
            int t = 0;
            for(int u:sum){
                t += u;
            }
            if(t != 0) {
                int s = 0;
                for (int k = 0; k < 51; k++) {
                    if (sum[k] != 0) {
                        s = k;
                        break;
                    }
                }
                for (int k = s; k < 51; k++) {
                    System.out.print(sum[k]);
                }
            }else{
                System.out.print(0);
            }
            System.out.println();
        }
    }
}
