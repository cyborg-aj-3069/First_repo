import java.math.BigInteger; 
import java.security.MessageDigest; 
import java.security.NoSuchAlgorithmException;
import java.util.Scanner; 
  
public class MD5 { 
    public static String Md(String str) 
    { 
try {  MessageDigest md = MessageDigest.getInstance("MD5"); 
byte[] messageDigest = md.digest(str.getBytes()); 
BigInteger no = new BigInteger(1, messageDigest); 
String enc = no.toString(16); 
            while (enc.length() < 32) { 
                enc = "0" + enc; 
            }   return enc; 
        }  
  
        catch (NoSuchAlgorithmException e) { 
            throw new RuntimeException(e); 
        } 
    } 
    public static void main(String args[]) throws NoSuchAlgorithmException 
    { 
	System.out.println("Enter the Text to be Encoded:- ");
	Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();		
    System.out.println("Your MD5 code is: " + Md(s)); 
    } 
} 