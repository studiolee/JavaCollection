package list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.UnaryOperator;

/**
 * 
 * @author Administrator
 * List的超类是Collection
 * List是有序的，可以存储相同的元素
 */
public class Test1 {
	public static void main(String[] args) {
		Collection<Flight> flights = new ArrayList<Flight>();
		Flight f1 = new Flight(1, "波音747", "北京", "上海", "2018-10-21");
		Flight f2 = new Flight(2, "空客A380", "武汉", "重庆", "2018-10-30");
		Flight f3 = new Flight(3, "空客A360", "武汉", "长沙", "2018-11-10");
		Flight f4 = new Flight(4, "空客A320", "武汉", "厦门", "2018-10-10");
		/*
		 * void add()方法
		 */
		flights.add(f1);
		flights.add(f2);
		flights.add(f3);
		flights.add(f4);
		/*
		 *  int size()方法，返回List中的元素个数
		 */
		System.out.println("List中的元素个数是"+flights.size());
		/*
		 * isEmpty()判空函数
		 */
		if(!flights.isEmpty()){
			System.out.println("列表flights不为空");
		}
		/*
		 * boolean contains(Object e)方法确定List中是否存在指定元素
		 */
		if(flights.contains(f4)){
			System.out.println("List中包含f4");
		}
		/*
		 * 迭代器用于遍历List中的所有元素
		 * <>中用于指定迭代器的类型，如果不指定，那么在获取迭代器所指的元素时，要进行强制类型转换
		 */
		System.out.println("迭代器");
		Iterator<Flight> it = flights.iterator();
		while(it.hasNext()){
			Flight f = it.next();
			System.out.println(f);
		}
		/*
		 * Object[] toArray​()以正确的顺序（从第一个到最后一个元素）返回一个包含此列表中所有元素的数组
		 */
		System.out.println("toArray");
		for(int i=0;i<flights.size();i++){
			System.out.println(flights.toArray()[i]);
		}
		/*
		 * <T> T[] toArray​(T[] a)返回数组的运行时类型是指定数组的运行时类型
		 */
		System.out.println("<T>toArray");
		Object[] flightObj = flights.toArray(new Object[flights.size()]);
		for(int i=0;i<flights.size();i++){
			System.out.println(flightObj[i]);
		}
		/*
		 * boolean remove​(Object o)删除列表中指定元素的第一次出现
		 */
		System.out.println("remove");
		flights.remove(f4);
		Object[] flightObj1 = flights.toArray(new Object[flights.size()]);
		for(int i=0;i<flights.size();i++){
			System.out.println(flightObj1[i]);
		}
		flights.add(f4);
		/*
		 * boolean containsAll​(Collection<?> c)如果此列表包含指定集合的所有元素，则返回 true 。
		 */
		Collection<Flight> fs = new ArrayList<Flight>();
		fs.add(f3);fs.add(f2);fs.add(f3);
		if(flights.containsAll(fs)){
			System.out.println("flights包含fs");
		}
		/*
		 * addAll(Collection<? extends E> c)
		 */
		System.out.println("addAll()");
		fs.clear();//清空fs列表
		fs.addAll(flights);
		for(int i=0;i<fs.size();i++){
			System.out.println(fs.toArray()[i]);
		} 
		/*
		 * boolean removeAll​(Collection<?> c)从此列表中删除包含在指定集合中的所有元素
		 */
		System.out.println("removeAll");
		fs.clear();
		fs.add(f1);fs.add(f2);fs.add(f1);
		Collection<Flight> fs2 = new ArrayList<Flight>();
		fs2.add(f1);
		fs.removeAll(fs2);
		for(int i=0;i<fs.size();i++){
			System.out.println(fs.toArray()[i]);
		}
		/*
		 * retainAll()与remove恰好相反
		 * 仅保留此列表中包含在指定集合中的元素（可选操作）。 换句话说，从此列表中删除其中不包含在指定集合中的所有元素。
		 */
		System.out.println("retainAll");
		fs.clear();fs2.clear();
		fs.add(f1);fs.add(f2);fs.add(f3);fs.add(f2);
		fs2.add(f2);
		fs.retainAll(fs2);
		for(int i=0;i<fs.size();i++){
			System.out.println(fs.toArray()[i]);
		}
		/*
		 * void replaceAll​(UnaryOperator<E> operator)
		 * 将该列表的每个元素替换为将该运算符应用于该元素的结果。 运营商抛出的错误或运行时异常被转发给呼叫者
		 */
			System.out.println("replaceAll");
			List<Flight> fl = new ArrayList<Flight>();
			fl.add(f1);fl.add(f2);fl.add(f3);fl.add(f4);
			fl.replaceAll(new UnaryOperator<Flight>(){

				@Override
				public Flight apply(Flight t) {
					// TODO Auto-generated method stub
					if(t.getfStartPort()=="武汉"){
						t.setfStartPort("长春");
					}
					return t;
				}
			});
			for(int i=0;i<fl.size();i++){
				System.out.println(fl.toArray()[i]);
			}
		
		/*
		 * sort​(Comparator<? super E> c)
		 * 
		 */
			
		/*
		 * equals()将指定的对象与此列表进行比较以获得相等性
		 */
		System.out.println(fl.equals(fs));
		/*
		 * int hashCode​()返回此列表的哈希码值。 列表的哈希码被定义为以下计算的结果
		 */
		System.out.println("哈希码值："+fs.hashCode());
		/*
		 * get​(int index)返回此列表中指定位置的元素。 
		 */
		System.out.println("get");
		System.out.println(fl.get(0));
		/*
		 * set​(int index,E element)用指定的元素（可选操作）替换此列表中指定位置的元素。
		 */
		System.out.println("set");
		fl.set(0, f3);
		System.out.println(fl.get(0));
		/*
		 * indexOf()与lastIndexOf()
		 */
		fl.add(f4);fl.add(f2);fl.add(f1);
		System.out.println(fl.indexOf(f3));
		System.out.println(fl.lastIndexOf(f3));
		/*
		 * subList​(int fromIndex,int toIndex)
		 */
		it = fl.iterator();
		while(it.hasNext()){
			Flight f = it.next();
			System.out.println(f.getFno());
		}
		System.out.println("取子列表");
		fl=fl.subList(1, 3);
		it = fl.iterator();
		while(it.hasNext()){
			Flight f = it.next();
			System.out.println(f.getFno());
		}
		/*
		 * 
		 */
	}
}
