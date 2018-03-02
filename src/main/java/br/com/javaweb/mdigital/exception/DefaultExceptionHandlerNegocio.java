package br.com.javaweb.mdigital.exception;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class DefaultExceptionHandlerNegocio implements ExceptionMapper<NegocioException> {
	
	@Override
	public Response toResponse(NegocioException e){
		ResponseError response = new ResponseError();
		response.setStatus("ERROR");
		response.setMessage(e.getMessage());
		return Response.status(Status.BAD_REQUEST).entity(response).type(MediaType.APPLICATION_JSON).build();
	}
}
