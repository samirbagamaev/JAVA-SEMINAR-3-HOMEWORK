// Задан целочисленный список ArrayList. Найти минимальное, максимальное 
// и среднее из этого списка.

package WORK;

import java.util.ArrayList;
import java.util.Collections;

/**
 * program3
 */
public class program3 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(55);
        list.add(69);
        list.add(100);
        list.add(555);
        list.add(6969);

        // double avg = 0;

        // for (int i = 0; i < list.s; i++)

        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
        //System.out.println(Collections.avg(list));
    }
}