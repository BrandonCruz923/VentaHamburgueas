package application;

public class Ingredientes {
	
	private int precioCarne = 30;
	private int precioQueso = 30;
	private int precioSalsa = 30;
	private int precioPepino = 30;
	private int precioLechuga = 30;
	private int precioJitomate = 30;
	
	public Ingredientes () {
		
	}

	public Ingredientes(int precioCarne, int precioQueso, int precioSalsa, int precioPepino, int precioLechuga, int precioJitomate) {
		super();
		this.precioCarne = precioCarne;
		this.precioQueso = precioQueso;
		this.precioSalsa = precioSalsa;
		this.precioPepino = precioPepino;
		this.precioLechuga = precioLechuga;
		this.precioJitomate = precioJitomate;
	}

	public int getPrecioCarne() {
		return precioCarne;
	}

	public void setPrecioCarne(int precioCarne) {
		this.precioCarne = precioCarne;
	}

	public int getPrecioQueso() {
		return precioQueso;
	}

	public void setPrecioQueso(int precioQueso) {
		this.precioQueso = precioQueso;
	}

	public int getPrecioSalsa() {
		return precioSalsa;
	}

	public void setPrecioSalsa(int precioSalsa) {
		this.precioSalsa = precioSalsa;
	}

	public int getPrecioPepino() {
		return precioPepino;
	}

	public void setPrecioPepino(int precioPepino) {
		this.precioPepino = precioPepino;
	}

	public int getPrecioLechuga() {
		return precioLechuga;
	}

	public void setPrecioLechuga(int precioLechuga) {
		this.precioLechuga = precioLechuga;
	}

	public int getPrecioJitomate() {
		return precioJitomate;
	}

	public void setPrecioJitomate(int precioJitomate) {
		this.precioJitomate = precioJitomate;
	}
	
	

}
