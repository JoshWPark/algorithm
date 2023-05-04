import java.util.Scanner;

public class Main {
    static int size = 0;
    static int [] arr = new int[10000];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = scanner.nextInt();          // t = 테스터 데이터
        for (int i = 0; i < t; i++) {

            String command = scanner.next();
            switch (command){
                case "push":
                    int x = scanner.nextInt();
                    arr[size] = x;
                    size++;
                    break;
                case "pop":
                    if (size==0){
                        sb.append(-1).append("\n");
                    }
                    else{
                        sb.append(arr[size-1]).append("\n");
                        size--;
                    }
                    break;
                case "size":
                    sb.append(size).append("\n");
                    break;
                case "empty":
                    int check = (size>0) ? 0 : 1;
                    sb.append(check).append("\n");
                    break;
                case "top":
                    if (size==0){
                        sb.append(-1).append("\n");
                    }
                    else{
                        sb.append(arr[size-1]).append("\n");
                    }
                    break;
            }
        }
        System.out.println(sb);
    }
}