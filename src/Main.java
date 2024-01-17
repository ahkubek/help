import  java.util.Scanner;
public class Main {
    public static void main(String[] args) throws java.io.IOException {
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("справка:");

            System.out.println("1.if");
            System.out.println("2.switch:");
            System.out.println("выберите");
            ch = (char) System.in.read();

            switch (ch) {
                case '1':
                    System.out.println(" if\n");
                    System.out.println("if (условие) инструкция;");
                    System.out.println("else инструкция;");
                    break;
                case '2':
                    System.out.println("Инструкция switch: \n");
                    System.out.println("Выражение{");
                    System.out.println("case: константа");
                    System.out.println("последовательность инструкций");
                    System.out.println("break;");
                    System.out.println("//...");
                    System.out.println("}");
                    break;
                default:
                    System.out.println("Запрос не найден");
            }
        }
    }