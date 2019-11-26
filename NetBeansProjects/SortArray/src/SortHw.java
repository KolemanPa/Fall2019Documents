
import java.util.Stack;
import java.io.*; 
import java.util.*; 

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author theko
 */
public class SortHw<E> {

    /**
     * @param args the command line arguments
     */

    
       public static <E extends Comparable<E>>void sort(ArrayList<E> list){
        
            boolean sort = false;
            E temp;
        
        for(int i = 0; i< list.size();i++){
            while (!sort){
             temp = list.get(i);
             if(temp >list.get(i)){
                 
             }
            }
        }
    }
    
    
        public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList(Arrays.asList(1,2,3,4,5,6,23,14,15,75,432,63,13,8));
        
        shuffle(list);
        
        System.out.println(list);
    }
}
