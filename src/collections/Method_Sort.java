package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

import org.junit.Test;

public class Method_Sort {
	//对于整数来说，它的类已经实现了Comparable接口
	@Test
	public void IntSort(){
		List<Integer> list = new ArrayList<>();
		Random rd = new Random();
		for(int i=0;i<10;i++){
			list.add(rd.nextInt(20));
		}
		System.out.println("未排序前");
		for(Integer i : list){
			System.out.print(i+"\t");
		}
		System.out.println();
		System.out.println("排序后");
		Collections.sort(list);
		for(Integer i : list){
			System.out.print(i+"\t");
		}
	}
	
	//对于自定义类，我们要自己在实体类实现它的Comparable接口
	@Test
	public void PojoSort(){
		List<User> users = new ArrayList<User>();
		users.add(new User(78, 26));
		users.add(new User(67, 23));
		users.add(new User(34, 56));
		users.add(new User(55, 23));
		Collections.sort(users);
		for(User u : users){
			System.out.println(u);
		}
	}
	
	//也有一种方法，可以不用在实体类中实现接口中的方法，而是直接使用sort(List<T> list, Comparator<? super T> c)
	@Test
	public void InnerClassSort(){
		List<User> users = new ArrayList<User>();
		users.add(new User(100, 23));
		users.add(new User(98, 27));
		users.add(new User(99, 29));
		users.add(new User(98, 29));
		users.add(new User(89, 22));
		Collections.sort(users,new Comparator<User>(){
			//匿名内部类
			@Override
			public int compare(User o1, User o2) {
				int i = o1.getAge() - o2.getAge();
				if(i == 0){
					return o1.getScore() - o2.getScore();
				}
				return i;
			}
		});
		for(User u : users){
			System.out.println(u);
		}
	}
}
