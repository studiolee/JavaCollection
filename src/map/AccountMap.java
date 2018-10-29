package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/**
 * 要求把List中的内容放到一个Map 中，该Map的键为id，值为相应的Account对象.
 * 最后遍历这个Map，打印所有Account对象的id和余额。
 */
public class AccountMap {
	public static void main(String[] args) {
		List<Account> list = new ArrayList<>();
		list.add(new Account(10.00, "1234")); 
		list.add(new Account(15.00, "5678")); 
		list.add(new Account(0.00, "1010")); 
		
		Map<Long,Account> map = new HashMap<>();
		Iterator<Account> it = list.iterator();
		while(it.hasNext()){
			Account act = it.next();
			map.put(act.getId(), act);
		}
		for(Map.Entry<Long, Account> m:map.entrySet()){
			System.out.print("id:"+m.getKey()+"\t");
			System.out.println("余额："+m.getValue().getBalance());
		}
	}
}
