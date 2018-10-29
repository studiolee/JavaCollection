package map;

import java.util.HashMap;
import java.util.*;

/*
 * 使用Scanner从控制台读取一个字符串，统计字符串中每个字符出现的次数
 */
public class StrAnalysis {
	public static void main(String[] args) {
		//要统计每个字符的出现次数，可以使用Map<Character,Integer>来存储
		String str = "aaaabdfcvbdgetblmbacopkdmfdg";
	    System.out.println("原字符串："+str);
	    
	    Map<Character,Integer> map = new HashMap<>();
	    char[] cs = str.toCharArray();
	    
	    for(char c : cs){
	    	if(map.containsKey(c)){
	    		int num = map.get(c);
	    		num++;
	    		map.put(c, num);//更新与键c对应的值
	    	}else{
	    		map.put(c,1);
	    	}
	    }
	    
	    for(Map.Entry<Character, Integer> m : map.entrySet()){
	    	System.out.print(m.getKey()+"出现的次数是:");
	    	System.out.println(m.getValue());
	    }
	}
}
