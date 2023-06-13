package com.Nive.SampleProject.DataService;

import org.springframework.stereotype.Component;

@Component
public class DataService {
	int a=6;
	int c=7;
	int d=20;
	
	public int polygonservice() {
		//int e=a+(c*d);
		int e=a*c+(d);
		System.out.println("polygonservice"+ e);
		return e;
	}
	

}
