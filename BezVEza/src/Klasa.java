import java.util.ArrayList;


public class Klasa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parent p =new Child();
		
		if(p instanceof Child){
			System.out.println("DA");
		}
		if(p instanceof Parent){
			System.out.println("DA");
		}
		
	}
	
}
abstract class Parent{
	
}

 class Child extends Parent{
	
	public Child(){
		
	}
}