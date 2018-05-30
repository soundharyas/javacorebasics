
package com.basic;

public class conditions {
     public static void main(String []args ) {
       int j,k;
outer:  for(j=0; j<6; j++) {
inner:	for(k=0; k<5; k++) {
			if(k == 1) {
				continue outer;
			}
          if(k == 3) {
        	  continue inner;
          }
          System.out.println(+j+","+k);
}
}
}
}

