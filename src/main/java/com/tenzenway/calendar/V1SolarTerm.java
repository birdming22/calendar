package com.tenzenway.calendar;

import com.tenzenway.calendar.model.V1DateResponse;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Calendar;
import com.tenzenway.callib.SolarTerm;
import com.tenzenway.callib.SolarTermResult;

/**
 * 
 * The class <code>V1SolarTerm</code>
 * URL: http://localhost:8080/calendar_war/v1.0/solarterm/1454034946
 *
 * @author <a href="mailto:birdming22@hotmail.com">birdming22</a>
 */
@Path("/v1.0/solarterm/{dateInSeconds}")
public class V1SolarTerm
{
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String response(@PathParam("dateInSeconds") String dateInSeconds)
	{
		return dateInSecondToJson(dateInSeconds);
	}
	
	private String dateInSecondToJson(String dateInSeconds)
	{
		long milis = Long.parseLong(dateInSeconds + "000");

		SolarTerm solarTerm = new SolarTerm();
		SolarTermResult result = solarTerm.getSolarTerm(milis);

		int year = 0;
		int id = 0;
		if (null != result) {
			year = result.getYear();
			id = result.getId();
		}

		return "{" +
				    "\"year\"=" + year + "," +
				    "\"id\"=" + id +
				"}";
	}
}
