import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String toDo = "=== ToDo一覧 ===\n";
        while(true) {
            System.out.print("入力してください：");
            String td = scanner.nextLine();

            if(td.equals("")) {
                System.out.println("ToDoを入力してください。");
                continue;
            }

            toDo += "- " + td + "\n";

            System.out.println(toDo);

            while(true) {
                System.out.print("続いて追加しますか？(y/n)：");
                String again = scanner.nextLine();

                if(again.equals("y")) {
                    break;
                } else if(again.equals("n")) {
                    scanner.close();
                    return;
                } else {
                    System.out.println("無効な入力です。");
                }
            }
        }
    }
}