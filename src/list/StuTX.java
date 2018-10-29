package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 
 * @author Administrator
 * private String name;  
   private int age;  
   private int score;  
   private String classNum;
 */
public class StuTX {
	public static void main(String[] args) {
		List<Student> stu = new ArrayList<>();
		stu.add(new Student("Tom", 18, 100, "class05"));  
		stu.add(new Student("Jerry", 22, 70, "class04")); 
		stu.add(new Student("Owen", 25, 90, "class05")); 
		stu.add(new Student("Jim", 30, 80, "class05")); 
		stu.add(new Student("Steve", 28, 66, "class06"));
		stu.add(new Student("Kevin", 24, 100, "class04"));
		/**
		 * 1） 计算所有学生的平均年龄
		   2） 计算各个班级的平均分
		 */
		int sum=0;//所有学生的年纪总和
		Iterator<Student> it = stu.iterator();
		while(it.hasNext()){
			Student s =it.next();
			sum+=s.getAge();
		}
		System.out.println("所有学生的平均年龄是:"+sum/stu.size());
		int num1=0,num2=0,num3=0;
		int score1=0,score2=0,score3=0;
		Iterator<Student> it1 = stu.iterator();
		while(it1.hasNext()){
			Student s1 = it1.next();
			if(s1.getClassNum()=="class04"){
				num1++;
				score1+=s1.getScore();
			}else if(s1.getClassNum()=="class05"){
				num2++;
				score2+=s1.getScore();
			}else{
				num3++;
				score3+=s1.getScore();
			}
		}
		System.out.println("class04的平均成绩是："+score1/num1);
		System.out.println("class05的平均成绩是："+score2/num2);
		System.out.println("class06的平均成绩是："+score3/num3);
	}
}
