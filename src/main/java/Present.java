import java.util.*;

/**
 * Задание № 4.2
 * 2. Формируется новогодний подарок. Он может включать в себя разные сладости (Candy, Jellybean, etc.)
 * У каждой сладости есть название, вес, цена и свой уникальный параметр. Необходимо собрать подарок из сладостей.
 * Найти общий вес подарка, общую стоимость подарка и вывести на консоль информацию о всех сладостях в подарке
 */
public class Present {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.print("Введите количество сладостей в подарке: ");
        int count = cs.nextInt();
        int i = 0;
        ArrayList<Map<String, String>> giftList = new ArrayList<Map<String, String>>();
        while (i < count) {
            Map<String, String> gift = new HashMap<String, String>();
            gift.put("id", Integer.toString(i + 1));
            System.out.println("Введите название: ");
            gift.put("name", cs.next());
            System.out.println("Введите вес в граммах: ");
            gift.put("weight", Integer.toString(cs.nextInt()));
            System.out.println("Введите цену в рублях: ");
            gift.put("price", Integer.toString(cs.nextInt()));
            giftList.add(gift);
            i++;
        }

        Iterator iterator = giftList.listIterator();
        i = 0;
        int giftsPrice = 0;
        int giftsWeight = 0;
        while (iterator.hasNext()) {
            Map<String,String> currentGift = giftList.get(i);
            System.out.println("################################");
            System.out.println("Сладость №: " + currentGift.get("id"));
            System.out.println("Наименование: " + currentGift.get("name"));
            System.out.println("Вес: " + currentGift.get("weight"));
            System.out.println("Стоимость: " + currentGift.get("price"));
            giftsPrice += Integer.parseInt(currentGift.get("price"));
            giftsWeight += Integer.parseInt(currentGift.get("weight"));
            i++;
            iterator.next();
        }
        System.out.println();
        System.out.println("Общая стоимость подарка: " + giftsPrice  + " руб.");
        System.out.println("Общий вес подарка: " + giftsWeight + "грамм");
    }
}

