package com.prcatice.Logger.Controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggingController {
	Logger logger = LoggerFactory.getLogger(LoggingController.class); 

	 

    @RequestMapping("/") 

    public String index() { 

        logger.trace("A TRACE Message"); 

        logger.debug("A DEBUG Message"); 

        //warn info and error level trace are shown by default on console
        logger.info("An INFO Message"); 

        logger.warn("A WARN Message"); 

        logger.error("An ERROR Message"); 

 

        return "Hey Akshay! Check out the Logs to see the output..."; 

    } 
}
