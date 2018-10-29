package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test1 {
	public static void main(String[] args) {
		Map<Student,String> stuInfo = new HashMap<>();
		Student stu0 = new Student(100,"leeray","男",20);
		Student stu1 = new Student(101,"yuri","女",22);
		Student stu2 = new Student(102,"sun","男",21);
		Student stu3 = new Student(103,"王武","男",23);
		Student stu4 = new Student(104,"张三","男",22);
		Student stu5 = new Student(105,"李四","男",32);
		Student stu6 = new Student(106,"赵四","男",22);
		Student stu7 = new Student(107,"titan","男",1000);
		Student stu8 = new Student(108,"oracle","男",89);
		Student stu9 = new Student(109,"qt","女",26);
		stuInfo.put(stu0, "有效");
		stuInfo.put(stu1, "有效");
		stuInfo.put(stu2, "有效");
		stuInfo.put(stu3, "有效");
		stuInfo.put(stu4, "有效");
		stuInfo.put(stu5, "有效");
		stuInfo.put(stu6, "无效");
		stuInfo.put(stu7, "有效");
		
		/**
		 * 返回Map中键值对的数量
		 */
		System.out.println(stuInfo.size());
		/**
		 * 判空
		 */
		System.out.println(stuInfo.isEmpty());
		/**
		 * get函数，通过key找value
		 */
		System.out.println(stuInfo.get(stu6));
		/**
		 * keySet：以Set的形式返回key的Set
		 */
		 Set<Student> stuKey = stuInfo.keySet();
		 Iterator<Student> it = stuKey.iterator();
		 while(it.hasNext()){
			 Student stu = it.next();
			 System.out.println(stu);
		 }
		 /**
		  * containsKey与containsValue
		  */
		 System.out.println(stuInfo.containsKey(stu4));
		 System.out.println(stuInfo.containsValue("无效"));
		 /**
		  * putAll(),将整个Map放入目标Map中去,HashMap中无法存储重复的键
		  */
		 Map<Student,String> addMap = new HashMap<>();
		 addMap.put(stu8, "有效");
		 addMap.put(stu9,"无效");
		 stuInfo.putAll(addMap);
		 System.out.println(stuInfo.size());
		 /**
		  * public V remove​(Object key)
		  */
		 stuInfo.remove(stu9);
		 System.out.println(stuInfo.size());
		 /**
		  * public void clear​()
		  */
		 addMap.clear();
		 System.out.println(addMap.size());
		 /**
		  * public Collection<V> values​()
		  */
		 System.out.println(stuInfo.values());
		 /**
		  * public Set<Map.Entry<K,V>> entrySet​()
		  * 它不支持add或addAll操作。
		  */
		 for(Map.Entry<Student,String> stu : stuInfo.entrySet()){
			 System.out.println(stu.getKey());
			 System.out.println(stu.getValue());
		 }
		 /*
		  * public V getOrDefault​(Object key, V defaultValue)
		  * 返回指定键映射到的值，如果此映射不包含键的映射，则返回 defaultValue 。
		  */
		/**
		 * public boolean replace​(K key,V oldValue,V newValue)
		 */
		 addMap.put(stu8,"有效");
		 addMap.replace(stu8,"有效","无效");
		 System.out.println(addMap.get(stu8));
		 /**
		  * 
		  */
	}
}
