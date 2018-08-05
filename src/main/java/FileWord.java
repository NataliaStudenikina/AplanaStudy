import java.io.*;
import java.util.*;

/**
 * Задание № 6
 * Необходимо:
 * Прочитать слова из файла.
 * Отсортировать в алфавитном порядке.
 * Посчитать сколько раз каждое слово встречается в файле.Вывести статистику на консоль
 * Найти слово с максимальным количеством повторений. Вывести на консоль это слово и сколько раз оно встречается в файле
 */
public class FileWord {
    public static void main(String[] args) throws Exception {
        File dataFile = new File("fw.txt");
        dataFile.createNewFile();
        FileWriter wFile = new FileWriter(dataFile);
        wFile.write("Слон Кот Собака Попугай Слон \nЗаяц Кот Рыба Кит Слон Кот");
        wFile.close();

        BufferedReader br = new BufferedReader(new FileReader(dataFile));
        List newList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        String line = br.readLine();

        while (line != null) {
            sb.append(line);
            line = br.readLine();
            newList.add(sb);
        }
        br.close();
        String[] splitList = sb.toString().split(" ");;
        Arrays.sort(splitList);
        System.out.println("Отсортированный массив: " + Arrays.toString(splitList));
        Map <String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < splitList.length; i++) {
            int count = Collections.frequency(Arrays.asList(splitList), splitList[i]);
            if (i > 0) {
                if (!(splitList[i]).equals(splitList[i - 1])) {
                    Integer numberAsString = count;
                    map.put(splitList[i], numberAsString);
                    System.out.println(splitList[i] + " Встречается " + numberAsString + " раз");
                }
            }
        }
        Object[] keys = map.keySet().toArray();
        String animalName = keys[0].toString();
        Integer maxCount = map.get(animalName);
        for (int y = 1; y < keys.length; y++){
            String currentAnimalName = keys[y].toString();
            int currentCount = map.get(currentAnimalName);
            if (currentCount > maxCount){
                animalName = currentAnimalName;
                maxCount = currentCount;
            } else if (currentCount == maxCount) {
                animalName = animalName + " и " + currentAnimalName;
            }
        }
        System.out.println("Наиболее часто встречающиеся животное(ые): " + animalName + " количество повторений: " + maxCount);
    }
}


