
class  Person
{
	String name;
	int age;
}

class PersonApp
{
	public static void main(String[] args) 
	{
		Person p[];
		p=new Person[4];
		p[0]=new Person();
		p[1]=new Person();
		p[2]=new Person();
		p[3]=new Person();

		int i;
		p[0].name="Ramu";
		p[0].age=18;
		p[1].name="Raju";
		p[1].age=19;
		p[2].name="Sita";
		p[2].age=20;
		p[3].name="Rita";
		p[3].age=19;
		


		for (i=0;i<=p.length-1 ;i++)
		{
		
			System.out.println(p[i].name);
			System.out.println(p[i].age);

			
		}
		System.out.println();

	}
}
