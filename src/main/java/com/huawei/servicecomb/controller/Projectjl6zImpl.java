package com.huawei.servicecomb.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2019-12-06T17:23:14.887Z")

@RestSchema(schemaId = "projectjl6z")
@RequestMapping(path = "/rest", produces = MediaType.APPLICATION_JSON)
public class Projectjl6zImpl {

    @Autowired
    private Projectjl6zDelegate userProjectjl6zDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userProjectjl6zDelegate.helloworld(name);
    }

}
