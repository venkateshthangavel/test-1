package com.company.lockers;

import java.io.File;
import java.io.FileWriter;
import java.util.LinkedList;
import java.util.Scanner;

public class LockedMe
{
static final String projectPath="C:\\Users\\Dell\\Downloads\\JAWA CLASS\\javaphase1_Final project\\CompanyLockersProject\\LockedMeFiles";
private static String fileNames;
	public static void main(String[] args)
	{
	Scanner obj=new Scanner(System.in);
	int ch;
	do 
	{
	displayMenu();
	
	System.out.println("Enter Your Choice:");
	ch=Integer.parseInt(obj.nextLine());
	switch(ch)
	{
	case 1:getAllFiles();
	   break;
	case 2:createFiles();
	  break;
	case 3:deleteFiles();
	  break;
	case 4:searchFiles();
	  break;
	case 5:System.exit(0);
	  break;
	 default:System.out.println("Invalid Option");
	  break;
	  }
	}
	while(ch>0);
	}

public static void displayMenu()
{
	System.out.println("*****************************************************");
	System.out.println("\tWelcome to Company Lockers-LockedMe.com");
	System.out.println("\tDevelopers Name:Venkatesh.T");
	System.out.println("*****************************************************");
	System.out.println("\t1.Display all the files");
	System.out.println("\t2.Add files to existing directory");
	System.out.println("\t3.Delete all the files");
	System.out.println("\t4.Search a file");
	System.out.println("\t5.Exit");
	System.out.println("*****************************************************");
}
public static void getAllFiles()
{
	File[] listOfFiles=new File(projectPath).listFiles();
	//if the folder is empty
	if(listOfFiles.length==0)
		System.out.println("No files exist in the directory");
	else 
	{
		for(File l:listOfFiles)
		{
			System.out.println(l.getName());
		}
	}
}
public static void createFiles()
{
	try
	{
		try (Scanner obj = new Scanner(System.in)) {
			String fileName;
			int linesCount;
			System.out.println("Enter File Name:");
			fileName=obj.nextLine();
			
			System.out.println("eneter How many lines you want to add in files:");
			linesCount=Integer.parseInt(obj.nextLine());
			
			FileWriter fw=new FileWriter(projectPath+"\\"+fileName);
			
			for(int i=1;i<=linesCount;i++)
			{
				System.out.println("Eneter The file content line:");
				fw.write(obj.nextLine()+"\n");
			}
			System.out.println("File Created Successfully");
			fw.close();
		}
	}
	catch(Exception ex)
	{
		System.out.println("Some Error Occured.");
		
		
	}
}
public static void deleteFiles()
{
    try (Scanner obj = new Scanner(System.in)) {
		try
		{
		    System.out.println("Enter File To Be Deleted:");
		  String fileName = obj.nextLine();
		    
		    File fl=new File(projectPath+"\\"+fileName);
		    if(fl.exists())
		    {
		    	fl.delete();
		    	System.out.println("file deleted successfully");
		    }
		    	else
		    	{
		    	System.out.println("File do not exist");
		    	}
		}
		     catch(Exception Ex)
		{
			
		}
	}
}
public static void  searchFiles()
{
	Scanner obj=new Scanner(System.in);
	try
	 {
	    String fileNmae;
	    System.out.println("Enter File To Be Searched:");
	    String fileName = obj.nextLine();
	    
	    File fl=new File(projectPath+"\\"+fileName);
	    if(fl.exists())
	    {
	    	System.out.println("file is Available");
	    }
	    	else
	    	{
	    	System.out.println("File is not Available");
	    	
	    	}
	    
	    }
	   
	catch(Exception Ex)
	{
    }
}
}