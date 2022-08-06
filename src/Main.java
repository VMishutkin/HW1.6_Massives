import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
      /*  Привет, ребята! :4039-wumpus-congrats:
Ловите дополнительное задание по МАССИВАМ
:death_star: Задание 5
Создайте матрицу 3х3 (двумерный массив типа int). Заполните единицами обе диагонали матрицы и напечатайте ее в консоль. Постарайтесь заполнить обе диагонали в одном цикле.
Для печати следует использовать следующий код:
for (int[] row : matrix) {
	for (int column : row) {
		System.out.print(column + " ");
	}
	System.out.println();
}
Критерии оценки:
– В консоль выводится матрица 3х3 со значениями единицы по диагонали.
– При изменении единицы на другое значение матрица выводится в консоль корректно.
– Для вывода результата в консоль используется один цикл.
:death_star: Задание 6
У нас есть массив, в котором содержатся целочисленные значения от 1 до 5.
Наш коллега что-то напутал, в итоге массив читается не с начала, а с конца.
Нам нужно исправить ошибку и переработать код так, чтобы массив читался в правильном порядке.
Нам дан массив чисел: {5, 4, 3, 2, 1}
Необходимо привести его к виду: {1, 2, 3, 4, 5}
Решите задачу с использованием дополнительного массива.
Напечатайте массив до преобразования и после с помощью
System.out.println(Arrays.toString(arr));
Критерии оценки:
– В консоль выведен результат программы до преобразований массива.
– В консоль выведен результат программы после преобразований массива.
– Программа выводит корректный результат при смене значений внутри массива.
:death_star: Задание 7
Решите предыдущее задание, но без использования дополнительного массива.
Необходимо добиться того, чтобы исходный массив полностью соответствовал второму массиву из прошлого задания.
Выведите результат программы в консоль тем же способом.
Уточнения:
Это задание не на сортировку.
Не использовать Arrays.sort() и другие способы сортировок.
Числа в порядке убывания даны исключительно для указания направления чтения.
Массив может быть 5 8 2 3 9, нужно из него сделать 9 3 2 8 5.
Критерии оценки:
– Задание решено без применения дополнительного массива.
– В консоль выведен результат программы до преобразований массива.
– В консоль выведен результат программы после преобразований массива.
– Программа выводит корректный результат при смене значений внутри массива.
:death_star:  Задание 8  Очень сложно.
Задача, которая используется/бывает/встречается на собеседованиях.
Дан массив чисел {−6, 2, 5, −8, 8, 10, 4, −7, 12, 1}
Необходимо найти два числа, сумма которых равна −2.
Напечатать эти числа в консоль.
Подсказка
Может потребоваться отсортировать массив с помощью Arrays.sort(arr).
Критерии оценки
– Найдены два числа, удовлетворяющие условию задачи.
– При изменении значений массива в консоль выводится корректный результат.
– В консоль выведен результат решения задания.
:death_star:  Задание 9  Очень сложно.
Усложняем предыдущую задачу. Найдите все пары чисел, сумма которых равна −2. Напечатайте их в консоль.
Критерии оценки
– Найдены все пары чисел, удовлетворяющие условию задачи.
– При изменении значений массива в консоль выводится корректный результат.
– В консоль выведен результат решения задания.*/
        //Задание 5
        int[][] matrix = new int[3][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j || i + j == matrix.length - 1) {
                    matrix[i][j] = 1;
                }
            }
        }
        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
        //Задача 6
        int[] unsortedArr = {5, 4, 3, 2, 1};
        int[] sortedArr = new int[unsortedArr.length];
        for (int i = 0; i < unsortedArr.length; i++) {
            sortedArr[i] = unsortedArr[unsortedArr.length - 1 - i];
        }
        System.out.println(Arrays.toString(sortedArr));
        //Задача 7
        for (int i = 0; i < unsortedArr.length / 2; i++) {
            int temp = unsortedArr[i];
            unsortedArr[i] = unsortedArr[unsortedArr.length - 1 - i];
            unsortedArr[unsortedArr.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(unsortedArr));
        //Задача 9

        int[] arr = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == -2) {
                    System.out.println("Сумма " + arr[i] + " и " + arr[j] + " = -2");
                }else if(arr[i]+arr[j]>-2){
                    break;
                }
            }
        }


    }
}