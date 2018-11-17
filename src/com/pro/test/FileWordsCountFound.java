package com.pro.test;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;
class FileWordsCountFound{
public static void main(String args[])throws Exception {
HashMap<String,Integer> wordsMap=new HashMap<String,Integer>();
int count=0;
String repeatedValue=null;
BufferedReader bfReader=new BufferedReader(new FileReader("C:\\Users\\Mazeed Sk\\Desktop\\Programs\\IO\\data.txt"));

String currentLine=bfReader.readLine();

while(currentLine!=null){

String words[]=currentLine.toLowerCase().split(" ");

for(String word:words){

if(wordsMap.containsKey(word)){

wordsMap.put(word,wordsMap.get(word)+1);
}
else{
wordsMap.put(word,1);
}
}
currentLine=bfReader.readLine();
}

/*Set<Entry<String, Integer>> entrySet=wordsMap.entrySet();

for(Entry<String, Integer> entry:entrySet){

if(entry.getValue()>count){
count=entry.getValue();
repeatedValue=entry.getKey();
}
}
System.out.println(repeatedValue+"----"+count);
System.out.println(wordsMap);*/

System.out.println(wordsMap);

}
}