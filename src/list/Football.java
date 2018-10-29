package list;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
/**
 * 
 * @author leeray
 * 已知有十六支男子足球队参加2008 北京奥运会。写一个程序，把这16 支球队随机分为4 个组。采用List集合和随机数
 */
public class Football {
	public static void main(String[] args) {
		List<String> countries = new ArrayList<>();
		String country=null;
		countries.add("科特迪瓦");
        countries.add("阿根廷");
        countries.add("澳大利亚");
        countries.add("塞尔维亚");
        countries.add("荷兰");
        countries.add("尼日利亚");
        countries.add("日本");
        countries.add("美国");
        countries.add("中国");
        countries.add("新西兰");
        countries.add("巴西");
        countries.add("比利时");
        countries.add("韩国");
        countries.add("喀麦隆");
        countries.add("洪都拉斯");
        countries.add("意大利");
        /**
         * 16个球队分为四个小组，显然要用两个循环分组
         */
        /*
         * 外部循环分4个组
         */
        Random rd = new Random();
        for(int i=1;i<=4;i++){
        	System.out.println("第"+i+"小组的分组情况");
        	for(int j=1;j<=4;j++){
        		/*
        		 * 内部循环要从countries中随机取出元素
        		 */
        		//nextInt(int i)取从0到i之间的所有整数包括0,不包括i
        		country = countries.get(rd.nextInt(countries.size()));
        		System.out.print(country+"\t");
        		countries.remove(country);
        	}
        	System.out.println();
        }
	}
}
