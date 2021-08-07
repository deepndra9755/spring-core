package com.spring.property;

import java.util.Properties;

public class PropertyDEMO {
	
  
   Properties logon;

public void setLogon(Properties logon) {
	this.logon = logon;
}

@Override
public String toString() {
	return "PropertyDEMO [logon=" + logon + "]";
}
   

}
