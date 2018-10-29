package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Reverse {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("Learn");
        System.out.println("未翻转前："+list);
        Collections.reverse(list);
        System.out.println("翻转后："+list);
	}
}
