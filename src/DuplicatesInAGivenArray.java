/*   Q.Find duplicates in a given array when elements are not limited to a range

        Given an array of n integers. The task is to print the duplicates in the given array.
        If there are no duplicates then print -1.


        =>Examples:

        Input: {2, 10,10, 100, 2, 10, 11,2,11,2}
        Output: 2 10 11

        Input: {5, 40, 1, 40, 100000, 1, 5, 1}
        Output: 5 40 1
        Note: The duplicate elements can be printed in any order.*/


import java.util.*;

class DuplicatesInAGivenArray {

        public static void main (String[] args) {
            Scanner sc=new Scanner(System.in);
            int i=0;
            ArrayList<Integer> arr = new ArrayList<Integer>();
            int n=sc.nextInt(); 
            while(arr.size()!=n){

                arr.add(i,sc.nextInt());
                i++;
            }
            int q=1;
            int c=0;
            HashMap<Integer,Integer> h=new HashMap<>();
            for(int j=0;j<arr.size();j++){
                if(h.get(arr.get(j))==null){
                    h.put(arr.get(j),q);

                }
                else{
                    Integer r=h.get(arr.get(j))+1;
                    h.put(arr.get(j),r);
                    c=1;
                }
            }


            if(c==0){
                System.out.print("-1");
            }
            else if(c==1){
                Set<Map.Entry<Integer,Integer>> s=h.entrySet();
                for(Map.Entry<Integer,Integer> d:s){
                    if(d.getValue()>1){
                        System.out.print(d.getKey()+" ");

                    }
                }
            }

        }
    }