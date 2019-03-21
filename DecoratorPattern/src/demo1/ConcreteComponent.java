package demo1;

public class ConcreteComponent implements Component {
	
	public ConcreteComponent() {
		// TODO Auto-generated constructor stub
		System.out.println("创建具体构件角色");
	}

	@Override
	public void operation() {
		// TODO Auto-generated method stub
		System.out.println("调用具体构件角色的方法operation()");
	}

}
