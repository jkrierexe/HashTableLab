import java.util.LinkedList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;



public class HashTableLabTwo{
    public static void main(String[] args){
        File file = null;
        Scanner scan = null;
        try{
            file = new File("1000-most-common-words.txt");
            scan = new Scanner(file);
        }catch(Exception e) {
        System.err.println("Could not find file!");
        }       
        LinkedList[] hashTable = new LinkedList[1600];
        for(int i=0; i<hashTable.length; i++){
            hashTable[i] = new LinkedList();
        }
        for(int i=0; i<999; i++){
            String s = scan.nextLine();
            int temp = s.hashCode()%1600;
            if(temp < 0){
                temp += hashTable.length;
            }
            hashTable[temp].add(s);
        }
        for(LinkedList list : hashTable){
            for(Object thing: list){
                System.out.print(thing + " --> ");
            }
            System.out.println();
        }
        for(LinkedList list : hashTable){
            if(list.size()>3){
                System.out.println("\nMore than three collisions at space!");
            }
        }
    }
}
