/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bankapplication;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.FormParam;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import java.util.*;
/**
 *
 * @author blras
 */
@Path("/hello")
public class Tester {
@POST
    @Path("test")
    public void testArray(@FormParam("array") List<String> array) {
        /* do something with the input array */
        for (String s : array) {
            System.out.println(s);
        }
    }
    @POST
@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
@Produces(MediaType.TEXT_PLAIN)
public Response createCustomer(@FormParam("name") String name,
                             @FormParam("address") String address,
                             @FormParam("phone-number") String phoneNumber) {
                             String output = " "+" "+name+" "+address+" "+phoneNumber;
        return Response.status(200).entity(output).build();
    }
} 

