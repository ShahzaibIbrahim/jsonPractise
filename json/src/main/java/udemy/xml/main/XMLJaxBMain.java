package udemy.xml.main;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.module.jaxb.JaxbAnnotationIntrospector;

import udemy.xml.domain.XMLBean;

public class XMLJaxBMain {

	public static void main(String[] args) {
		
		XmlMapper mapper = new XmlMapper();
		
		mapper.setAnnotationIntrospector(new JaxbAnnotationIntrospector(mapper.getTypeFactory()));
		
		try {
			
			XMLBean bean = new XMLBean();
			bean.setId("1"); bean.setProperty("Shahzaib");
			
			System.out.println(mapper.writeValueAsString(bean));
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		
	}

}
