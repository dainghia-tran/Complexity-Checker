// the main class that contains the back-end services

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors

import java.util.*;

enum MODE{
  JAVA,
  CPP
}

public class backend{
  public static void main(String[] args){
    long res;
    //String testPath = "cppTestCode.cpp";
    String testPath = "javaTestCode.java";
    List<String> words = ReadFile.read(testPath);

    try{
      String[] tokens = testPath.split("\\.");
      if (tokens[tokens.length - 1].equals("java"))
        res = check(words, MODE.JAVA);
      else if (tokens[tokens.length - 1].equals("cpp"))
        res = check(words, MODE.CPP);
      else
        throw new RuntimeException("Wrong file extension.");
    }catch(RuntimeException s){
      System.out.println(s);
    }
  }

  public static long check(List<String> myProgram, MODE myMode){
      //by size
      long Cs = MeasureTools.bySize(myProgram, myMode);
      System.out.println("Cs = " + Cs);

      long Cv = 0;

      long Cm = 0;
      
      long Ci = 0;
      
      long Ccp = 0;

      long Ccs = 0;

      return Cs + Cv + Cm + Ci + Ccp + Ccs;
  }
}

class MeasureTools {
// contains all the methods to measure a program complexity
    static String[] javaReservedKeywords = {"abstract", "assert", "boolean",
            "break", "byte", "case", "catch", "char", "class", "const",
            "continue", "default", "do", "double", "else", "extends", "false",
            "final", "finally", "float", "for", "goto", "if", "implements",
            "import", "instanceof", "int", "interface", "long", "native",
            "new", "null", "package", "private", "protected", "public",
            "return", "short", "static", "strictfp", "super", "switch",
            "synchronized", "this", "throw", "throws", "transient", "true",
            "try", "void", "volatile", "while"};
    String[] cppReservedKeywords = {"and", "double", "not_eq", "throw", 
            "and_eq", "dynamic_cast", "operator", "true", "asm", "else", "or", 
            "try", "auto", "enum", "or_eq", "typedef", "bitand", "explicit", 
            "private", "typeid", "bitor", "extern", "protected", "typename", 
            "bool", "false", "public", "union", "break", "float", "register", 
            "unsigned", "case", "for", "reinterpret-cast", "using", "catch", 
            "friend", "return", "virtual", "char", "goto", "short", "void", 
            "class", "if", "signed", "volatile", "compl", "inline", "sizeof", 
            "wchar_t", "const", "int", "static", "while", "const-cast", "long", 
            "static_cast", "xor", "continue", "mutable", "struct", "xor_eq", 
            "default", "namespace", "switch", "", "delete", "new", "template", 
            "", "do", "not", "this"};

    static long bySize(List<String> myProgram, MODE myMode){
    // mesures the program complexity by its size
    char Weight = 1;
    
    long Nkw = MeasureTools.countKeywords(myProgram, myMode);

    return Weight * Nkw;
    }


    // for bySize method
    static long countKeywords(List<String> myProgram, MODE myMode){
      long result = 0;
      String[] reservedKeywords;
      if (myMode == MODE.JAVA)
        reservedKeywords = MeasureTools.javaReservedKeywords;
      else
        reservedKeywords = MeasureTools.javaReservedKeywords;

      for (String aWord : myProgram) {
        if (Arrays.asList(reservedKeywords).contains(aWord)){
          result++;
        }
      }

      return result;
    }

}

class ReadFile {
// handles file reading
    static List<String> read(String myPath) {
      String[] eliminatedChars = {"\\[", "]", "\\{", "}", " "};

      try {
        File myObj = new File(myPath);
        Scanner myReader = new Scanner(myObj);
        List<String> arrList = new ArrayList<String>();;

        while (myReader.hasNextLine()) {
          String line = myReader.nextLine();
          String[] words = line.split("[ \\n\\{}\\[\\]\\()]");
          for (String word : words) {
            if (!word.equals(""))
              arrList.add(word);
          }
        }

        myReader.close();
        return arrList;
      } catch (FileNotFoundException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
        return null;
      }
    }
}