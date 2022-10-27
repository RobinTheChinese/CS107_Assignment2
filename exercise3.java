import java.util.*;


public class exercise3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int[] pts = new int[4];
            ArrayList<Integer> dys = new ArrayList<>();
            int[] order = {0 , 1 , 2 , 3};
            int time = 0;


            int sum = 0;
            for (int j = 0; j < 4; j++) {
                pts[j] = sc.nextInt();
                sum += pts[j];
            }
            int dif = 100 - sum;


            for (int j = 0; j < 4; j++) {
                dys.add(sc.nextInt());
            }
            ArrayList<Integer> dys_sorted = new ArrayList<>(dys);
            for (int j = 3; j >= 1; j--) {
                for (int k = j - 1; k >= 0; k--) {
                    if(dys_sorted.get(j) < dys_sorted.get(k)){
                        int l = order[j];       int m = dys_sorted.get(j);
                        order[j] = order[k];    dys_sorted.set(j,dys_sorted.get(k));
                        order[k] = l;           dys_sorted.set(k,m);
                    }
                }
            }


            if(dif > 0){
                int index;
                for1:
                for (int j = 0; j < 4; j++) {
                    index = order[j];
                    while(pts[index] < 30){
                        pts[index] ++;
                        dif --;
                        time += dys.get(index);
                        if(dif == 0){
                            break for1;
                        }
                    }
                }
                System.out.println(time);
            }else{
                System.out.println(0);
            }
        }
    }
}
