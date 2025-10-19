package preparation;

public class Repeatedword {
public static void main(String[] args) {
			String word="java is ok and java is fine";
			String[] str=word.split(" ");
			for(int i=0;i<str.length;i++) {
				int count=0;
				for(int j=i+1;j<str.length;j++) {
					if(str[i].equals(str[j])) {
					count++;
					str[j]="#";
				}
			}
				if(count>0 && str[i]!="#") {
					System.out.println(str[i]);
				}
			}
		}
	}
			
