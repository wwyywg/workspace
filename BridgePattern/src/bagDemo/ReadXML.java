package bagDemo;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ReadXML {

	public static Object getObject(String args) {
		try {
			DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dFactory.newDocumentBuilder();
			Document doc;
			doc = builder.parse(new File("src/bagDemo/config.xml"));
			NodeList nList = doc.getElementsByTagName("className");
			Node classNode = null;
			if (args.equals("color")) {
				classNode = nList.item(0).getFirstChild();
			}else if(args.equals("bag")) {
                classNode=nList.item(1).getFirstChild();
            }  
			String cNameString = "bagDemo." + classNode.getNodeValue();
			Class<?> c = Class.forName(cNameString);
			Object object = c.newInstance();
			
			return object;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}
}
