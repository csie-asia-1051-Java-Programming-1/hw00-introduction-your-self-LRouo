/* Topic: 配合hw01
 * Date: 2017/03/05
 * Author: 105021002 賴映如
 */

public class Teacher {
	private String name,id;
	private char gender;
	
	public Teacher(String name1,String id1){
		name = name1;
		id = id1;
	}
	public void setName(String name1){
		name = name1;
	}
	public String getName(){
		return name;
	}
	public void setId(String id1){
		id = id1;
	}
	public String getId(){
		return id;
	}
	public void setGender(char gender1){
		gender = gender1;
	}
	public char getGender(){
		return gender;
	}
}