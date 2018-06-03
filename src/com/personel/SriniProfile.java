package com.personel;

public class SriniProfile implements IProfile {

	@Override
	public void myBasicInfo() {
		System.out.println(ProfileConstants.FIRST_NAME);
		System.out.println(ProfileConstants.LAST_NAME+"vasan");
		System.out.println(ProfileConstants.AGE+"21");
	}

	@Override
	public void myHobbies() {
		System.out.println("My hobby is fishing..........");

	}

}
