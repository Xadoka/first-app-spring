package springproject.firstapp.db;

import springproject.firstapp.models.Item;

import java.util.ArrayList;
import java.util.List;

public class DBManager {
    public static List<Item> items = new ArrayList<>();

    static {
        items.add(new Item(1L,"GoPro","Iisque malorum mel dolore definitiones simul.",1500));
        items.add(new Item(2L,"Iphone","Detracto tota dicunt nulla libris placerat et.",1200));
        items.add(new Item(3L,"Lenova","Docendi ius tractatos ne appareat tritani tritani interdum quam.",2500));
        items.add(new Item(4L,"LG","Nonumy reprimique maximus senectus altera.",1300));
    }

    public static List<Item> getItems() {
        return items;
    }
}
