package FileIO;
import java.io.*;

public class BufferedOPStreamEg {
    public static void main(String args[])throws Exception{
        // Write
        FileOutputStream fout=new FileOutputStream("C:\\hadoop\\ve.txt");

        BufferedOutputStream bout=new BufferedOutputStream(fout);

        String s="Welcome to Java io package streams.";
        byte b[]=s.getBytes();
        bout.write(b);

        bout.flush();
        bout.close();
        fout.flush();
        fout.close();

        System.out.println("success");
    }
}
