import java.util.*;

public class exercise2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean [] aimlist = new boolean[n + 1];
        ArrayList<Integer> output = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            aimlist[sc.nextInt()] = true;
        }
        for (int i = 1; i <= n; i++) {
            if(! aimlist[i]){
                output.add(i);
            }
        }
        Collections.sort(output);
        int size = output.size();
        if(size != 0) {
            for (int i = 0; i < size - 1; i++) {
                System.out.printf("%d ", output.get(i));
            }
            System.out.print(output.get(size - 1));
        }else {
            System.out.print("NULL");
        }
    }
}
