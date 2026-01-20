import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scannerIn = new Scanner(System.in);
        int loop = 1;
        do
        {
            System.out.print("Введите номер задания (0 - выход): ");
            int choose = scannerIn.nextInt();
            if (choose == 0)
            {
                loop = 0;
            }
            else if (choose == 1)
            {
                //Task 1
                System.out.print("Введите ваше имя: ");
                String name = scannerIn.nextLine();
                System.out.print("Введите ваш возраст: ");
                int age = scannerIn.nextInt();
                System.out.print("Привет," + name + "! Тебе уже " + age + " лет! Это здорово!");
            }
            else if (choose == 2)
            {
                //Task 2
                System.out.print("Введите первое число: ");
                double number1 = scannerIn.nextDouble();
                System.out.print("Введите второе число: ");
                double number2 = scannerIn.nextDouble();
                System.out.print("Введите действие (+, -, *, /): ");
                char move = scannerIn.next().charAt(0);

                double result = 0;
                if (move == '+') {
                    result = number1 + number2;
                }
                else if (move == '-') {
                    result = number1 + number2;
                }
                else if (move == '*') {
                    result = number1 * number2;
                }
                else if (move == '/') {
                    result = number1 / number2;
                }

                if (number2 == 0 & move == '/') {
                    System.out.println("Результат: Деление на ноль невозможно");
                }
                else
                {
                    System.out.println("Результат: " + result);
                }
            }
            else if (choose == 3)
            {
                //Task 3
                System.out.print("Введите текущий час: ");
                int hour = scannerIn.nextInt();
                if (hour > 23)
                {
                    System.out.println("Введено неверное значение");
                }
                else if (hour >= 0 & hour <= 5)
                {
                    System.out.println("Сейчас ночь");
                }
                else if (hour >= 6 & hour <= 11)
                {
                    System.out.println("Сейчас утро");
                }
                else if (hour >= 12 & hour <= 17)
                {
                    System.out.println("Сейчас день");
                }
                else if (hour >= 18)
                {
                    System.out.println("Сейчас вечер");
                }
            }
            else if (choose == 4)
            {
                System.out.print("Введите размер массива: ");
                int size = scannerIn.nextInt();
                int[] arr = new int[size];
                int sum = 0;
                for (int i = 0; i < size; i++)
                {
                    System.out.print("Введите число " + (i + 1) + ": ");
                    int num = scannerIn.nextInt();
                    arr[i] = num;
                    sum += num;
                }
                System.out.println("Сумма: " + sum);
                System.out.println("Среднее арифметическое: " + (sum / size));
            }
            else if (choose == 5)
            {
                int max = 0;
                int min = 0;
                int maxIn = 0;
                int minIn = 0;

                for (int i = 0; i < 10; i++)
                {
                    System.out.print("Введите число " + (i + 1) + ": ");
                    int num = scannerIn.nextInt();
                    if (i == 0)
                    {
                        max = num;
                        min = num;
                    }
                    if (num > max)
                    {
                        max = num;
                        maxIn = i;
                    }
                    if (num < min)
                    {
                        min = num;
                        minIn = i;
                    }
                }
                System.out.println("Максимальное число: " + max + " (введено " + maxIn + "-м по счету)");
                System.out.println("Минимальное число: " + min + " (введено " + minIn + "-м по счету)");
            }
            else if (choose == 6)
            {
                System.out.print("Введите размер массива: ");
                int size = scannerIn.nextInt();
                int[] arr = new int[size];
                for (int i = 0; i < size; i++)
                {
                    System.out.print("Введите число " + (i + 1) + ": ");
                    int num = scannerIn.nextInt();
                    arr[i] = num;
                }
                System.out.print("Массив в обратном порядке: ");
                for (int i = size - 1; i > -1; i--)
                {
                    System.out.print(arr[i] + " ");
                }
                System.out.println(" ");
            }
            else if (choose == 7)
            {
                int[] arr = new int[10];
                int max = 50;
                int min = 0;
                System.out.print("Массив: ");
                for (int i = 0; i < 10; i++)
                {
                    int num = (int) (Math.random() * (max - min + 1)) + min;
                    arr[i] = num;
                    System.out.print(num + " ");
                }
                System.out.println(" ");
                System.out.print("Введите число для поиска: ");
                int seek = scannerIn.nextInt();
                int found = 0;
                for (int i = 0; i < 10; i++)
                {
                    if (arr[i] == seek)
                    {
                        found = 1;
                    }
                }
                if (found == 1)
                {
                    System.out.print("Число " + seek + " найдено на позициях: ");
                    for (int i = 0; i < 10; i++)
                    {
                        if (arr[i] == seek)
                        {
                            System.out.print((i + 1) + " ");
                        }
                    }
                }
                System.out.println(" ");
            }
            else if (choose == 8)
            {
                System.out.print("Введите число: ");
                int N = scannerIn.nextInt();
                int count = 0;
                int countNum = 0;
                System.out.print("Четные числа от 0 до " + N + ": ");
                while (count != N)
                {
                    if (count % 2 == 0)
                    {
                        System.out.print(count + " ");
                        countNum++;
                    }
                    count++;
                }
                System.out.println(" ");
                System.out.println("Количество четных чисел: " + countNum);
                System.out.println("Количество нечетных чисел: " + (N - countNum));
            }
            else if (choose == 9)
            {
                int max = 100;
                int min = 0;
                int num = (int) (Math.random() * (max - min + 1)) + min;
                int trying = 0;
                int tryCount = 0;
                do
                {
                    System.out.print("Введите число: ");
                    trying = scannerIn.nextInt();
                    if (trying < num) {
                        System.out.println("Загаданное число больше");
                        tryCount++;
                    } else if (trying > num) {
                        System.out.println("Загаданное число меньше");
                        tryCount++;
                    } else {
                        System.out.println("Поздравляю! Вы угадали число " + num + " за " + tryCount + " попытки!");
                    }
                } while (trying != num);
            }
            else if (choose == 10)
            {
                Scanner strin = new Scanner(System.in);
                System.out.print("Введите текст: ");
                String text = strin.nextLine();
                int letter = 0;
                int digit = 0;
                int write = 0;
                char helper = '0';
                for (int i = 0; i < text.length(); i++)
                {
                    helper = text.charAt(i);
                    if (Character.isLetter(helper))
                    {
                        letter++;
                    }
                    else if (Character.isDigit(helper))
                    {
                        digit++;
                    }
                    else if (Character.isWhitespace(helper))
                    {
                        write++;
                    }
                }
                System.out.println("Количество букв: " + letter);
                System.out.println("Количество цифр: " + digit);
                System.out.println("Количество пробелов: " + write);
            }
        } while (loop == 1);
    }
    /*
    Cat BR_76 = new Cat("Main-kun", "Fight-helicopter", "BR_76", 3, "green");

        BR_76.sayMeow();






    public static void main(String[] args)
    {
        var v = "String";
        Integer I = 25;
        int j = 25;

        final int fif = 10;

        boolean isAlive = true;
        byte b = -128 + 127;
        short s = -32768 + 32767;
        int ia = -2147483648 + 2147483647;
        long l = -9223372036854775808l + 9223372036854775807l;
        float f1 = 8.5F;
        double d1 = 8.5;

        Scanner scannerIn = new Scanner(System.in);
        System.out.println("Введите ваше имя: ");
        String userName = scannerIn.nextLine();

        int[] arr1;
    }
     */
}
