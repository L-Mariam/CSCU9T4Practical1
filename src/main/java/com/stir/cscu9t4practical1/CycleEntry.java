package com.stir.cscu9t4practical1;

public class CycleEntry extends Entry {
	private static String terrain;
	private static String tempo;

	public CycleEntry(String n, int d, int m, int y, int h, int min, int s, float dist, String tr, String tem) {
		// TODO Auto-generated constructor stub
		super(n, d, m, y, h, min, s , dist);
		terrain = tr;
		tempo = tem;
		
	}

	public String getTerrain() {
		return terrain;
	}

	public String getTempo() {
		return tempo;
	}
	
    public String getEntry(){
	 String result = getName()+" cycled " + getDistance() + " km in "
             +getHour()+":"+getMin()+":"+ getSec() + " on "
             +getDay()+"/"+getMonth()+"/"+getYear()+" on "+getTerrain()+" at "+getTempo()+" tempo. \n";
    return result;
	}

}
