package check;

import constants.Constants;

public class Check{
	public static void main(String[] args) {
		String firstName = "立川";
		String lastName = "蛍";
	
		System.out.println("printNameメソッド　→　"+fullName(firstName,lastName));
		Pet pet = new Pet(Constants.CHECK_CLASS_JAVA,Constants.CHECK_CLASS_HOGE);
		pet.introduce();
		RobotPet robotPet = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
		robotPet.introduce();
	}

	public static String fullName(String firstName,String lastName) {
		return firstName + lastName ;
	}


}