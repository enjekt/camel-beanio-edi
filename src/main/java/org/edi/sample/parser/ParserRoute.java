package org.edi.sample.parser;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.dataformat.beanio.BeanIODataFormat;
import org.apache.camel.spi.DataFormat;

public class ParserRoute extends RouteBuilder{
	DataFormat format = new BeanIODataFormat("edidefinitions.xml","ediStream");
			@Override
	public void configure() throws Exception {
		// a route which uses the bean io data format to format the CSV data
		// to java objects
		from("direct:unmarshall")
		        .unmarshal(format)
		        // and then split the message body, so we get a message for each row
		        .split(body())
		        .to("seda:unmarshalled");

		// convert a list of java objects back to flat format
		from("direct:marshall")
		        .marshal(format)
		        .to("direct:marshalled");
	}

}
