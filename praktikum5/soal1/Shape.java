package praktikum5.soal1;

abstract class Shape {

	protected String shapeName;
	
	//constructor
	public Shape (String name){
		shapeName = name;
	}
	
	
	@Override
	public String toString(){
		return shapeName;
	}//end of toString method
	
	//derived classes
	public abstract double area();
}
