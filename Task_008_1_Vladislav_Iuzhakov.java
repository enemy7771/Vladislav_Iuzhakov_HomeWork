/**
 * Напишите программу, которая выводит на консоль простые числа в промежутке от [2, 100].
 * Используйте для решения этой задачи оператор "%" (остаток от деления) и циклы.
 */
public class Task_008_1_Vladislav_Iuzhakov {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {//Создаём цикл for для обозначения промежутка проверяемых чисел
            boolean check = true;//Делаем проверку
            for (int j = 2; j < i; j++) {//Создаём цикл for поиска простых чисел
                if (i % j == 0) {//Условие если i поделеное на j равно 0
                    check = false;//значит условие не верно
                    break;//Остановка цикла
                }
            }
            if (check) {
                System.out.println(i);//Если условие верно делаем вывод на экран
            }
        }
    }
}
