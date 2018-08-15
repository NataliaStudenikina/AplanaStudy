import java.util.*;

/**
 * Задание № 3.2
 * Необходимо: Поиск максимального элемента в массиве. Для начала задать массив слов.Размерность массива произвольна,
 * задается в консоли. После чего в консоли вводятся слова в количестве равном заданной длине массива.
 * В полученном массиве необходимо найти самое длинное слово. Результат вывести на консоль
 */
public class ArrayMax {
    /**
     * Метод, реализующий запрос у пользователя размерность листа и запись его элементов
     * Использовала List вместо Array, потому что не нашла ифнормации как передавать элементы с консоли в массив
     */
    public void arrayExample() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Задайте размерность массива:");
        int dimension = sc.nextInt();
        List newList = new ArrayList();
        for (int i=0; i < dimension;) {
            System.out.println("Введите слово №:"+i);
            String phrase1 = sc.next();
            newList.add(phrase1);
            i++;
        }
        System.out.println(MaxArrayItem(newList));
    }

    /**
     * Метод поиска самого длинного элемента в List
     * @param arrayList
     */
    public static String MaxArrayItem(List arrayList){
        String max = "";
        for (int y = 0; y < arrayList.size(); y++){
           if (arrayList.get(y).toString().length() > max.length()) {
               max = arrayList.get(y).toString();
           }
        }

        return max;

    }


}

