package assignment.assignment3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class PingWebsite {

    // method for finding the ping statics of website
   static void readCommandLine(ArrayList<String> commandList) throws IOException {

       // creating the sub process, execute system command
       ProcessBuilder build = new ProcessBuilder(commandList);
       Process process = build.start();

       BufferedReader input = new BufferedReader(new InputStreamReader
               (process.getInputStream()));

       BufferedReader error = new BufferedReader(new InputStreamReader
               (process.getErrorStream()));

       System.out.println("Standard output: ");
       System.out.println(readData(input));

       System.out.println("error (if any): ");
       System.out.println(readData(error));

   }

   static String readData(BufferedReader inputReader) throws IOException {

       StringBuffer storeData = new StringBuffer();

       String readStr = null;

       while((readStr = inputReader.readLine()) != null ){

           storeData.append(readStr+"\n");
       }

       return new String(storeData);
   }

    public static void main(String[] args) throws IOException {

       ArrayList<String> commandList = new ArrayList<>();

       commandList.add("ping");
       commandList.add("www.google.com");

       readCommandLine(commandList);
    }
}
