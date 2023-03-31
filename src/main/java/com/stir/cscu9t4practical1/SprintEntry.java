package com.stir.cscu9t4practical1;

public class SprintEntry extends Entry {
	private int set;
	private int recoveryTime;

	public SprintEntry(String n, int d, int m, int y, int h, int min, int s, float dist, int st, int rt) {
		super(n, d, m, y, h, min, s , dist);
		set = st;
		recoveryTime = rt;
	}

	public int getSet() {
		return set;
	}
	
	public int getRecoveryTime() {
		return recoveryTime;
	}
	
    public String getEntry(){
	 String result = getName()+" sprinted " + getSet()+ " set of " + getDistance() + " km with "+getRecoveryTime()+ " minutes of recovery time in "
             +getHour()+":"+getMin()+":"+ getSec() + " on "
             +getDay()+"/"+getMonth()+"/"+getYear()+".\n";
    return result;
	}

}
