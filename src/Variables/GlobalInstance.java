package Variables;

public class GlobalInstance {
	int num=600; //Non-static or instance variable declaration
	public void test1() {
		System.out.println(num);
	}
	public static void main(String[] args) {
		GlobalInstance i=new GlobalInstance();
		i.test1();
		//System.out.println(i.num);
	}

}
