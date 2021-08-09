package com.bugtracker;


import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.jboss.logging.Logger;

/**
 * @Author Khvashshchevskiy Mikhail
 */

public class Release {

    private static Logger logger = LoggerFactory.logger(Release.class);
    public static void main(String[] args){
        logger.debug("Debug message!");
        logger.info("Info message!");
        logger.error("Error message!");
    }
}
