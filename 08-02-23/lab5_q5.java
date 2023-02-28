
//Unguided pg no.5.30
import java.io.*;

class ToyCollection {
	public static double totalAmount;
	public double indAmount;
	public String ToyId;
	public String ToyName;
	public double Price;
	public int Qty;

	InputStreamReader is = new InputStreamReader(System.in);
	BufferedReader bf = new BufferedReader(is);

	public void acceptData() throws IOException {
		System.out.println("Enter Id of the Toy");
		ToyId = bf.readLine();
		System.out.println("Enter Name of the Toy");
		ToyName = bf.readLine();
		System.out.println("Enter Price of the Toy");
		Price = Double.valueOf(bf.readLine()).doubleValue();
		System.out.println("Enter Quantity of the Toy");
		Qty = Integer.parseInt(bf.readLine());

		indAmount = Price * Qty;// correct
		totalAmount = totalAmount + indAmount;// correct
	}

	public void displayData() {
		System.out.println("Toy Id is :-" + ToyId);
		System.out.println("Toy Name is :-" + ToyName);
		System.out.println("Toy Price is :-" + Price);
		System.out.println("Toy Qty is :-" + Qty);
		System.out.println("Total Amount for this Toy is :-" + indAmount);// correct
	}

	public void displayTotalAmount() {
		System.out.println("Total Amount for all the Toys are " + totalAmount);// Grand total
	}
}

// 2nd class
public class lab5_q5 {
	ToyCollection Obj[];// array object of the first class

	public lab5_q5() throws IOException {
		int nos;
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader bf = new BufferedReader(is);

		System.out.println("How Many Toy Details you want to accept");
		nos = Integer.parseInt(bf.readLine());

		Obj = new ToyCollection[nos];// dynamic object creation during run time

		for (int i = 0; i < nos; i++) {
			Obj[i] = new ToyCollection();// we have to allocate the indivisual memeory
			Obj[i].acceptData();
		}
		for (int i = 0; i < nos; i++) {
			Obj[i].displayData();
		}
		Obj[0].displayTotalAmount();
	}

	public static void main(String args[]) throws IOException {
		new lab5_q5();
	}
}