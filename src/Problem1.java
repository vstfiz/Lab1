import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int noOfElements = scanner.nextInt();
        int[] data = new int[noOfElements];
        for(int i = 0;i< noOfElements;i++){
            data[i] = scanner.nextInt();
        }
        int element = scanner.nextInt();
        for (int i=0;i<noOfElements;i++){
            if(element == data[i]){
                System.out.print(i+" ");
            }
        }
        //Complexity O(n)
        //Code By Vivek Sharma{D(64)}
    }
}