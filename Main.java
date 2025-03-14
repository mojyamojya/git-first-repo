import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("数当てゲームを始めます");
        Scanner scan = new Scanner(System.in);

        int answer = (int)(Math.random() * 10) + 1;
        int num;
        int attempts = 0;

        do {
            System.out.print("1から10の間の数字を入力してください:");
            num = scan.nextInt();
            attempts++;

            if (num < answer) {
                System.out.println("もっと大きい値です。");
            }
            else if (num > answer) {
                System.out.println("もっと小さい値です。");
            }
            else {
                System.out.println("正解です！");
                System.out.println(attempts + "回で正解しました！");
                if (attempts <= 3) {
                    System.out.println("素晴らしい！");
                }
                else if (attempts <= 5) {
                    System.out.println("なかなかいい感じです！");
                }
                else {
                    System.out.println("もう少し頑張りましょう！");
                }
            }
        } while (num != answer);

        scan.close();
    }
}