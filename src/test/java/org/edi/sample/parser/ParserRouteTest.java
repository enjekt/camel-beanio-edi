package org.edi.sample.parser;

import static org.junit.Assert.*;

import org.apache.camel.Consumer;
import org.apache.camel.ConsumerTemplate;
import org.apache.camel.EndpointInject;
import org.apache.camel.Produce;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.RoutesBuilder;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.edi.sample.models.PurchaseOrder;
import org.junit.Test;

public class ParserRouteTest extends CamelTestSupport {


    @Test
    public void testMarshalling() throws Exception {
        super.template.sendBody("direct:unmarshall",testData);
       	PurchaseOrder po=super.consumer().receiveBody("seda:unmarshalled", PurchaseOrder.class);
       	assertNotNull(po);
       	System.out.println(po);
       	assertEquals(6,po.getLineItem().size());
       	
    }

    @Override
   public RouteBuilder createRouteBuilder() throws Exception {
        return new ParserRoute();
    }
    
    private static final String testData = "ISA*00*          *00*          *ZZ*STORE    *12*5042645505     *190510*0728*|*00403*100000018*0*P*}\r\n"
    		+ "GS*PO*NOTP*NOTP*20080501*1700*1000*X*004010\r\n"
    		+ "ST*850*000000010\r\n"
    		+ "BEG*00*SA*08292243254**20010501*610385388\r\n"
    		+ "REF*DP*030\r\n"
    		+ "REF*PS*\r\n"
    		+ "PO1*1*120*EA*9.25*TE*CB*(12) 0-083628-838*PR*RO*VN*ABA18783\r\n"
    		+ "PO1*2*220*EA*13.7 9*TE*CB*(69) 0-093 83 7-991*PR*RO*VN*RUP83112\r\n"
    		+ "PO1*3*126*EA*10.9 9*TE*CB*(71) 0-099172-837*PR*RO*VN*CPR19293\r\n"
    		+ "PO1*4*76*EA*4.35*TE*CB*(71) 0-012110-737*PR*RO*VN*PIW28173\r\n"
    		+ "PO1*5*72*EA*7.5*TE*CB*(71) 0-0848 88-9 75*PR*RO*VN*JBM1938 7\r\n"
    		+ "PO1*6*696*EA*9.55*TE*CB*(71) 0-003 922-121*PR*RO*VN*IUI19283";

}
