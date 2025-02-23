package programming_Challenge70_76;

class final_variable {
	
	final int final_Age;
	String name;
	String Company;
	
	public final_variable(int final_Age){
		this.name = "\"Nishant\"";
		this.Company = "\"KeyIdeas\"";
		this.final_Age = final_Age;
		
	}
	@Override
	public String toString()
	{
		return "\"Details\":{"+"\nName: "+name+"\nCompany: "+Company+"\nAge: "+final_Age;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final_variable details = new final_variable(50);
		System.out.println("The Static Details are: "+details.final_Age);
		System.out.println("The Dynamic Details are: "+details.toString());
	}

}
