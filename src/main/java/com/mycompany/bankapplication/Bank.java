/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bankapplication;

import java.util.List;
import java.util.*;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author blras
 */
@Path("/App")
public class Bank {
    
    private ArrayList<Customer> CustomerList= new ArrayList<Customer>();
    private ArrayList<Account> AccountList= new ArrayList<Account>();
    private ArrayList<Transaction> TransactionList= new ArrayList<Transaction>();
    
    
    @Path("/Customer")
        @POST
        @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
        @Produces(MediaType.TEXT_PLAIN)
            public Response createCustomer(@FormParam("name") String name,
                                         @FormParam("address") String address,
                                         @FormParam("eircode") String eircode,
                                         @FormParam("email") String email,
                                         @FormParam("pps") String pps) {
                                        
                                         CustomerList.add(new Customer(name,address,eircode,email,pps));
                                         customers();
                                         String output = "New Account created for user "+" "+name+" and EmailID:"+email;
                                         return Response.status(200).entity(output).build();
                                         

            }
 
    public void customers(){
    int clist= CustomerList.size();
    System.out.println(clist);
    }
    

}
