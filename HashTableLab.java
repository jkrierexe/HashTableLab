import java.util.LinkedList;


public class HashTableLab{
    public static void main(String[] args){
        LinkedList[] hashTable = new LinkedList[37];
        for(int i=0; i<hashTable.length; i++){
            hashTable[i] = new LinkedList();
        }
        int[] arr = new int[50];
        for(int i=0; i<hashTable.length; i++){
            hashTable[i] = new LinkedList();
        }
        for(int i=0; i<arr.length; i++){
            int m = (int)(Math.random() * 100+1);
            arr[i] = m;
        }
        for(int i=0; i<arr.length; i++){
            Integer num = arr[i];
            hashTable[num.hashCode()%37].add(num);
        }
        for(LinkedList list : hashTable){
            for(Object thing: list){
                System.out.print(thing + " --> ");
            }
            System.out.println();
        }
    }
}
