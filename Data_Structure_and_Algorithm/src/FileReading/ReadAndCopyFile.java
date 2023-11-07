package FileReading;
import java.io.*;
public class ReadAndCopyFile {
    void copyFile(){
        int i;
        try(FileInputStream fin=new FileInputStream("//home//dell//Desktop//IMG-20220310-WA0026.jpg");
                FileOutputStream fout=new FileOutputStream("//home//dell//Desktop//Tourist//kk.png")){
        do{
            i=fin.read();
            fout.write(i);
        }while(i!=-1);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        ReadAndCopyFile cf=new ReadAndCopyFile();
        cf.copyFile();
    }


}
