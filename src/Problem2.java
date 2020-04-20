import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int noOfElements = scanner.nextInt();
        int[] data = new int[noOfElements];
        for(int i = 0;i< noOfElements;i++){
            data[i] = scanner.nextInt();
        }
        Set<Integer> setData = new HashSet<Integer>();
        for (int i=0;i<noOfElements;i++){
            if(!setData.add(data[i])){
                System.out.print(data[i]+" ");
            }
        }
        //Complexity O(n)
        //Code By Vivek Sharma{D(64)}
    }
}
