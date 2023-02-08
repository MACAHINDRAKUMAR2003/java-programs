class Employee {
    public void salary() {
        System.out.println("Salary= 200000");
    }
}

class Programmer extends Employee { 
// Programmer class inherits from Employee class
    public void bonus() {
        System.out.println("Bonus=50000");
    }
}
class Extrawork extends Programmer {
	public void incriment() {
		System.out.println("Incriment=5000");
	}
}

class multi_inheritance {
    public static void main(String args[]) {
        Extrawork e = new Extrawork();
        e.salary(); // calls method of super class
        e.bonus(); // calls method of sub class
	e.incriment();
    }
}