package demo1;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ReadXML1 {

	public static Object getObject() {
		
		try {
			//�����ĵ�����
			DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dFactory.newDocumentBuilder();
			Document doc;
			doc = builder.parse(new File("src/demo1/config1.xml"));
			//��ȡ�����������ı��ڵ�
			NodeList nList = doc.getElementsByTagName("className");
			Node classNode = nList.item(0).getFirstChild();
			String cName = "demo1." + classNode.getNodeValue();
			//ͨ����������ʵ�����󲢽��䷵��
	        Class<?> c;
			c = Class.forName(cName);
			Object obj=c.newInstance();
	        
	        return obj;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
        
	}
}
