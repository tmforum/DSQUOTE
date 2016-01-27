package org.tmf.dsmapi;

import org.glassfish.jersey.server.ResourceConfig;
import org.tmf.dsmapi.commons.jaxrs.JacksonFeature;

@javax.ws.rs.ApplicationPath("api")
public class ApplicationConfig extends ResourceConfig {

    public ApplicationConfig(){
        packages ("com.fasterxml.jackson.jaxrs.json");
        register(JacksonFeature.class);
        register(org.tmf.dsmapi.commons.jaxrs.BadUsageExceptionMapper.class);
        register(org.tmf.dsmapi.commons.jaxrs.JacksonConfigurator.class);
        register(org.tmf.dsmapi.commons.jaxrs.JsonMappingExceptionMapper.class);
        register(org.tmf.dsmapi.commons.jaxrs.UnknowResourceExceptionMapper.class);
        register(org.tmf.dsmapi.commons.jaxrs.UnknowResourceExceptionMapper.class);
        register(org.tmf.dsmapi.hub.HubResource.class);
        register(org.tmf.dsmapi.quote.QuoteResource.class);
        register(org.tmf.dsmapi.quote.QuoteAdminResource.class);
    }

}
