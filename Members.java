
public class Members {
	String memberName;
	int memberAge;
	String memberSkill;
	
	void setMemberName (String memberName)	{
		this.memberName = memberName;
	}
	
	void setMemberAge (int memberAge)	{
		this.memberAge = memberAge;
	}
	
	void setMemberSkill (String memberSkill)	{
		this.memberSkill = memberSkill;
	}
	
	void outputMembers()	{
		System.out.println("My name is " + memberName + ".  I am " + memberAge + " years old and my skill is " + memberSkill + ".");
	}
	
	String getMemberName()	{
		return memberName;
	}
	
	int getMemberAge()	{
		return memberAge;
	}
	
	String getMemberSkill()	{
		return memberSkill;
	}
	
	void passMemberName(String memName)	{
		System.out.println("Passing member name " + memName + " using parameters.");
	}
	
	void passMemberAge(int memAge)	{
		System.out.println("Passing member age " + memAge + " using paramters.");
	}
	
	void passMemberSkill(String memSkill)	{
		System.out.println("Passing member skill " + memSkill + " using parameters.");
	}
	
	void passMemberInfo(String memName, int memAge, String memSkill)	{
		System.out.println("Passing " + memName + " age " + memAge + " with skill " + memSkill + "using 3 parameters in 1 method.");
	}
	
}
