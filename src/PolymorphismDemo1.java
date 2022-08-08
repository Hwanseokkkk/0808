
public class PolymorphismDemo1 {
	public static void main(String[] args) {
		//Mammal 부모 = new Mammal(); // 부모가 자기꺼에 접근하는 것.
		//부모.display();
		//Lion 자식 = new Lion();// 자식이 자기꺼에 접근하는 것.
		//자식.display();
		Mammal 부모 = new Lion();
		부모.display();

	}
}
