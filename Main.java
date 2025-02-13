import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("数当てゲームを始めます");
        Scanner scan = new Scanner(System.in);

        int answer = (int)(Math.random() * 10) + 1;
        int num;

        do {
            System.out.print("1から10の間の数字を入力してください:");
            num = scan.nextInt();

            if (num < answer) {
                System.out.println("もっと大きい値です。");
            }
            else if (num > answer) {
                System.out.println("もっと小さい値です。");
            }
            else {
                System.out.println("正解です！");
            }
        } while (num != answer);

        scan.close();
    }
}