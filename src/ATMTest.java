import java.util.*;
public class ATMTest {

	HashMap<Integer, Double> acc; 
	public static void main (String [] monkeyMONKEYmonkey)
	{
		ATMTest t = new ATMTest(); 
		t.openAccount(40); 
		t.depositMoney(40,30.0); 
		System.out.println (t.getA().get(40)); 
		t.withdrawMoney(40,20.0);
		System.out.println (t.getA().get(40)); 
		System.out .println (t.checkBalance(5)); 
		t.closeAccount(40);
		System.out .println (t.checkBalance(40));
		t.withdrawMoney(40,10.0);
		t.closeAccount(40); 
		System.out .println (t.checkBalance(40));
		
	}
	public ATMTest () {
		acc = new HashMap<Integer, Double>(); 
	}
	private HashMap<Integer, Double> getA() {
		return acc; 
	}
	public void openAccount(int accNumber) {
		acc.put(accNumber, 0.0); 
	}
	public void openAccount(int accNumber, double dep) {
		acc.put(accNumber, dep); 
	}
	public void closeAccount(int accNumber) {
		double d = acc.get(accNumber); 
		if (d == 0.0) {
			acc.remove(accNumber); 
		}
	}
	public double checkBalance(int acc1) {
		if (acc.containsKey(acc1)) {
			return acc.get(acc1); 
		}
		else {
			return 0.0; 
		}
	}
	public void depositMoney(int num, double dep) {
		if (acc.containsKey(num)) {
			double temp = acc.get(num); 
			temp += dep; 
			acc.replace(num, temp); 
		}
	}
	public void withdrawMoney(int num, double with) {
		if (acc.containsKey(num)) {
			double temp = acc.get(num); 
			if (with>temp) {
				System.out.println ("YOU'RE BROKE HOMIE"); 
				return; 
			}
			temp -= with; 
			acc.replace(num, temp); 
		}
	}
	
	
}
