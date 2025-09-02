
public class Product {
	String Name;
	int price;
	double GST;
	double discount;
	float quantity;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product P1=new Product();
		P1.Name="rice";
		P1.price=150;
		P1.GST=34.90;
		P1.discount=20.00;
		P1.quantity=1;
		System.out.println("Name:"+P1.Name);
		System.out.println("Gst:"+P1.GST);
		System.out.println("discount:"+P1.discount);
		System.out.println("quantity:"+P1.quantity);
		
		Product P2=new Product();
		P2.Name="dall";
		P2.price=100;
		P2.GST=56.90;
		P2.discount=10.00;
		P2.quantity=2.5f;
		System.out.println("Name:"+P2.Name);
		System.out.println("Gst:"+P2.GST);
		System.out.println("discount:"+P2.discount);
		System.out.println("quantity:"+P2.quantity);
		
		Product P3=new Product();
		P3.Name="midha";
		P3.price=120;
		P3.GST=32.90;
		P3.discount=30.00;
		P3.quantity=6.0f;
		System.out.println("Name:"+P3.Name);
		System.out.println("Gst:"+P3.GST);
		System.out.println("discount:"+P3.discount);
		System.out.println("quantity:"+P3.quantity);
		

	}

}
