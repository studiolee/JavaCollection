package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 
 * @author leeray
 * 从键盘接收到一个年份，输出当年的世界杯冠军，如果当年没有举办过世界杯，则输出"没有举办世界杯"
 */
public class WorldCup {
	public static void main(String[] args) {
		Map<String,String> WCMap = new HashMap<>();
	    WCMap.put("1930","乌拉圭");
	    WCMap.put("1934", "意大利");
	    WCMap.put("1938","意大利");
	    WCMap.put("1950","乌拉圭");
	    WCMap.put("1954","西德");
	    WCMap.put("1958","巴西");
	    WCMap.put("1962","巴西");
	    WCMap.put("1966","英格兰");
	    WCMap.put("1970","巴西");
	    WCMap.put("1974","西得");
	    WCMap.put("1978","阿根廷");
	    WCMap.put("1982","意大利");
	    WCMap.put("1986","阿根廷");
	    WCMap.put("1990","西德");
	    WCMap.put("1994","巴西");
	    WCMap.put("1998","法国");
	    WCMap.put("2002","巴西");
	    WCMap.put("2006","意大利");
	    WCMap.put("2010","西班牙");
	    WCMap.put("2014","德国");
	    System.out.println("请输入年份！");
	    Scanner sc = new Scanner(System.in);
	    String year =sc.nextLine();
	    if(WCMap.containsKey(year)){
	    	System.out.println(year+"年的世界杯冠军是："+WCMap.get(year));
	    }else{
	    	System.out.println("当年没有举办世界杯！");
	    }
	    System.out.println("请输入夺冠国家队来获得其所有的夺冠年份");
	    String cName = sc.nextLine();
	    if(WCMap.containsValue(cName)){
	    	for(String temp:WCMap.keySet()){
	    		if(cName.equals(WCMap.get(temp))){
	    			System.out.print(temp+"\t");
	    		}
	    	}
	    }else{
	    	System.out.println("该队没有获得过冠军");
	    }
	    sc.close();
	}
}
