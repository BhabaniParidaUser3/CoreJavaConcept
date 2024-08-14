package Interface;

public class AustralianTraffic implements CentralTraffic, ContinentalTraffic {

	public static void main(String[] args) {

		CentralTraffic CT = new AustralianTraffic();
		CT.goGreen();
		CT.stopRed();
		CT.waitYellow();

		AustralianTraffic AT = new AustralianTraffic();
		AT.pedestarinCrossing();
		AT.oneWay();

	}

	@Override
	public void goGreen() {
		System.out.println("It means safe to proceed  ");
	}

	@Override
	public void stopRed() {
		System.out.println("It means danger and stop");

	}

	@Override
	public void waitYellow() {
		System.out.println("It means caution and yield");

	}

	public void pedestarinCrossing() {
		System.out.println("pass by walk");
	}

	@Override
	public void oneWay() {
		System.out.println("Veichle prohibated in one way Direction");
	}

}
