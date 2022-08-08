
public class PolymorphismDemo {
	public static void main(String[] args) {
		//Test t = new Test();
		//Demo d = new Demo();
		Test t = new Demo(); //자식주소를 부모에게 넘긴다.(부모님이 자식에 있는 자원을 사용하는 것)<<다형성
		
//		if(t instanceof Demo) {
//		//t = d; 자식을 부모로 형변환
//		d = (Demo)t;
//		}else {
//			System.out.println("형변환 불가능");
//		}
	}
}
class Test{}  //부모
class Demo extends Test{} //자식
