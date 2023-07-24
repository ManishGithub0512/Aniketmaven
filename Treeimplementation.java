package Abstract;

public class Treeimplementation  implements Tree {
	@Override
	public void steam() {
		System.out.println("steam is very fatty");
		Tree.super.steam();
	}
@Override
public void root() {
	System.out.println("root spread vertical");
	Tree.super.root();
}
@Override
public void leaves() {
	System.out.println("leaves are slimyy");
}
}
