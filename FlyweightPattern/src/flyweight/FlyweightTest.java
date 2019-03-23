package flyweight;

import java.util.HashMap;

public class FlyweightTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FlyweightFactory factory = new FlyweightFactory();
		Flyweight f01=factory.getFlyweight("a");
        Flyweight f02=factory.getFlyweight("a");
        Flyweight f03=factory.getFlyweight("a");
        Flyweight f11=factory.getFlyweight("b");
        Flyweight f12=factory.getFlyweight("b");
        
        f01.operation(new UnsharedConcreteFlyweight("第1次调用a。"));       
        f02.operation(new UnsharedConcreteFlyweight("第2次调用a。"));       
        f03.operation(new UnsharedConcreteFlyweight("第3次调用a。"));       
        f11.operation(new UnsharedConcreteFlyweight("第1次调用b。"));       
        f12.operation(new UnsharedConcreteFlyweight("第2次调用b。"));
	}

}

class UnsharedConcreteFlyweight {
	private String info;
	
	UnsharedConcreteFlyweight(String info) {
		this.info = info;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}
	
}

interface Flyweight {
	public void operation(UnsharedConcreteFlyweight state);
}

class ConcreteFlyweight implements Flyweight {
	private String key;
	
	ConcreteFlyweight(String key) {
		this.key = key;
		System.out.println("具体享元"+key+"被创建！");
	}
	
	public void operation(UnsharedConcreteFlyweight outState) {
        System.out.print("具体享元"+key+"被调用，");
        System.out.println("非享元信息是:"+outState.getInfo());
    }
}

class FlyweightFactory {
	private HashMap<String, Flyweight> flyweights = new HashMap<String, Flyweight>();
	
	public Flyweight getFlyweight(String key) {
		Flyweight flyweight = (Flyweight)flyweights.get(key);
		if (flyweight != null) {
			System.out.println("具体享元"+key+"已经存在，被成功获取！");
		} else {
			flyweight=new ConcreteFlyweight(key);
            flyweights.put(key, flyweight);
		}
		return flyweight;
	}
}