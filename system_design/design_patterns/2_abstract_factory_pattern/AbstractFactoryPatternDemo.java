public class AbstractFactoryPatternDemo{
	public static void main(String []args){
		AbstractFactory factory1 = FactoryProducer.getFactory(true);
		Shape roundedCircle = factory1.getShape("CIRCLE");
		Shape roundedRectangle = factory1.getShape("RECTANGLE");
		roundedCircle.draw();
		roundedRectangle.draw();

		AbstractFactory factory2 = FactoryProducer.getFactory(false);
		Shape circle = factory2.getShape("CIRCLE");
		Shape rectangle = factory2.getShape("RECTANGLE");
		circle.draw();
		rectangle.draw();

	}
}