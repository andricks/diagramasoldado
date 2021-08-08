package systemadecontrol;

import java.util.Date;

public class controldeservicion  {
	private String guarida;
	private String imaginarias ; 
	private String cuarteleros;
	private String codigodeservicio;
	private Date actividadfecha ;
	
	
	public Date getActividadfecha() {
		return actividadfecha;
	}
	public void setActividadfecha(Date actividadfecha) {
		this.actividadfecha = actividadfecha;
		
		
	} 
	public Long calcularfecha(){
		Date fechaactual = new Date ();
		Long dif = fechaactual.getTime() - actividadfecha.getTime();
		dif =dif /1000/60/60/24/365;
		return dif ;
		
		
	}  

}
