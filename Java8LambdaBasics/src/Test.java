import java.util.HashMap;
import java.util.Map;

public class Test {

	int x;
	public Test(int x){
		this.x = x;
	}
	
	
	 public int hashCode(){
		//System.out.println("value of hashcode() "+(int)(Math.random()*201));
		return (int)(Math.random()*1000);
	}
	
	
	  public boolean equals(Object obj){
		Test other = (Test)obj;
		if(x!= other.x)
			return false;
			return true;
	}
	
	public String toString(){
		return ""+x;
	}
	
	public static void main(String[] args) {
		Map<Test,Integer> map = new HashMap();
		Test a = new Test(10);
		map.put(a,1);
		System.out.println(map.get(a));
	}

}
