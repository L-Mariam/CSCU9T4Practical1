package com.stir.cscu9t4practical1;

public class SwimEntry extends Entry {
	private static String venue;

	public SwimEntry(String n, int d, int m, int y, int h, int min, int s, float dist, String vn) {
		super(n, d, m, y, h, min, s , dist);
		venue = vn;	
	}

	public String getVenue() {
		return venue;
	}

	
    public String getEntry(){
	 String result = getName()+" swam " + getDistance() + " km in "
             +getHour()+":"+getMin()+":"+ getSec() + " on "
             +getDay()+"/"+getMonth()+"/"+getYear()+" in the "+getVenue()+".\n";
    return result;
	}

}
