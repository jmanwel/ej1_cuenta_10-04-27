package ar.edu.unlam.PB2;

public class cuenta {
	private String Nombre;
	private Double Saldo;
	private Integer cantidadExtracciones=0;
	private Double Comision=1.00;
	final Integer coeficienteDeChoreo=5;
	
	public cuenta (String Nombre, Double Saldo){
		this.Nombre=Nombre;
		this.Saldo=Saldo;
	}
	
	public String getNombre(){
		return "El nombre del titular es "+Nombre;
	}
	public Integer getcantidadExtracciones(){
		return cantidadExtracciones;
	}
	
	public Double getSaldo(){
		return +this.Saldo;
	}
	
	public void setDeposito(Double Deposito){
		if(Deposito>=0){
			this.Saldo=this.Saldo+Deposito;}
	}
	
	public void setExtraccion(Double Extraccion){
		if(Extraccion>=0){
			this.cantidadExtracciones++;
			this.Saldo=this.Saldo-Extraccion;
		if(this.cantidadExtracciones==this.coeficienteDeChoreo){
			this.Saldo=this.Saldo-this.Comision;
			this.cantidadExtracciones=0;
		}}
	}
	

}
