package ar.edu.unq.po2.tp6;


public interface IBanco {
	public void agregarCliente(Cliente c);
	public void agregarSolicitud(Credito cr, Cliente c);
	public double montoTotalDineroDesenbolsar();
	
}
