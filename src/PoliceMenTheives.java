



/*
Policemen catch thieves:
Q.Given an array of size n that has the following specifications:

Each element in the array contains either a policeman or a thief.
Each policeman can catch only one thief.
A policeman cannot catch a thief who is more than K units away from the policeman.
We need to find the maximum number of thieves that can be caught.

Examples:

Input : arr[] = {'P', 'T', 'T', 'P', 'T'},
            k = 1.
Output : 2.
Here maximum 2 thieves can be caught, first
policeman catches first thief and second police-
man can catch either second or third thief.

Input : arr[] = {'T', 'T', 'P', 'P', 'T', 'P'},
            k = 2.
Output : 3.

Input : arr[] = {'P', 'T', 'P', 'T', 'T', 'P'},
            k = 3.
Output : 3.
 */




import java.util.*;

class PoliceMenTheives {
    public static void main (String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        ArrayList<String> al=new ArrayList<String>();
        for(int i=0;i<n;i++){
            al.add(sc.nextLine());
        }

        int k=sc.nextInt();
        int c=0;
        int p=0;
        for(int i=0;i<al.size();i++){
            if(al.get(i).equals("P")){
                int s=k+i+1;
                c=0;
                if(s<al.size()){
                    for(int j=i+1;j<k+i+1;j++){
                        if(al.get(j).equals("T")){
                            c=1;
                            p=p+1;
                            break;
                        }
                    }

                }
                if(c!=1){
                    s=Math.abs(k-i);
                    if(s>=0){
                        for(int l=i-1;l>=Math.abs(k-i);l--){
                            if(al.get(l).equals("T")){
                                p=p+1;
                                break;
                            }
                        }
                    }
                }
            }

        }
        System.out.println(p);
    }
}