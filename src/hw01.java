/* Topic: 設計一類別老師並產生五5個物件
 * Date: 2017/03/05
 * Author: 105021002 賴映如
 */

public class hw01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher t1 = new Teacher("Amy","111111");
		Teacher t2 = new Teacher("Vincent","222222");
		Teacher t3 = new Teacher("Catie","333333");
		Teacher t4 = new Teacher("Ben","444444");
		Teacher t5 = new Teacher("Sandy","555555");
		
		t1.setGender('F');
		t2.setGender('M');
		t3.setGender('F');
		t4.setGender('M');
		t5.setGender('F');
		
		System.out.println("Name: "+t1.getName());
		System.out.println("Id: "+t1.getId());
		System.out.println("Gender: "+t1.getGender());
		System.out.println("Name: "+t2.getName());
		System.out.println("Id: "+t2.getId());
		System.out.println("Gender: "+t2.getGender());
		System.out.println("Name: "+t3.getName());
		System.out.println("Id: "+t3.getId());
		System.out.println("Gender: "+t3.getGender());
		System.out.println("Name: "+t4.getName());
		System.out.println("Id: "+t4.getId());
		System.out.println("Gender: "+t4.getGender());
		System.out.println("Name: "+t5.getName());
		System.out.println("Id: "+t5.getId());
		System.out.println("Gender: "+t5.getGender());
	}

}