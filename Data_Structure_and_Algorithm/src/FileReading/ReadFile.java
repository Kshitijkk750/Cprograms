package FileReading;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ReadFile {
	void readFile(){
        int i;
        //try with resource
        try(FileInputStream fin=new FileInputStream("/home/dell/CDAC_JAVA/ifelse.java")){
        do{
            i=fin.read();
            System.out.print((char)i);
        }
        while(i!=-1);//eof
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
			 }
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ReadFile f= new ReadFile();
		f.readFile();
	}

}
