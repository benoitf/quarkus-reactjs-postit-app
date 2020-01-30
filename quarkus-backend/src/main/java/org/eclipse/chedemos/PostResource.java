package org.eclipse.chedemos;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.transaction.Transactional;

@Path("/posts")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PostResource {

  public PostResource() {
  }

  @GET
  @Transactional
  public Response list() {
    return Response.ok(Post.listAll()).build();
  }

  @POST
  @Transactional
  public Response add(Post post) {
    post.persist();
    return Response.ok(Post.listAll()).build();
  }

  @DELETE
  @Transactional
  public Response delete(Post post) {
    post.delete();;
    return Response.ok().build();
  }
}
