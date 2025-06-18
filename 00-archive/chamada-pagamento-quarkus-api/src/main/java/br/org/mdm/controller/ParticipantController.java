package br.org.mdm.controller;

import br.org.mdm.record.Participant;
import br.org.mdm.service.ParticipantService;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.util.List;

@Path("/participants")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ParticipantController {

  @Inject private ParticipantService participantService;

  @GET
  public List<Participant> getParticipants() {
    return participantService.listParticipants();
  }

  @POST
  @Transactional
  public Response createParticipant(Participant participant) {
    return Response.ok(participantService.createParticipant(participant)).build();
  }

  @PUT
  @Transactional
  public Response updateParticipant(Participant participant) {
    return Response.ok(participantService.updateParticipant(participant)).build();
  }

  @DELETE
	@Path("/{id}")
  @Transactional
  public Response deleteParticipant(@PathParam("id") Long id) {
    participantService.deleteParticipant(id);
    return Response.ok().build();
  }
}
