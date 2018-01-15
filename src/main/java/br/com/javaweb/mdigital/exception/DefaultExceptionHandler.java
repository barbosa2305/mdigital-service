package br.com.javaweb.mdigital.exception;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class DefaultExceptionHandler implements ExceptionMapper<Throwable> {
	
	@Override
	public Response toResponse(Throwable e){
		ResponseError response = new ResponseError();
		
		if (e instanceof NegocioException) {
			response.setStatus("ERROR");
			response.setMessage(e.getMessage());
			return Response.status(Status.BAD_REQUEST).entity(response).type(MediaType.APPLICATION_JSON).build();
			
		} else {
			response.setStatus("ERROR");
			response.setMessage("Ocorreu um erro interno. Entre em contato com o administrador do sistema.");
			return Response.serverError().entity(response).type(MediaType.APPLICATION_JSON).build();
		}
	}
}
