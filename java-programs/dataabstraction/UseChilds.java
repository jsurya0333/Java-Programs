package dataabstraction;

public class UseChilds {

	public static void main(String[] args) {
		Childs c=new Childs();
		System.out.println(c.add(34,34)+" "+c.sub(67,23)+" "+
							c.mul(67,57)+" "+c.div(100,10));
	}
}
interface a{
	public int add(int a,int b);
	public int sub(int a,int b);
}
interface b extends a{
	public int mul(int a,int b);
	}
interface c extends a{
	public int div(int a,int b);
}
class Childs implements b,c{
	public int add(int a,int b) {
	return a+b;
	}
	public int sub(int a,int b) {
		return a-b;
	}
	public int mul(int a,int b) {
		return a*b;
	}
	public int div(int a,int b) {
		return a/b;
	}
}