package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 
 * @author leeray
 * 创建一个List，在List 中增加三个工人，基本信息如下：
     姓名 年龄 工资 
   zhang3 18 3000 
   li4 25 3500 
   wang5 22 3200 
 */
public class WorkerTX {
	public static void main(String[] args) {
		List<Worker> wList = new ArrayList<>();
		wList.add(new Worker(18,"zhang3",3000));
		wList.add(new Worker(25,"li4",3500));
		wList.add(new Worker(22,"wang5",3200));
		/*
		 * 在li4 之前插入一个工人，信息为：姓名：zhao6，年龄：24，工资3300
		 */
		wList.add(1, new Worker(24,"zhao6",3300));
		/*
		 * 删除wang5 的信息 
		 */
		wList.remove(3);
		/*
		 * 利用for 循环遍历，打印List 中所有工人的信息 
		 */
		for(int i=0;i<wList.size();i++){
			System.out.println(wList.get(i));
		}
		/*
		 * 利用迭代遍历，对List中所有的工人调用work 方法。
		 */
		Iterator<Worker> it = wList.iterator();
		while(it.hasNext()){
			Worker wk = it.next();
			wk.work();
		}
	}
}
