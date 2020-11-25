package org.acme.validation;

import javax.ws.rs.Path;

@Path(ScienceBookResource.PATH)
public interface ScienceBookResource extends BookResource {

    String PATH = BookResource.PATH + "/science";

}
