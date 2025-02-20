		public class TightCouplingViolation {
		public static void main(String[] args) {
		EngineInterface engine = new Engine();
		Car car = new Car(engine);
		car.start();
		}
		}
		
		interface EngineInterface {
		void start();
		}
		
		class Engine implements EngineInterface {
		@Override
		public void start() {
		System.out.println("Engine started");
		}
		}
		
		class Car {
		private final EngineInterface engine;
		
		public Car(EngineInterface engine) {
		this.engine = engine;
		}
		
		public void start() {
		engine.start();
		System.out.println("Car is running");
		}
		
		}
