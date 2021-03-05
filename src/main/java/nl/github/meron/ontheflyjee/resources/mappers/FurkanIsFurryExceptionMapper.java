package nl.github.meron.ontheflyjee.resources.mappers;

import nl.github.meron.ontheflyjee.services.FurkanIsFurryException;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class FurkanIsFurryExceptionMapper implements ExceptionMapper<FurkanIsFurryException> {

    @Override
    public Response toResponse(FurkanIsFurryException e) {
        return Response.status(418).build();
    }
}
