package reporting;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.testng.annotations.Test;

public class Log4 {
	@Test
	public void test1() throws IOException
	{
		PatternLayout lay = new PatternLayout("%d %c %m %n");
		FileAppender app = new FileAppender(lay,"./rep/r12.log");
		BasicConfigurator.configure(app);
		Logger log = Logger.getLogger(this.getClass().getName());
		log.warn("warn");
		log.info("info");
		log.error("error");
		
		
	}

}


