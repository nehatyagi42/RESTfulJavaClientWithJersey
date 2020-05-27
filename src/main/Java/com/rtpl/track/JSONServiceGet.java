package com.rtpl.track;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.rtpl.rest.Track;

@Path("/track")
public class JSONServiceGet {
	@GET
	@Path("/")
	@Produces(MediaType.APPLICATION_JSON)
	public Track getTrackInJSON() {

		Track track = new Track();
		track.setTitle("Enter Sandman");
		track.setSinger("Metallica");

		return track;

	}

	@POST
	@Path("/")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createTrackInJSON(Track track) {

		String result = "Track saved : " + track;
		return Response.status(201).entity(result).build();
		
	}
	
	@PUT
	@Path("/")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createNewTrackResourceInJSON(Track track) {

		String result = "Track Put data saved : " + track;
		return Response.status(201).entity(result).build();
	}	
}
