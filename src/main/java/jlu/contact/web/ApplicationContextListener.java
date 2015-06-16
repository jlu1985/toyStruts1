package jlu.contact.web;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.brainfuse.contact.dataaccess.InMemoryContact;
import com.brainfuse.contact.dataaccess.InMemoryRelationship;
import com.brainfuse.contact.dataaccess.IoConstansts;
import com.brainfuse.contact.dataaccess.locations.InMemoryCity;
import com.brainfuse.contact.dataaccess.locations.InMemoryState;

@WebListener
public class ApplicationContextListener implements ServletContextListener{

	private static final Logger logger = LoggerFactory.getLogger(ApplicationContextListener.class);
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		logger.debug("{} is initialized",this);
		ServletContext ctx = sce.getServletContext();
		ctx.setAttribute(IoConstansts.BASIC_ACCESS_CONTACT_NAME, new InMemoryContact());
		ctx.setAttribute(IoConstansts.BASIC_ACCESS_CITY_NAME,new InMemoryCity());
		ctx.setAttribute(IoConstansts.BASIC_ACCESS_RELATIONSHIP_NAME,new InMemoryRelationship());
		ctx.setAttribute(IoConstansts.BASIC_ACCESS_STATE_NAME, new InMemoryState());
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
	}

}
