package com.stir.cscu9t4practical1;

public class SprintEntry extends Entry {
	private int repetitions;
	private int recoveryTime;

	public SprintEntry(String n, int d, int m, int y, int h, int min, int s, float dist, int rep, int rt) {
		super(n, d, m, y, h, min, s , dist);
		repetitions = rep;
		recoveryTime = rt;
	}

	public int getRepetitions() {
		return repetitions;
	}
	
	public int getRecovery() {
		return recoveryTime;
	}
	
    public String getEntry(){
	 String result = getName()+" sprinted " + getRepetitions()+ " set of " + getDistance() + " km with "+getRecovery()+ " minutes of recovery time in "
             +getHour()+":"+getMin()+":"+ getSec() + " on "
             +getDay()+"/"+getMonth()+"/"+getYear()+".\n";
    return result;
	}

}
