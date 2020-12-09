
public class Use {

	public static void main(String[] args) {
		Brano[] brani = new Brano[4];
		brani[0] = new Brano("Nothing else Matters");
		brani[1] = new Brano("Enter Sandman");
		brani[2] = new Brano("Sweet child o Mine");
		brani[3] = new Brano("Paradise City");
		
		Album a = new Album("Rock", brani);
		
		System.out.println(a.getBrani()[0].getTitolo());
		System.out.println(a.getBrani()[1].getTitolo());
		System.out.println(a.getBrani()[2].getTitolo());
		System.out.println(a.getBrani()[3].getTitolo());
	}

}
