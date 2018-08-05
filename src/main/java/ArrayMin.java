import java.util.*;

/**
 * Задание 4.1
 * Массив размерностью 20, заполняется случайными целыми числами от -10 до 10.
 * Найти максимальный отрицательный и минимальный положительный элементы массива. Поменять их местами
 */
public class ArrayMin {
    /**
     * Метод для заполнения List произвольными значениями от -10 до 10
     * @param args
     */
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int dimension = 4;
        ArrayList<Integer> inputDataList = new ArrayList();
        for (int i = 0; i < dimension;) {
            System.out.println("Введите элемент массива: ");
            int item = 0;
            try {
                item = sc.nextInt();
                    } catch (InputMismatchException e){
                System.out.println("Неизвестное значение");
                sc.next();
                continue;
            }
            /**
             * Проверка на то, что пользователь вводит число от -10 до 10
             */
            if (item < -10 || item > 10) {
                System.out.println("Некорректный параметр ");
            } else {
                inputDataList.add(item);
                i++;
            }
        }

        int minPositiveValue = findMinPositive(inputDataList);
        System.out.println("Минимальный положительный элемент: " + minPositiveValue);
        int minNegativeValue = findMinNegative(inputDataList);
        System.out.println("Минимальный отрицательный элемент" + minNegativeValue);
        //Замена найденных элементов
        int minPositiveIndex = inputDataList.indexOf(minPositiveValue);
        int minNegativendex = inputDataList.indexOf(minNegativeValue);
        inputDataList.set(minPositiveIndex, minNegativeValue);
        System.out.println(inputDataList);
        inputDataList.set(minNegativendex, minPositiveValue);
        System.out.println("Result: " + inputDataList);

    }

    /**
     * Метод поиск минимального положительного элемента
     * @param arrayList
     * @return
     */
    private static Integer findMinPositive(ArrayList<Integer> arrayList){
        ArrayList <Integer> newListTwo = new ArrayList <Integer > (arrayList);
        Collections.sort(newListTwo);
        for (int y = 0; y < newListTwo.size(); y++){
            if (newListTwo.get(y) > 0){
                return newListTwo.get(y);
            }
        }
        return null;
    }

    /**
     * Метод поиск минимального отрицательного элемента
     * @param arrayList
     * @return
     */
    private static Integer findMinNegative(ArrayList<Integer> arrayList){
        ArrayList <Integer> newListThree = new ArrayList <Integer > (arrayList);
        Collections.sort(newListThree);
        if (newListThree.get(0) < 0){
            return newListThree.get(0);
        }
        return 0;
    }


}
