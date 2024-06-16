package inheritence;

public class Trainer extends QEmployee 
{
String skill;
public Trainer(String name,String eid,long contact,double salary,String branch,String skill)
{
	super(name,eid,contact,salary,branch);
	this.skill=skill;
}
public void profileT()
{
	System.out.println("SKILL IS "+skill);
}
}
