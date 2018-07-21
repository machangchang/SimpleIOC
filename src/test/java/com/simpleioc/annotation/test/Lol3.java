package com.simpleioc.annotation.test;

import com.simpleioc.annotation.Autowired;

public class Lol3 {

	@Autowired(name="face")
	private FaceService2 faceService;
	
	public void work() {
		faceService.buy("瞎子", 5);
	}

	public FaceService2 getFaceService() {
		return faceService;
	}

}