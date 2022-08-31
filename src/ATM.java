import java.util.*;
import java.math.*; 
import java.text.DecimalFormat;
public class ATM {

	private HashMap<Integer, Double> acc; 
	private static final DecimalFormat df = new DecimalFormat("0.00");
	 
	public static void main (String [] monkeyMONKEYmonkey)
	{
//		ATMTest t = new ATMTest(); 
//		t.openAccount(40); 
//		t.depositMoney(40,30.0); 
//		System.out.println (t.getA().get(40)); 
//		t.withdrawMoney(40,20.0);
//		System.out.println (t.getA().get(40)); 
//		System.out .println (t.checkBalance(5)); 
//		t.closeAccount(40);
//		System.out .println (t.checkBalance(40));
//		t.withdrawMoney(40,10.0);
//		t.closeAccount(40); 
//		System.out .println (t.checkBalance(40));
		
	}
	public ATM () {
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
			double temp = acc.get(acc1); 
			String s = df.format(temp); 
//			System.out.println (s); 
			return Double.parseDouble(s); 
			  
			
		}
		else {
			return 0.0; 
		}
	}
	public void depositMoney(int num, double dep) {
		if (num<=0) {
			return; 
		}
		if (acc.containsKey(num)) {
			double temp = acc.get(num); 
			temp += dep; 
			acc.replace(num, temp); 
		}
	}
	public void withdrawMoney(int num, double with) {
		if (with < 0) {
			return; 
		}
		if (acc.containsKey(num)) {
			double temp = acc.get(num); 
			if (with>temp) {
//				System.out.println ("YOU'RE BROKE HOMIE"); 
				return; 
			}
			temp -= with; 
			acc.replace(num, temp); 
		}
	}
	
	
}
