package Abstract;

public class Main {

	public static void main(String[] args) {
		famimplementation fi = new famimplementation();
		fi.grandpaa();
		fi.grandmaa();
		fi.father();
		fi.mother();
		System.out.println("**********************");
		Treeimplementation TI = new Treeimplementation();
		TI.root();
		TI.leaves();
		TI.steam();
		System.out.println("************************");
		orgnizationimplementation CI = new orgnizationimplementation();
		CI.department();
		CI.employee();
		CI.mangger();
		CI.salary();

	}
}
