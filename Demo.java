public class Demo {
	public static void main(String[] args) {
		System.out.println(10);
		System.out.println(10+20);
		System.out.println("value is "+10+20);
		System.out.println(10+20+" value is");
		System.out.println(10+20+" value is "+(10+20));
		
		int i=99;
		double d=125.56;
		System.out.println("i="+i);
		System.out.println("d="+d);
		System.out.println("after primitivt typr conversion");
		d=i;
		System.out.println("i="+i);
		System.out.println("d="+d);
		i=(int)d;
		System.out.println("i="+i);
		System.out.println("d="+d);
		
	}

}
