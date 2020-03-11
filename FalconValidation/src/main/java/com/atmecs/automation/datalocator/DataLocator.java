package com.atmecs.automation.datalocator;

import java.util.Properties;

import com.atmecs.automation.LocationReader.LocationReader;
import com.atmecs.automation.filepath.FilePath;

public class DataLocator {
	Properties property;
	public String firsticon;
	public String secondicon;
	public String thirdicon;
	public String iconvalid;

	public void getPathData() throws Exception {
		property = LocationReader.readLocation(FilePath.locator_path);
		setFirsticon();
		setSecondicon();
		setThirdicon();
		setIconvalid();

	}

	public String getIconvalid() {
		return iconvalid;
	}

	public void setIconvalid() {
		iconvalid = property.getProperty("loc_valid");
	}

	public String getThirdicon() {
		return thirdicon;
	}

	public void setThirdicon() {
		thirdicon = property.getProperty("loc_button3");
	}

	public String getSecondicon() {
		return secondicon;
	}

	public void setSecondicon() {
		secondicon = property.getProperty("loc_button2");
	}

	public String getFirsticon() {
		return firsticon;
	}

	public void setFirsticon() {
		firsticon = property.getProperty("loc_button");
	}

}