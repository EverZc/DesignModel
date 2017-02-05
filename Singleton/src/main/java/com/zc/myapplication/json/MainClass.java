// JSON Java Class Generator
// Written by Bruce Bao
// Used for API: 
package com.zc.myapplication.json;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
	private ArrayList<ArrayUtill> array=new ArrayList<>();
	private int error;
	private boolean next=false;

	public List<ArrayUtill> getArray() {
		return array;
	}

	public void setArray(ArrayList<ArrayUtill> array) {
		this.array = array;
	}

	public int getError() {
		return error;
	}

	public void setError(int error) {
		this.error = error;
	}

	public boolean getNext() {
		return next;
	}

	public void setNext(boolean next) {
		this.next = next;
	}
}
