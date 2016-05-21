
public class Pods {
	String podName;
	String podFunction;
	int numPodMembers;
	
	void setPodName(String podName)	{
		this.podName = podName;
	}
	
	void setPodFunction(String podFunction)	{
		this.podFunction = podFunction;
	}
	
	void setNumPodMembers(int numPodMembers)	{
		this.numPodMembers = numPodMembers;
	}
	
	void outputPods()	{
		System.out.println("The name of the pod is " + podName + " and its function is " + podFunction + " and there are " + numPodMembers + " members in the pod.");
	}
	
	String getPodName()	{
		return podName;
	}
	
	String getPodFunction()	{
		return podFunction;
	}
	
	int getNumPodMembers()	{
		return numPodMembers;
	}
	
	void passPodName(String podName)	{
		System.out.println("Passing pod name " + podName + " using parameters.");
	}
	
	void passPodFunction(String podFunction)	{
		System.out.println("Passing pod function " + " using paramters.");
	}
	
	void passNumPodMembers(int numPodMembers)	{
		System.out.println("Passing number of pod members " + numPodMembers + " using parameters.");
	}
	
	void passPodInfo(String podName, String podFunction, int numPodMembers)	{
		System.out.println("Passing " + podName + " function " + podFunction + " with " + numPodMembers + "members using 3 parameters in 1 method.");
	}
}
