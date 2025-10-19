package preparation;

public class FunctionRepeatedchar {

	public static void main(String[] args) {
		Repeated r=new Repeated();
		r.getRepeated("banana");
	}
}
class Repeated {
	public void getRepeated(String a) {
		char[] ch=a.toCharArray();	
		for(int i=0;i<a.length();i++) {
			int count=0;
			for(int j=i+1;j<a.length();j++) {
				if(ch[i]==ch[j]) {
					count++;
					ch[j]='$';
					}
				}
			if(count>0 && ch[i]!='$') {
				System.out.println(ch[i]);
			}
		}
	}
}