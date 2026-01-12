// a
// ab
// abc
// abcd
// abcde

class Q73 {
    public static void main(String[] args) {

        for (char ch='a'; ch<='e'; ch++) {
            for (char j='a'; j<=ch; j++) {
               System.out.print(j);
                
         }
               System.out.println();
        }
       }
     }