package com.ecomers.websites;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream.GetField;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Properties;
import java.util.Random;
import java.util.Set;

import com.delivery.coriour.BlueDart;
import com.delivery.coriour.Curiour;

public class FlipcartOnline implements EComers {
	   public static Properties poc;
	     static {
		   //reading propertice value
		   
		   try {
			InputStream io=new FileInputStream("src\\com\\services\\files\\info.properties");
		     poc=new Properties();
		     poc.load(io);
		   } 
		   catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		     
	   }
	     public static FlipcartOnline getins() throws ClassNotFoundException, InstantiationException, IllegalAccessException
	     {
	    	 String k=poc.getProperty("dtd");
	     		Class c=Class.forName(k);
			     cus=(Curiour)c.newInstance();
	         return new FlipcartOnline();
	     }
	       
	     static Curiour cus;
	
//     	public FlipcartOnline() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
//     		String k=poc.getProperty("dtd");
//     		Class c=Class.forName(k);
//		     cus=(Curiour)c.newInstance();
//	}
	   
	
     	
	

	@Override
	public String order(float k[]) {
		// TODO Auto-generated method stub
    
    Random rm=new Random();
    int id=rm.nextInt();
    float count=0;
   for(float h:k)
   {
	count=h+count;   
   }
   
    return "this is your bill "+count +" and this is delivery type "+cus.delivary()+" this is your id "+id+"";
	}
}
