package com.simpleioc.annotation.test;

import com.simpleioc.annotation.Autowired;

public class Lol {

	@Autowired
	private FaceService faceService;
	
	public void work() {
		faceService.buy("剑圣", 5);
	}

	public FaceService getFaceService() {
		return faceService;
	}
	
}