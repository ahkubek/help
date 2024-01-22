import  java.util.Scanner;
public class Main {
    public static void main(String[] args) throws java.io.IOException {
        char choise, ignore;
        do {
            // Scanner sc = new Scanner(System.in);
            System.out.println("справка:");

            System.out.println("1.if");
            System.out.println("2.switch:");
            System.out.println("3.for");
            System.out.println("4.while");
            System.out.println("5.do-while\n");
            System.out.println("6. break");
            System.out.println("7.Continue");
            System.out.println("выберите");
            choise = (char) System.in.read();
            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');
        }while (choise<'1'|choise>'7');
            switch (choise) {
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
                case '3':
                    System.out.println("цикл for: \n");
                    System.out.println("инициализация;условие; итерация");
                    System.out.println("инструкция;");
                    break;
                case '4':
                    System.out.println(" цикл while\n");
                    System.out.println("while(условие)инструкция;");
                    break;
                case '5':
                    System.out.println("цикл do while:\n");
                    System.out.println("do{ " +
                            "инструкция}while(условие);");
                    break;
                default:
                    System.out.println("Такой цифры нет, сделайте выбор от 1 до 5");


            }
        }
    }