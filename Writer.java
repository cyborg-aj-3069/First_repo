import java.io.FileWriter;  
public class Writer{  
    public static void main(String args[]){    
         try{    
           FileWriter fw=new FileWriter("C:\Users\ABHISHEK JHA\Desktop\practicals\newfile.txt");    
           fw.write("Welcome to the new World");    
           fw.close();    
          }catch(Exception e){System.out.println(e);}    
          System.out.println("Success...");    
     }    
} 
