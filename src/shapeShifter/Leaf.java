package shapeShifter;

import java.util.ArrayList;
import java.util.List;

public class Leaf implements IShapeShifter {
	private Integer value;
	
	public Leaf(Integer value) {
		this.value = value;
	}
	
	@Override
	public IShapeShifter compose(IShapeShifter comp) {
		IShapeShifter composicion = new Composite();
		composicion.compose(this);
		composicion.compose(comp);
		return composicion;
	}

	@Override
	public int deepest() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public IShapeShifter flat() {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public List<Integer> values() {
		List<Integer> valor = new ArrayList<Integer>();
		valor.add(value);
		return valor;
	}

}
