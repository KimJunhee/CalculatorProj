
public class Calculator {

	//김준희의 계산기-Github
	public Calculator(){}
	public int add(int x,int y){
		return x+y;
	}
	public int sub(int x,int y){
		return x-y;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator cal = new Calculator();
		
		System.out.println(cal.add(1, 2));
		System.out.println(cal.sub(1, 2));
		
		
		
	}

}
