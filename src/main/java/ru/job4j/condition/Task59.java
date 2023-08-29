package ru.job4j.condition;

/**
 * 59. Решить линейное уравнение первой степени
 * Ниже представлен метод getLinearEquation(int a, int b), который принимает 2 целых числа - коэффициенты a и b
 * линейного уравнения первой степени - ax + b = 0.
 * <p>
 * Задание: Написать код, который решает это уравнение и выводит в консоль его корень (корни). Если корней нет, то
 * вывести "Нет решения", а если бесконечное множество корней, то "Бесконечное множество".
 * <p>
 * Стандартный вид линейного уравнения - ax + b = 0, где a и b некоторые числа, а х – переменная.
 * <p>
 * Решить уравнение - значит найти все его корни или доказать, что корней нет.
 * <p>
 * Корень уравнения - значение переменной, при котором уравнение превращается в верное равенство.
 * <p>
 * Наличие корней зависит от коэффициентов a и b:
 * <p>
 * - Если a = 0, то уравнение не имеет корней.
 * <p>
 * - Если a = 0 и b = 0, то корней бесконечное множество (корнем является любое число).
 * <p>
 * - Если a ≠ 0, то уравнение имеет единственный корень, который можно высчитать по формуле: -b/a
 * <p>
 * Например, для чисел 2, 6 вывод будет:
 * <p>
 * -3.0
 */
public class Task59 {
    public static void getLinearEquation(int a, int b) {
        //  double x;
        String result = (a == 0 && b == 0) ? "Бесконечное множество" : (a == 0 || b == 0) ? "Нет решения" : String.valueOf((double) -b / a);
        System.out.println(result);
      /*  if (a == 0 && b == 0) {
            System.out.println("Бесконечное множество");
        } else if (a == 0 || b == 0) {
            System.out.println("Нет решения");
        } else {
            x = (double) -b / a;
            System.out.println(x);
        }*/
    }
}
