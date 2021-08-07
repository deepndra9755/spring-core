package com.customer.Client;

import com.delivery.coriour.BlueDart;
import com.delivery.coriour.Curiour;
import com.ecomers.websites.EComers;
import com.ecomers.websites.FlipcartOnline;

public class Customer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        EComers ej=null;
		try {
			FlipcartOnline fos=FlipcartOnline.getins();
			//ej =new FlipcartOnline();
			 float h[]={123,5678,34,4};
		        System.out.println( fos.order(h));
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
       
        
	}

}
