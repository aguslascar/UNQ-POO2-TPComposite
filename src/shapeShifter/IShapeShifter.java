package shapeShifter;

import java.util.List;

public interface IShapeShifter{
	public IShapeShifter compose(IShapeShifter comp);
	public int deepest();
	public IShapeShifter flat();
	public List<Integer> values();
}