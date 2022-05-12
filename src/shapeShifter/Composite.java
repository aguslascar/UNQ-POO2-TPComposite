package shapeShifter;

import java.util.ArrayList;
import java.util.List;

public class Composite implements IShapeShifter {
	
	List<IShapeShifter> componentes = new ArrayList<IShapeShifter>();

	
	@Override
	public IShapeShifter compose(IShapeShifter comp) {
		componentes.add(comp);
		return this;
	}

	@Override
	public int deepest() {
		int profundidad = 1;
		for(IShapeShifter comp : componentes) {
			profundidad += comp.deepest();
		}
		return profundidad;
	}

	@Override
	public IShapeShifter flat() {
		IShapeShifter aplanar = new Composite();
		for(IShapeShifter comp : componentes) {
			aplanar.compose(comp);
		}
		return aplanar;
	}

	@Override
	public List<Integer> values() {
		List<Integer> suma = new ArrayList<Integer>();
		for(IShapeShifter comp : componentes) {
			suma.addAll(comp.values());
		}
		return suma;
	}

}
