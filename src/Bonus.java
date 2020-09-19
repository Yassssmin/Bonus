import java.util.Scanner;

public class Bonus {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            float balance = 100;
            int bonus = 0;
            float amount;

            do {
                System.out.println("Введите сумму пополнения");

                amount = scanner.nextFloat();
            } while (amount < 0);

            System.out.printf("Вы пополнили вас счет на: %.2f\n", amount);

            balance = balance + amount;

            System.out.printf("На вашем счету: %.2f\n", balance + bonus);

            if (amount > 1000) {
                bonus = (int)Math.floor(amount / 100);
            }

            System.out.printf("Начислено бонусов: %d\n", bonus);

            System.out.printf("Ваш итоговый баланс: %.2f\n", balance + bonus);
        }
    }


