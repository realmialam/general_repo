package com.mainmethod.abstractBird;

import com.mainmethod.interfaces.Bird;

public abstract class AbstractBird implements Bird{
	
	@Override
	public void fly() {
		System.out.println("Birds fly but in abstract bird class ..");
	}

}
