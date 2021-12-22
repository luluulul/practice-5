package ru.mirea.prac5;

import java.util.Scanner;

public class ExamplePracFive {
    public static String task1(int n) {
        int sum = 0;
        int j = 0;
        // Базовый случай
        if (n == 1) {
            System.out.print("1");
        } else {
            for (int i = 1; sum < n; i++) {
                sum += i;
                j = i;
            }
            // Шаг рекурсии / рекурсивное условие
            System.out.print(task1(--n) + " " + j);
        }
        return "";
    }
    public static String task2(int n){
        // Базовый случай
        if (n == 1) {
            return "1";
        }
        // Шаг рекурсии / рекурсивное условие
        return task2(n - 1) + " " + n;
    }
    public static String task3(int a, int b) {
        // основное условие задачи
        if (a > b) {
            // Базовый случай
            if (a == b) {
                return Integer.toString(a);
            }
            // Шаг рекурсии / рекурсивное условие
            return a + " " + task3(a - 1, b);
        } else {
            // Базовый случай
            if (a == b) {
                return Integer.toString(a);
            }
            // Шаг рекурсии / рекурсивное условие
            return a + " " + task3(a + 1, b);
        }
    }
    public static int task4(int len, int sum, int k, int s) {
        // Базовый случай
        if (len == k) {
            if (sum == s) {
                return 1;
            } else {
                return 0;
            }
        }
        int c = (len == 0 ? 1 : 0);
        int res = 0;
        // Шаг рекурсии / рекурсивное условие
        for (int i = c; i < 10; i++) {
            res += task4(len + 1, sum + i, k, s);
        }
        return res;
    }
    public static int task5(int n) {
        // Базовый случай
        if (n < 10) {
            return n;
        }// Шаг рекурсии / рекурсивное условие
        else {
            return n % 10 + task5(n / 10);
        }
    }
    public static boolean task6(int n, int i) {
        // i- дополнительный параметр. При вызове должен быть равен 2
        // Базовый случай
        if (n < 2) {
            return false;
        } // Базовый случай
        else if (n == 2) {
            return true;
        } // Базовый случай
        else if (n % i == 0) {
            return false;
        } // Шаг рекурсии / рекурсивное условие
        else if (i < n / 2) {
            return task6(n, i + 1);
        } else {
            return true;
        }
    }
    public static void task7(int n, int k) {
        // k- дополнительный параметр. При вызове должен быть равен 2
        // Базовый случай
        if (k > n / 2) {
            System.out.println(n);
            return;
        }
        // Шаг рекурсии / рекурсивное условие
        if (n % k == 0) {
            System.out.println(k);
            task7(n / k, k);
        } // Шаг рекурсии / рекурсивное условие
        else {
            task7(n, ++k);
        }
    }
    public static String task8(String s) {
        // Базовый случай
        if (s.length() == 1) {
            return "YES";
        } else {
            if (s.substring(0, 1).equals(s.substring(s.length() - 1, s.length()))) {
                // Базовый случай
                if (s.length() == 2) {
                    return "YES";
                }
                // Шаг рекурсии / рекурсивное условие
                return task8(s.substring(1, s.length() - 1));
            } else {
                return "NO";
            }
        }
    }
    public static int task9(int a, int b) {
        // Базовый случай
        if (a > b + 1) {
            return 0;
        }
        // Базовый случай
        if (a == 0 || b == 0) {
            return 1;
        }
        // Шаг рекурсии / рекурсивное условие
        return task9(a, b - 1) + task9(a - 1, b - 1);
    }
    public static int task10(int n, int i) {
        return (n==0) ? i : task10( n/10, i*10 + n%10 );
    }
    public static int task11(int k) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        // Базовый случай 

        if (n == 1) {
           return task11(k+1);
        } else if(n==0){
            n = in.nextInt();
            return k;
        }
            else{
                return task11(k);
        }
    }
    public static void task12() {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();
        // Базовый случай
        if (n > 0) {
            // Шаг рекурсии / рекурсивное условие
            if (n % 2 == 1) {
                System.out.println(n);
            }
            task12();
        }
    }
    public static void task13() {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();
        // Базовый случай
        if (n > 0) {
            int m = in.nextInt();
            System.out.println(n);
            // Базовый случай
            if (m > 0) {
                // Шаг рекурсии / рекурсивное условие
                task13();
            }
        }
    }
    public static String task14(int n) {
        // Базовый случай
        if (n < 10) {
            return Integer.toString(n);
        } // Шаг рекурсии / рекурсивное условие
        else {
            return task14(n / 10) + " " + n % 10;
        }
    }
    public static int task15(int n) {
        // Базовый случай
        if (n < 10) {
            return n;
        }// Шаг рекурсии / рекурсивное условие
        else {
            System.out.print(n % 10 + " ");
            return task15(n / 10);
        }
    }
    public static void task16(int max, int count) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();
        // Базовый случай
        if (n > 0) {
            // Шаг рекурсии / рекурсивное условие
            if (n > max) {
                task16(n, 1);
            } // Шаг рекурсии / рекурсивное условие
            else if (n == max) {
                task16(max, ++count);
            } // Шаг рекурсии / рекурсивное условие
            else {
                task16(max, count);
            }
        } else {
            System.out.println(count);
        }
    }
    public static int task17() {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();
        // Базовый случай
        if (n == 0) {
            return 0;
        } // Шаг рекурсии / рекурсивное условие
        else {
            return Math.max(n, task17());
        }
    }
    public static void main(String[] args) {
        System.out.println("task 1\nТреугольная последовательность");
        task1(5);
        System.out.println("\ntask 2\nОт 1 до n");
        System.out.println(task2(10));
        System.out.println("task 3\nОт A до B");
        System.out.println(task3(20, 15));
        System.out.println("task 4\nЗаданная сумма цифр");
        System.out.println(task4(0, 0, 3, 15));
        System.out.println("task 5\nСумма цифр числа");
        System.out.println(task5(123));
        System.out.println("task 6\nПроверка числа на простоту");
        System.out.println(task6(18, 2));
        System.out.println("task 7\nРазложение на множители");
        task7(150, 2);
        System.out.println("task 8\nПалиндром");
        System.out.println(task8("radar"));
        System.out.println("task 9\nБез двух нулей");
        System.out.println(task9(5, 8));
        System.out.println("task 10\nРазворот числа");
        System.out.println(task10(158, 0));
        System.out.println("task 11\n Количество единиц");
        System.out.println(task11(0));
        System.out.println("task 12\nВывести нечетные числа последовательности");
        task12();
        System.out.println("task 13\nВывести члены последовательности с нечетными номерами");
        task13();
        System.out.println("task 14\nЦифры числа слева направо");
        System.out.println(task14(153));
        System.out.println("task 15\nЦифры числа справа налево");
        System.out.println(task15(123));
        System.out.println("task 16\n Количество элементов, равных максимуму");
        task16(0, 0);
        System.out.println("task 17\nМаксимум последовательности");
        System.out.println(task17());
    }
}
