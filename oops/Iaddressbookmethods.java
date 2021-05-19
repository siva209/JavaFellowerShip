package com.oops;

import java.util.List;
import java.util.Map;

public interface Iaddressbookmethods {
	public void add();
	public void show();
	public void edit();
	public void delete();
	public  void Show(List<ContactInfo> addressBook) ;
	public void sortByName() ;
	public void sortByCity() ;
	public void sortByState();
	public void sortByZip();
	
	
}


