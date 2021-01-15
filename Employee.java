import java.io.Serializable;
public class Employee implements Serializable,Cloneable {
 private int id;
 private String name;
 private String contact;
 
 public Employee() {
	 
 }
 public Employee(int id,String name,String contact) {
	 super();
	 this.id=id;
	 this.name=name;
	 this.contact=contact;
 }
 public void addEmployee() {
	 
 }
 public void searchEmployee(int id) {
}

}