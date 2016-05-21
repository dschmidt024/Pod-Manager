
public class MainMenu {

	public static void main(String[] args) {
		
		Members member1 = new Members();
		Members member2 = new Members();
		
		// member1.memberName = "Everett";
		// member1.memberAge = 56;
		// member1.memberSkill = "Conversions";
		// member1.outputMembers();
		
		member1.setMemberName("Everett(set))");
		member1.setMemberAge(65);
		member1.setMemberSkill("Fund Access");
		
		String memberName = member1.getMemberName();
		int memberAge = member1.getMemberAge();
		String memberSkill = member1.getMemberSkill();
		
		System.out.println("Member 1: Get value of member name is " + memberName);
		System.out.println("Member 1: Get value of member age is " + memberAge);
		System.out.println("Member 1: Get value of member skill is " + memberSkill);
		System.out.println("------------------------------------------------------------------");
		
		member1.passMemberName(memberName);
		member1.passMemberAge(memberAge);
		member1.passMemberSkill(memberSkill);
		member1.passMemberInfo(memberName, memberAge, memberSkill);
		System.out.println("------------------------------------------------------------------");
		
		member2.memberName = "Michele";
		member2.memberAge = 39;
		member2.memberSkill = "Advice";
		member2.outputMembers();
		
		memberName = member2.getMemberName();
		memberAge = member2.getMemberAge();
		memberSkill = member2.getMemberSkill();
		
		System.out.println("Member 2: Get value of member name is " + memberName);
		System.out.println("Member 2: Get value of member age is " + memberAge);
		System.out.println("Member 2: Get value of member skill is " + memberSkill);
		System.out.println("------------------------------------------------------------------");
		
		Pods pod1 = new Pods();
		Pods pod2 = new Pods();
		
		// pod1.podName = "TOMS";
		// pod1.podFunction = "Monetary, Open Account";
		// pod1.numPodMembers = 6;
		// pod1.outputPods();
		
		pod1.setPodName("TOMS Pod");
		pod1.setPodFunction("Transfer of Assets and Monetary");
		pod1.setNumPodMembers(16);
		
		// String podName = pod1.getPodName();
		// String podFunction = pod1.getPodFunction();
		// int numPodMembers = pod1.getNumPodMembers();
		
		System.out.println("Pod 1: Get value of pod name is " + pod1.getPodName());
		System.out.println("Pod 1: Get value of pod function is " + pod1.getPodFunction());
		System.out.println("Pod 1: Get value of number of pod members is " + pod1.getNumPodMembers());
		System.out.println("------------------------------------------------------------------");
		
		pod1.passPodName(pod1.getPodName());
		pod1.passPodFunction(pod1.getPodFunction());
		pod1.passNumPodMembers(pod1.getNumPodMembers());
		pod1.passPodInfo(pod1.getPodName(), pod1.getPodFunction(), pod1.getNumPodMembers());
		System.out.println("------------------------------------------------------------------");
		
		pod2.podName = "MP3";
		pod2.podFunction = "Clerical";
		pod2.numPodMembers = 4;
		pod2.outputPods();
		
		String podName = pod2.getPodName();
		String podFunction = pod2.getPodFunction();
		int numPodMembers = pod2.getNumPodMembers();
		
		System.out.println("Pod 2: Get value of pod name is " + podName);
		System.out.println("Pod 2: Get value of pod function is " + podFunction);
		System.out.println("Pod 2: Get value of number of pod members is " + numPodMembers);
		System.out.println("------------------------------------------------------------------");
		
		Elevation elevation1 = new Elevation();
		new Elevation("Constructor with parameter");
		new Elevation("Constructor with 2 paramters.  One a String and the other an int ", 49);
		int elevation = elevation1.calcDaysTilElevation();
		System.out.println("Project elevates in " + elevation + " days");
		
		Projects.projectsMiss = 24;
		Projects project1 = new Projects();
		project1.projectsMiss = 6;
		Projects.projectNameMissStatic();
		int projectsMissDDD = project1.calcProjectMissDDD();
		System.out.println("Projects missing DDD is " + projectsMissDDD + ".");
		
		

	}

}
