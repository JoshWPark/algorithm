import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();       //최소 힙 우선순위 큐 사용
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();        // n = 사람의 수
        int time = 0;
        int total = 0;
        for(int i = 0; i<n; i++) {
            int k = sc.nextInt();        // k = 인출하는데 걸리는 시간
            queue.add(k);              // 최소 힙 우선순위 큐에 넣어서 정렬
        }
        for (int i =0; i<n; i++){
            int x = queue.poll();
            if(i==0){
                time = x;
                total = time;
            }
            else{
                time += x;
                total += time;
            }
        }
        System.out.println(total);
    }
}