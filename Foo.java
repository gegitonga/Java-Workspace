public class Foo{
	int i = 5;
	static double k = 0;
	
	void setI(int i){
		this.i = i;
	}
	
	static void setK(double k){
		Foo.k = k;
	}
}