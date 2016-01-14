package com.knorex.helper;

public class FlowHelper {
	public static void sleep(long sleepTime) throws InterruptedException {
		try {
			Thread.sleep(sleepTime);
		} catch (InterruptedException exception) {
			throw exception;
		}
	}
}
