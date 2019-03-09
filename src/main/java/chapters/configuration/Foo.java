package chapters.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class Foo {
	// here the logger name is "someRandomLogger", and since there is no <logger>
	// element with this name in the configuration file logback.xml, you cannot
	// influence it
	// static final Logger logger = LoggerFactory.getLogger("someRandomLogger");

	// here the logger name is "chapters.configuration.Foo"
	// there is a <logger> element with this name in logback.xml and so you can
	// influence this logger via logback.xml
	static final Logger logger = LoggerFactory.getLogger(Foo.class);

	public void doIt() {
		logger.debug("Foo - debug");
		logger.info("Foo - info!");
	}
}