import java.io.*;

public class SwapTest {

  //Main method
  public static void main(String[] args) throws Exception {
    String string1="One.";
    String string2="Two.";
    System.out.println("Before futileSwap:");
    System.out.println(string1+string2);
    futileSwap(string1,string2);
    System.out.println("After futileSwap:");
    System.out.println(string1+string2);

    StringBuffer stringBuffer1=new StringBuffer("Eins.");
    StringBuffer stringBuffer2=new StringBuffer("Zwei.");
    System.out.println("Before improvedSwap:");
    System.out.println(""+stringBuffer1+stringBuffer2);
    improvedSwap(stringBuffer1,stringBuffer2);
    System.out.println("After improvedSwap:");
    System.out.println(""+stringBuffer1+stringBuffer2);

  }

  private static void futileSwap(String s1, String s2) {
    String temp=s1;
    s1=s2;
    s2=temp;
  }

  private static void improvedSwap(StringBuffer s1, StringBuffer s2) {
    String string1=new String(s1);
    String string2=new String(s2);
    s1.replace(0,s1.length(),string2);
    s2.replace(0,s2.length(),string1);
  }

}