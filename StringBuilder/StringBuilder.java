import java.util.*;

// Utilize the salary and employee as an example
public class ArrayList_Resizing {
	//Example of List
	//List<String> list = ["A", "B", "C"];
	//Set an ArrayList object
	private static ArrayList arrayList = new ArrayList();
	
    public static void main(String[] args) {
    	//Utilize string into ArrayList
    	System.out.println("Utilize string into ArrayList");
    	ArrayList stringArrayList = new ArrayList();
    	stringArrayList.add("String Example 1");
    	stringArrayList.add("String Example 2");
    	stringArrayList.add("String Example 3");
    	for(int i=0; i<stringArrayList.size(); i++){
            System.out.println(stringArrayList.get(i));
        }
    	
    	
    	//Utilize object into ArrayList
    	System.out.println("\nUtilize object into ArrayList");
    	Insert("Apple",2019,8000000);
    	Insert("Banana",2019,16000000);
    	Insert("Cat",2017,9000000);
        Show(arrayList);
    	
    }
    
    private static void Show(ArrayList arrayList2) {
		// TODO Auto-generated method stub
		for(int i=0; i<arrayList2.size(); i++) {
			Employee emp=(Employee)arrayList.get(i);
			System.out.println(emp.Info());
		}
	}

	public static String Insert(String name, int year, int salary) {
    	if(name instanceof String && Integer.class.isInstance(year) && Integer.class.isInstance(salary)){
    		arrayList.add( new Employee(name,year,salary) );
    		return "Adding data successfully";
    	}
    	else {
    		return "Fail!";
    	}
    }
}

class Employee{
    String name;
    int year;
    int salary;
	
    public Employee(String name, int year, int salary){
        this.name=name;
        this.year=year;
        this.salary=salary;
    }
	
    public String Info(){
        return this.name+","+this.year+","+this.salary;
    }
}