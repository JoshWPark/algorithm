import java.util.Scanner;
import java.util.LinkedList;

public class Main {
    static int n=0;
    static int k=0;
    public static void main(String[] args) {
        LinkedList<Integer> queue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();          // n = 큐 사이즈
        k = scanner.nextInt();          // k = 제거 순서
        for (int a=1; a<=n;a++){         //큐 채워넣기
            queue.offer(a);
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");
        while(queue.size()>1){
            for(int i = 1; i<k; i++){
                queue.addLast(queue.pollFirst());
            }
            sb.append(queue.poll()).append(", ");
        }
        sb.append(queue.poll()).append(">");
        System.out.println(sb);
    }
}

