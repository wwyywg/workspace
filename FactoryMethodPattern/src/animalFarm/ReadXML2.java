package animalFarm;

import java.io.File;

import javax.xml.parsers.*;

import org.w3c.dom.*;

public class ReadXML2 {

	public static Object getObject() {
		try {
			DocumentBuilderFactory dFactory=DocumentBuilderFactory.newInstance();
            DocumentBuilder builder=dFactory.newDocumentBuilder();
            Document doc;                           
            doc=builder.parse(new File("src/animalFarm/config2.xml"));
            NodeList nl=doc.getElementsByTagName("className");
            Node classNode=nl.item(0).getFirstChild();
            String cName="animalFarm."+classNode.getNodeValue();
            System.out.println("ÐÂÀàÃû£º"+cName);
            Class<?> c=Class.forName(cName);
              Object obj=c.newInstance();
            return obj;
		} catch (Exception e) {
			e.printStackTrace();
            return null;
		}
	}
}
