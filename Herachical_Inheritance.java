class Humans{
    public void salary() {
        System.out.println("Salary= 200000");
    }
}

class Programmer extends Humans {
    public void bonus { 
        System.out.println("Bonus=50000");
    }
}
class Worker extends Humans  {
	public void wages() {
		System.out.println("wagws=2000");
	}
}
class Teacher extends Humans {
	public void Incriment {
		System.out.println("Incriment=5000");		
	   

class Herachical_Inheritance {
    public static void main(String args[]) {
	Programmer c1=new Programmer;
        Teacher c2=new Teacher; 
        Worker c3=new Worker;
	System.out.println(c1.bonus+" "+c2.wages+" "+c3.Incriment);
}