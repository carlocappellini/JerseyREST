package com.example.jersey;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;



    @Path("/")
    public class HelloWorld {
        @GET
        @Produces(MediaType.TEXT_PLAIN)
        public String getMessage() {
            return "Not Hello world!";
        }
    }

