
public class Album extends Brano{
	private int numero_brani= 10;
	private Brano[] brani = new Brano[numero_brani];
	
	
	public Album(String titolo, Brano[] brani) {
		super(titolo);
		this.brani=brani;
	}
	public void setBrani(Brano[] brani) {
		this.brani=brani;
	}
	
	public Brano[] getBrani() {
		return brani;
	}
}
