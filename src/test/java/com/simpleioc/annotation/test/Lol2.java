package com.simpleioc.annotation.test;

import com.simpleioc.annotation.Autowired;

public class Lol2 {

	@Autowired(value = FaceService2.class)
	private FaceService2 faceService;
	
	public void work() {
		faceService.buy("德玛", 5);
	}

	public FaceService2 getFaceService() {
		return faceService;
	}
	
}