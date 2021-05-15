interface Cash {

}

interface Cheque {

}

class PaymentMethod implements Cash, Cheque {
	static void paymentByCash() {
		System.out.println("Payment is done through Cash");
	}

	static void paymentByChecque() {
		System.out.println("Payment is done through Cheque");
	}
}

public class MarkerInterface {

	public static void main(String[] args) {
		//PaymentMethod p = new PaymentMethod();
		PaymentMethod.paymentByCash();
		PaymentMethod.paymentByChecque();

	}

}
