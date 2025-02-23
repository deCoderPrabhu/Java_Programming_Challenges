package programmingChallenge80_82;

import java.util.Objects;

public class Person {
	public int age;
	public String name;
	
	Person(){
		this.age = age;
		this.name = name;
	}
	Person(int age,String Name){
		this.age = age;
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && Objects.equals(name, other.name);
	}
	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}
	public void main() {
		
		Person per = new Person();
		System.out.println(per);
	}

}
