import java.util.ArrayList;

/**
 * Created by abegansky on 04.10.16.
 */
public class Main {
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> list = new ArrayList<String>();
        list.add("name1");
        list.add("name2");
        list.add("name3");
        list.add("name4");
        list.add("name5");
        System.out.println(list.size());
        for (String a : list){
            System.out.println(a);
        }

    }
}
