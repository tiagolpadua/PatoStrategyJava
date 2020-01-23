package pato;

public abstract class Pato implements IVoo, IGrasno{
	protected IGrasno grasno;
	protected IVoo voo;
	
	public void voar() {
		voo.voar();
	}

	public void grasnar() {
		grasno.grasnar();
	}
}
