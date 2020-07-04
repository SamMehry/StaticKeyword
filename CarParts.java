package StaticKeyword;

public class CarParts {//non-Static Class

	

	public static class Wheels {//static class

		public void wheelSize() {//method
			System.out.println("15 is the wheel diameter and 6.5 is the wheel width");

		}

		public void wheelBrand() {//method

			System.out.println("OZ Racing Ultraleggera");

		}

	}

	public CarParts() {//constructor

	}

	public static void main(String[] args) {

		CarParts.Wheels object = new CarParts.Wheels();//object
		// Outter.Inner objName = new Outter.Inner();
		object.wheelBrand();
		object.wheelSize();

	}
}
