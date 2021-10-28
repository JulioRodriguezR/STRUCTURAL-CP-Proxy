package org.formacion.proxy;

public class CuentaNueva implements Cuenta {
	
	private Cuenta original; 
	
	public CuentaNueva(String cliente) {
		super();
		original = new CuentaNormal(cliente);
	}

	@Override
	public String getCliente() {
		return original.getCliente();
	}

	@Override
	public int getCantidad() {
		return original.getCantidad();
	}

	@Override
	public void movimiento(int importe) {
		if (importe + original.getCantidad() >= 0) {			
			original.movimiento(importe);
		}
	}
	
}
