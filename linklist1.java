import java.util.Scanner;
class student
{
	int roll;
	String name;
	student ad;	
	student (int roll,String name)
	{
		this.roll=roll;
		this.name=name;
		this.ad=null;
	}
}
class linklist1
{
	public static void main(String[]args)
	{
		student base=createLinklist();
		printLinklist(base);
	}
	 static student createLinklist()
	{
		Scanner sc=new Scanner(System.in);
		student p=null,q=null,temp=null;
		System.out.print("ente  r roll- ");
		int roll;
		roll=sc.nextInt();
		sc.nextLine();
		System.out.print("enter name- ");
		String name=sc.nextLine();
		p=new student(roll,name);
		temp=p;

		while(true)
		{
			System.out.print("do you want to add more record-yes/no ");
			String s=sc.nextLine();
			if(s.equalsIgnoreCase("no")) 
			{
				break;
			}
			System.out.print("enter roll- ");
			roll=sc.nextInt();
			sc.nextLine();
			System.out.println("enter name- ");
			name=sc.nextLine();
			q=new student(roll,name);
			temp.ad=q;
			temp=q;
		}
		return p;

	}
	static void printLinklist(student p)
	{
		student temp=p; 
		while (temp!=null)
		{
			System.out.println(temp.roll+" "+temp.name);
			temp=temp.ad;
		}
	}

}