//**************************************************************************************************************
//
//  Box.java		Author: Fischer
//
//  This project creates a class called Box with an instance variable (int size = 0); 
//  then a method named printBox with no parameters and void return type is added;
//  the method prints out * (star) characters with size rows and size columns equaling 5 x 5
//  with use of the dot operator.
//**************************************************************************************************************
public class Box {
	// initializes int size
	int size = 0;

	// creates method
	void printBox() {

		for (int row = 0; row < size; row++) {
			for (int columns = 0; columns < size; columns++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// use dot operator to invoke printBox method of size 5
		Box boxsize = new Box();
		boxsize.size = 5;
		boxsize.printBox();

	}

}
