public class Main {

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void main (String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1 () {
        System.out.println("Задание 1");
        var salaries = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < salaries.length; i++) {
            sum += salaries[i];
        }
        System.out.print("Сумма трат за месяц составила " + sum + " рублей");
        System.out.println();
    }
    public static void task2 () {
        System.out.println("Задание 2");
        var salaries = generateRandomArray();
        int max = salaries[0];
        int min = salaries[0];
        for (int i = 0; i < salaries.length; i++) {
            if (max < salaries[i]) {
                max = salaries[i];
            } if (min > salaries[i]) {
                min = salaries[i];
            }
        }
        System.out.printf("Минимальная сумма трат за день составила %d рублей. Максимальная сумма трат за день составила %d рублей", min, max);
        System.out.println();
    }
    public static void task3() {
        System.out.println("Задание 3");
        var salaries = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < salaries.length; i++) {
            sum += salaries[i];
        }
        var result = (double)sum/ salaries.length;
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей", result);
        System.out.println();
    }
    public static void task4() {
        System.out.println("Задание 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}