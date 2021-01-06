package testeight;
import java.util.ArrayList;
import java.util.Scanner;
public class collect{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		Book b1 = new Book(0001,"haha",114.0,"哈哈");
		Book b2 = new Book(0002,"heihei",514.0,"嘿嘿");
		Book b3 = new Book(0003,"hengheng",1919.0,"哼哼");
		
		HashMap<Integer,Book> bookHashMap = new HashMap<>();
		bookHashMap.put(b1.getNumber(),b1);
		bookHashMap.put(b2.getNumber(),b2);
		bookHashMap.put(b3.getNumber(),b3);
	
		List<HashMap<Integer,Book>> booksList = new ArrayList<>();
		booksList.add(bookHashMap);
		System.out.println("编号\t名称\t单价\t出版社");
		
		for(HashMap<Integer,Book> i : booksList) {
			Set<Integer> key = i.keySet(); 
			for(Integer j : key) {
				System.out.println(i + "\t" + i.get(j).getName() + "\t" + i.get(j).getPrice() + "\t" + i.get(j).getPress());
			}
		}
	}
}
	
class Book {
	private int number;
	private String name;
	private double price;
	private String press;

	public Book(){
	}	
	
	Book(int number,String name,double price,String press){
		this.number = number;
		this.name = name;
		this.price = price;
		this.press = press;	
	}
	
	int getNumber(){
		return number;
	}
	
	String getName(){
		return name;
	}
	
	double getPrice(){
		return price;
	}
	
	String getPress(){
		return press;
	}
}


package testeight;
import java.util.ArrayList;
import java.util.Scanner;
class Student implements Comparable<Student>{
    private Integer num;
    private String name;
    private Integer age;
    public Student(int parseInt, String string, int parseInt2){
    }
    
    public int compareTo(Student stu){
        return this.age - stu.age;
    }
    
    public String toString(){
        return "Student [age=" + age + ", name=" + name+ ", num=" + num + "]";
    }
}

public class text2 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
        Set<Student> stuSet = saveStudentInfo();
        Iterator<Student> it = stuSet.iterator();
        while (it.hasNext())
        {
            String info = it.next().toString();
            System.out.println(info);
        }
    }
    
	private static Set<Student> saveStudentInfo(){
        Scanner input = new Scanner(System.in);
        Set<Student> stuSet = new TreeSet<Student>();
        while (true){
            System.out.println("请输入学生信息:(学号#姓名#年龄)");
            String inputData = input.nextLine();
            if ("exit".equals(inputData)){
                break;
            }
            String[] info = inputData.split("#");
            Student stu= new Student(Integer.parseInt(info[0]), info[1], Integer.parseInt(info[2]));
            stuSet.add(stu);
        }
        
        return stuSet;
	}
}
