package testMaven.testMaven;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
public class XMLParser {

	private static Response response;

	public static void main(String[] args) throws JAXBException {

		File file = new File("/Users/tausif/Documents/test.xml");
		JAXBContext jaxbContext = JAXBContext.newInstance(Response.class);
		Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
		response = (Response) unmarshaller.unmarshal(file);
		System.out.println(response);

	}

}
