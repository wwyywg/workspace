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
			//创建文档对象
			DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dFactory.newDocumentBuilder();
			Document doc;
			doc = builder.parse(new File("src/demo1/config1.xml"));
			//获取包含类名的文本节点
			NodeList nList = doc.getElementsByTagName("className");
			Node classNode = nList.item(0).getFirstChild();
			String cName = "demo1." + classNode.getNodeValue();
			//通过类名生成实例对象并将其返回
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
