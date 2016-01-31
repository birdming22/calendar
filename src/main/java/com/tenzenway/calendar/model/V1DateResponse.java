package com.tenzenway.calendar.model;

public class V1DateResponse
{
	private String year;
	private String month;
	private String day;
	private String hour;
	private String minute;
	private String second;
	
	@Override
	public String toString() {
		return "{" + 
					"\"year\"=" + year + "," +
					"\"month\"=" + month + "," +
					"\"day\"=" + day + "," +
					"\"hour\"=" + hour + "," +
					"\"minute\"=" + minute + "," +
					"\"second\"=" + second +  
				"}";
	}

	public void setYear(String year)
	{
		this.year = year;
	}

	public void setMonth(String month)
	{
		this.month = month;
	}
	
	public void setDay(String day)
	{
		this.day = day;
	}

	public void setHour(String hour)
	{
		this.hour = hour;
	}

	public void setMinute(String minute)
	{
		this.minute = minute;
	}

	public void setSecond(String second)
	{
		this.second = second;
	}
}
