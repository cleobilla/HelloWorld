
public class Hello {

	private String msg = "Hello world";

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public void print(){
		System.out.println(this.msg);
	}
}
