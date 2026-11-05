

//
//  Class author:  Zaid Zamani
//  Date created:  10/28/26
//  General description: Pattern generator
//

public class Pattern {



   public static void main(String []args) {
    
   }
   
   
   
    // precondition: rows is more than 0 and int
    // postcondition: it prints a triangle of stars
    public static void stars(int rows){
    int currentRow = 1;
    int amount = 1;
    while(currentRow <= rows){
        int count = 1;
        while (count <= amount) {
            System.out.printf("*");
            count++;
        }
        System.out.printf("\n");
        amount+=2;
        currentRow++;
    }
   }
    
    // precondition: rows must be greater than 0 and int
    // postcondition: makes a triangle of numbers
    public static void triangle(int rows){
    int i = 1;
    while (i <= rows) {
        int j = 1;
        while (j <= i){
            System.out.printf("%d",i);
            j++;
        }
        i++;
        System.out.printf("\n");
    }
   }

    // precondition: maxE must be greater than 0 and int
    // postcondition: makes a pattern of E and O, in a pyramid shape 
    public static void eo(int maxE){
    for(int row = 1; row<= maxE; row++){
        char letter =(maxE + row) % 2 == 0? 'E' : 'O'; // learned ternary operator // we start at maxE because we want to inherent the odd or even from the the maxE
        for(int i = 1; i <= row; i++){
            System.out.print(letter);
        }

        System.out.println();
    }

    for(int row = maxE - 1; row>= 1; row--){
        char letter = (maxE + row) % 2 == 0 ? 'E' :'O';
            for(int i=1; i <=row; i++){
            System.out.print(letter);
        }

    System.out.println();
    }
   }

    // precondition: rows must be greater than 0 and int
    // postcondition: makes a pyramid of numbers
    public static void pyramid(int rows){
    for(int row = 1; row <= rows; row++){
        for(int space = 1; space < row; space++){
            System.out.print(" "); // add spaces at the beggining 
        }
        for(int i =1; i<= 2 * (rows- row) +1; i++){ 
            System.out.print(row);
        }
        System.out.println();
    }
   }

    // precondition: start must be greater than 0 and int   
    // postcondition: makes a pattern of odd numbers in a triangle shape
    public static void odds(int start){
    for(int i = start; i>0; i-=1 ){
        if((i % 2) != 0 ){
        for(int j = 0; j<i; j++){
            System.out.print(i);
        }
        System.out.println();
        }
        
    }
   }

}