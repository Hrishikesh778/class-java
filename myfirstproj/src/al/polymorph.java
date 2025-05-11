package al;

public class polymorph extends Bike {
	int speedlimit = 150;

	void run() {
		System.out.println("running safely with 60km");
		super.run();
	}

	public static void main(String args[]) {
		Bike b = new polymorph();// upcasting
		b.run();
		System.out.println(b.speedlimit);
	}

}
