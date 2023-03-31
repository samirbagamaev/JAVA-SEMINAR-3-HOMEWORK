//Пусть дан произвольный список целых чисел, удалить из него чётные числа

package WORK;

import java.util.ArrayList;
import java.util.List;

public class program2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(-3);
        list.add(-2);
        list.add(-1);
        list.add(-0);
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);

        for (int i = 0; i < list.size();) // убрали увеличение i внутрь цикла
        {
            if (list.get(i) % 2 == 0)
                list.remove(i);
            else
                i++;
        }
        System.out.println(list);
    }
}


//------------------------------------------------------------------------------------

/* 
ОТВЕТ:
[-3, -2, -1, 0, 1, 2, 3]
[-3, -1, 1, 3]
*/