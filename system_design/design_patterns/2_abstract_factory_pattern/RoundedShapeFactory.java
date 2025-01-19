public class RoundedShapeFactory extends AbstractFactory{
	public Shape getShape(String shape){
		if(shape == null){
			return null;
		}else if(shape.equals("CIRCLE")){
			return new RoundedCircle();
		}else if(shape.equals("RECTANGLE")){
			return new RoundedRectangle();
		}

		return null;
	}
}