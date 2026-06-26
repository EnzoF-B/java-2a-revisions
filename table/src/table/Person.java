package table;

public class Person {
	private String name;
	private int birthyear;
	public Person(String name, int birthyear) {
		this.setName(name);
		this.setBirthyear(birthyear);
	}
	public static void main(String args[]) {
		Person bob = new Person("bob",2028);
		Person amy = new Person("amy",-2006);
		
		Person enzo = new Person("enzo",2005);
		Person michel = new Person("michel",1955);
		Set<Person> ps = new Set<Person>();
		ps.add(bob); ps.add(amy); ps.add(new Person("john",2001));
		ps.add(new Person("john2",2001));
		ps.add(new Person("robert",2004));
		
		ps.add(new Person("enzo",2005));
		ps.add(new Person("michel",1955));
		System.out.println("-- PERSONS --\n" + ps);
		//n'importe quel nombre dans le nom
		//System.out.println(ps.select(p -> p.getName().matches(".*[0-9]"))); //rajouter une * à la fin si plusieurs nombres
		//trouver tous ceux qui contiennent "ob"
		//System.out.println(ps.select(p -> p.getName().matches(".*ob.*")));
		
		Set<Pair<Person,Person>> family = new Set<Pair<Person,Person>>();
		family.add(new Pair(bob,amy));
		
		System.out.println("-- FAMILIES --\n" + family);
	
		System.out.println("-- QUERIES --");
		//System.out.println("\n"+family.select(p -> p.x == bob));
		System.out.println(family.select(p -> p.x == bob).collect(p -> p.y));
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBirthyear() {
		return birthyear;
	}
	public void setBirthyear(int birthyear) {
		this.birthyear = birthyear;
	}
	
	public String toString() {
			return this.hashCode() + "\t" + name + "\t" + birthyear;
	}
}
