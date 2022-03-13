package com.company;

//package com.company;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
        HashMap<Character,Integer> myMap=new HashMap<Character,Integer>();
        File inputFile=new File("/home/syedq/Desktop/myrepo/s1.txt");
        FileReader fileReader=new FileReader(inputFile);
        BufferedReader br =new BufferedReader(fileReader);
        int i;
        while ((i=fileReader.read())!=-1){
            Character c=(char) i;
            if(myMap.containsKey(c))
                myMap.put(c, myMap.get(c)+1);
            else
                myMap.put(c,1);
        }
        //System.out.println(myMap);
        File op=new File("output.txt");
        FileWriter outputFile=new FileWriter(op);
        //BufferedWriter bw=new BufferedWriter(outputFile);
        for (Map.Entry<Character,Integer> entry: myMap.entrySet())
            outputFile.write(entry.getKey()+"  "+entry.getValue()+"\n");

        outputFile.close();
    }
}