package com.jobs.domain;

public class Senior extends Employee {
	
	public Senior(String name, String address, String phone, int irpf, double salaryPerMonth, IPaymentRate paymentRate)throws Exception{
		super(name, address, phone,irpf, salaryPerMonth, paymentRate);
	}
	
	@Override
	public String toString() {
		double souMesNet=totalPaid-(totalPaid*irpf/100);
		return "Senior   [name: " + name + ", address: "+ address + ", phone: " +phone +
				"\n - salaryPerMonth: " + salaryPerMonth + " irpf=" + irpf +
				"\n - souMesBrut: " + totalPaid +" souMesNet :"+souMesNet+
				"\n - souAnyBrut: "+totalPaid*14+" souAnyNet :"+souMesNet*14+"]\n\n";
	}	
}
