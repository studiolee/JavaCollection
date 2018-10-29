package list;

import java.util.ArrayList;
import java.util.List;

/*
 * private String name;
 * private int age;
 * private double salary;
 */
public class SortEmployee {
	public static void main(String[] args) {
		Employee e1 = new Employee("Tpico",20,3000);
	    Employee e2 = new Employee("Tom",22,3000);
	    Employee e3 = new Employee("Jack",22,3000);
	    Employee e4 = new Employee("Lily",21,3500);
	    Employee e5 = new Employee("Mike",20,2900);
	    Employee e6 = new Employee("Bobo",23,4000);
	    
	    List<Employee> list = new ArrayList<Employee>();
	    list.add(e1);
	    list.add(e2);
	    list.add(e3);
	    list.add(e4);
	    list.add(e5);
	    list.add(e6);
	    System.out.println("未排序之前");
	    for(Employee e : list){
	    	System.out.println(e);
	    }
		/*
		 * 把若干Employee对象放在List中,排序并遍历输出,
		 * 排序规则:salary高的在前面,salary相同时age大的在前面,age也相同时按照name升序排列 
		 * 把若干Employee对象放在Set中并遍历,要求没有重复元素
		 */
	    System.out.println("按照要求排序之后");
	    //冒泡排序，外层控制循环多少趟，内层控制每一趟的循环次数。
	    for(int i=1;i<list.size();i++){
	    	for(int j=0;j<list.size()-i;j++){
	    		Employee emp1 = list.get(j);
	    		Employee emp2 = list.get(j+1);
	    		if(emp1.getSalary() < emp2.getSalary()){
	    			list.set(j, emp2);
	    			list.set(j+1, emp1);
	    		}else if(emp1.getSalary() == emp2.getSalary()){
	    			if(emp1.getAge()<emp2.getAge()){
	    				list.set(j, emp2);
		    			list.set(j+1, emp1);
	    			}else if(emp1.getAge() == emp2.getAge()){
	    				//判断字符串大小的依据是根据它们在字典中的顺序决定的。
	    				if(emp1.getName().compareTo(emp2.getName()) > 0 ){
	                        list.set(j, emp2);
	                        list.set(j+1, emp1);
	                    }
	    			}
	    		}
	    	}
	    }
	    for (Employee e : list) {
	        System.out.println(e);
	    }
	}
}
