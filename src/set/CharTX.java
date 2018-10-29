package set;

import java.util.HashSet;
import java.util.Set;

/*
 * 获取命令行参数中的字符串列表，输出其中重复的字符、不重复的字符以及消除重复以后的字符列表
 */
public class CharTX {
	public static void main(String[] args) {
		String str = "abcdeafblmbnopawc";
	    System.out.println("原字符串："+str);
	    Set<Character> set1 = new HashSet<Character>();//消除重复后的字符
	    Set<Character> set2 = new HashSet<Character>();//重复的字符
	    Set<Character> set3 = new HashSet<Character>();//不重复的字符
	    //把字符串转为字符数组
	    char[] cs = str.toCharArray();
	    for(char c: cs){
	    	//set的特点是不会存放重复的值，如果add重复的值，那么add方法会返回false
	    	boolean flag = set1.add(c);
	    	if(!flag){
	    		//!flag时，表示没有添加到的重复字符，用set2来存放
	    		set2.add(c);
	    	}
	    }
	    //set3是用来存放不重复的字符的
	    //不重复字符 = 消除重复后的字符 - 重复的字符
	    set3.addAll(set1);
	    set3.removeAll(set2);
	    
	    System.out.println("====消除重复后的字符========");
	    for (char c : set1) {
	        System.out.print(c+" ");
	    }

	    System.out.println("\n====重复的字符========");
	    for (char c : set2) {
	        System.out.print(c+" ");
	    }

	    System.out.println("\n====不重复的字符========");
	    for (char c : set3) {
	        System.out.print(c+" ");
	    }
	}
}
