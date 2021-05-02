package GdP2;


import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
public class DUDE3 {

	public String BeginningPath;
	
	public DUDE3(String BeginnigPath) {
		this.BeginningPath = BeginnigPath;
	}
	
	public void setBeginningPath(String input) {
		this.BeginningPath=input;
	}
	 public void createPath() {
		 
		 String path = "";
		 try {
		
		 System.out.print("Enter file name (enter /name to create a new direction) : ");
			 BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
			 path = this.BeginningPath+input.readLine().toString();
			 System.out.println();
			 System.out.println(path);
			 System.out.println();
			 
			 }
		
			 catch(Exception e) {
				 System.out.print("Undetected failure "+e);
			 }
		 
		 File file = new File(path); 
		 boolean created = file.mkdir();
		 boolean existAlready = file.exists();
		 if(created) {
			 System.out.println("File created succesfully");
			 System.out.println();
			 System.out.println();
			 this.BeginningPath=path;
		 }
		 else if(!created && existAlready) {
			 System.out.println("File exist Already! \nPlease try an other path.");
		 }
			 else {
				 System.out.println("Pleas only use letters and numbers and use '/' to create a new path!");
				 
			 }
		 
		 }
	 
	 public void copyFileTo() {
		 
		 String pathTarget = "";
		 try {
			 System.out.print("Enter the target path, where you want to copy the file : ");
			 
			 BufferedReader input2 = new BufferedReader(new InputStreamReader(System.in));
			 pathTarget = input2.readLine().toString();
			 
			 
			 BufferedReader br = new BufferedReader(new FileReader(this.BeginningPath));
			 BufferedWriter bw = new BufferedWriter(new FileWriter(pathTarget));
			 String writing;
			 while((writing = br.readLine()) != null) {
				 bw.write(writing + "\n");
			 }
	
		 br.close();
		 bw.close();
		 }
		 catch(Exception e) {
			 System.out.print("Undetected failure "+e);
		 }
	 }
	 
	 public void printOutFileDetails() {
		 File file = new File(this.BeginningPath);
		 SimpleDateFormat sdf = new SimpleDateFormat("mm/dd/yyyy");
		 
		 System.out.println(pfad);
		 System.out.println();
		 
		 if(file.exists()) {
			 System.out.println("File does exist");
			 System.out.println();
		 }
		 else {
			 System.out.println("File does not exist");
			 System.out.println();
		 }
		 
		 long lastModifiedDay = file.lastModified();
		System.out.println("Last modified day : "+sdf.format(lastModifiedDay));
		 System.out.println();
		 
		 long fileSize = file.length();
		 System.out.println("File size : "+ fileSize+" Bytes");
		 System.out.println();
		 if(file.canExecute()) {
			 System.out.println("File executing: granted");
			 System.out.println();
		 }
		 else {
			 System.out.println("File executing: denied");
			 System.out.println();
		 }
		 if(file.canRead()) {
			 System.out.println("Reading: granted");
			 System.out.println();
		 }
		 else {
			 System.out.println("Reading: denied");
			 System.out.println();
			 }
		 if(file.canWrite()) {
			 System.out.println("Writing: granted");
			 System.out.println();
		 }
		 else {
			 System.out.println("Writing: denied");
			 System.out.println();
			 }
	 }
	 

	 }


