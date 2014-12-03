package com.lsherrill;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("ultimate")
public class Main {

   @Inject
   AnswerMachine machine;

   @GET
   @Path("answer")
   @Produces("text/plain")
   public Integer getAnswer() {
      return machine.getAnswer();
   }
}
