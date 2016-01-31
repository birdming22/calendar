package com.tenzenway.calendar.rest;

import java.util.Calendar;
import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.tenzenway.calendar.rest.model.V1DateResponse;

/**
 * 
 * The class <code>V1Date</code> 
 * URL: http://localhost:8080/calendar_war/rest/v1.0/date/1454034946
 *
 * @author <a href="mailto:tangblack@gmail.com">tangblack</a>
 */
//Sets the path to base URL + /hello
@Path("/v1.0/date/{dateInSeconds}")
public class V1Date
{
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String response(@PathParam("dateInSeconds") String dateInSeconds) 
	{
		V1DateResponse v1DateResponse = dateInSecondToJson(dateInSeconds);
		
		return v1DateResponse.toString();
	}
	
	private V1DateResponse dateInSecondToJson(String dateInSeconds)
	{
		long milis = Long.parseLong(dateInSeconds + "000");
		Date date = new Date(milis);
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		
		V1DateResponse v1DateResponse = new V1DateResponse();
		v1DateResponse.setYear("" + calendar.get(Calendar.YEAR));
		v1DateResponse.setMonth("" + (1 + calendar.get(Calendar.MONTH))); // Start from 0!
		v1DateResponse.setDay("" + calendar.get(Calendar.DATE));
		v1DateResponse.setHour("" + calendar.get(Calendar.HOUR_OF_DAY));
		v1DateResponse.setMinute("" + calendar.get(Calendar.MINUTE));
		v1DateResponse.setSecond("" + calendar.get(Calendar.SECOND));
		
		return v1DateResponse;
	}
}
