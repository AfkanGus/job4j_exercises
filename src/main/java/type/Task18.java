package type;
/*
18. Сумма баллов под крышкой
Компания по продаже напитков проводит конкурс "Балл под крышкой": на внутренней стороне пробок, которыми закрыты бутылки, выпускаемые компанией, напечатаны призовые баллы. Есть пробки, "равные" 10, 100 и 1000 баллам.

Ниже представлен метод capSum(int tens, int hundreds, int thousands), принимающий 3 параметра, означающие количество крышек каждого типа: tens - количество крышек с 10 баллами, hundreds - со 100, thousands - с 1000.

Задание: написать код, который высчитывает сумму баллов со всех крышек.

Примечание: Подразумевается, что в качестве входящих параметров принимаются целые неотрицательные числа.
 */
public class Task18 {
    public static int capSum(int tens, int hundreds, int thousands) {
        return tens * 10 + hundreds * 100 + thousands * 1000;
    }
}
