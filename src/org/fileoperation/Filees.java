package org.fileoperation;

import java.io.File;
import java.io.IOException;

public class Filees {
public static void main(String[] args) throws IOException {
//	File f=new File("C:\\Users\\USER\\Desktop\\js");
//	boolean mkdir = f.mkdir();
//	System.out.println(mkdir);
	//boolean mkdirs = f.mkdirs();
	//System.out.println(mkdirs);
	File f=new File("C:\\\\Users\\\\USER\\\\Desktop\\\\js.txt");
	boolean createNewFile = f.createNewFile();
	System.out.println(createNewFile);
	boolean directory = f.isDirectory();
	System.out.println(directory);
	boolean file = f.isFile();
	System.out.println(file);
	boolean canRead = f.canRead();
	System.out.println(canRead);
	File mk=new File("C:\\\\Users\\\\USER\\\\Desktop\\\\js.txt");
	FileUtils.Write(mk, "gyxaiakaka\n",true);
FileUtils.Write(mk, "ytiolkkoo\n",true);
	
}
}
