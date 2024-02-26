package ru.job4j.array;

/**
 * 34. Найти индексы двух элементов массива, сумма которых равна заданному значению
 * Метод sumOfTwo() принимает массив чисел numbers и целевое значение goal.
 * <p>
 * Задание: вернуть новый массив с индексами двух значений входящего массива, сумма которых равна goal. Реализуйте задачу с линейной скоростью - O
 * (n). Лучшим вариантом будет решение в один проход по карте (все варианты описаны ниже).
 * <p>
 * Примечание: найденные индексы должны располагаться в порядке их нахождения в оригинальном массиве. Подразумевается, что в каждом входящем
 * массиве имеется либо только одно решение, либо решение отсутствует.
 * <p>
 * Например: есть массив [1, 2, 3], goal - 4. Вывод: [0, 2]
 * <p>
 * <p>
 * <p>
 * Рассмотрим некоторые возможные решения этого упражнения.
 * <p>
 * 1) Самый первый вариант, который может прийти на ум, это сравнить в цикле каждое значение с каждым на предмет i1 = goal - i2. Данное решение
 * плохое, так как цикл в цикле имеет сложность O(n^2). Это значит, что время выполнения программы будет увеличиваться квадратически при росте
 * входных данных.
 * <p>
 * 2) Следующий вариант решения - это применение хэш-таблиц. Так как нас интересует поиск элементов, то хэш-таблица гарантирует нам скорость поиска
 * O(1) (кроме коллизий - в них скорость O(n)). Алгоритм действий здесь такой: в цикле значения массива записываются в карту как ключи, а индексы
 * этих значений массива записываются в карту как значения ключей. Далее в новом цикле проходим по карте с той же формулой i1 = goal - i2. Поиск
 * значения производится методом containsKey(), после чего индекс получается через get(). При нахождении элемента записываем в результат его индекс
 * (достаем из карты по этому элементу) и текущий индекс цикла. Также в условии на этой стадии необходима проверка, что оба индекса не равны друг
 * другу. Данное решение получилось использует карту и два прохода в циклах. Общая сложность - O(n).
 * <p>
 * 3) И еще один вариант - это объединенный вариант предыдущего решения. В нём мы сначала загружали данные в карту, в следующем проходе делали
 * поиск. Данный вариант решения предусматривает одновременную загрузку данных в карту и проверку на то, что второй элемент (всё по той же формуле
 * i1 = goal - i2) уже присутствует в карте. Текущий индекс в цикле - это текущее значение, по формуле мы ищем второй элемент, при котором оба
 * элемента составят goal. Данное решение по скорости тоже O(n), но фактически работы будет производиться меньше. Решение получается в результате
 * всего одного прохода по карте.
 * <p>
 * В случае, если решения в массиве нет, возвращаем null.
 */
public class Task83 {
    public static int[] sumOfTwo(int[] numbers, int goal) {

    }
}
