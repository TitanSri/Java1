/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 
 * @author Toby Sriratanakoul
 */
public class Chapter1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[]args){
        System.out.println("Welcome to Java!");
        System.out.println("Learnign Java Now!");
        System.out.println("Programming is fun!");
        System.out.println(" j   a   v   v  a");
        System.out.println(" j  aaa   v v  aaa");
        System.out.println("jj  a a    v   a a");
        System.out.println("a   a^2 a^3 a^4");
        System.out.println("1   1   1   1");
        System.out.println("2   4   8   16");
        System.out.println("3   9   27  81");
        System.out.println((7.5 * 6.5 - 4.5 * 3) / (47.5 - 5.5));
        System.out.println(1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10);
        System.out.println(4 * (1 - (1/3) + (1/5) - (1/7) + (1/9) - (1/11)));
        System.out.println(4.0 * (1.0 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11)));
        System.out.print("The first year is:");
        System.out.println((52560 * 8.5) + 312032486);
        System.out.print("The second year is:");
        System.out.println(312032486 + (2 * (52560 * 8.5)));
        System.out.print("The third year is:");
        System.out.println(312032486 + (3 * (52560 * 8.5)));
        System.out.print("The fourth year is:");
        System.out.println(312032486 + (4 * (52560 * 8.5)));
        System.out.print("The fifth year is:");
        System.out.println(312032486 + (5 * (52560 * 8.5)));
        System.out.println("Miles / (hour + (minutes / 60) + (seconds / 3600)) * 1.6(kilometers)");
	System.out.println("24    / (1    + (40      / 60) + (35      / 3600))  * 1.6");
        System.out.println(24 / (1.0 + (40.0 / 60) + (35.0 / 3600)) * 1.6);
        /*
        (Algebra: solve 2 * 2 linear equations) You can use Cramer’s rule to solve the following
        2 * 2 system of linear equation:
		ax + by = e   x = 	ed - bf	  y = af - ec
		cx + dy = f       	ad - bc       ad - bc
        Write a program that solves the following equation and displays the value for x and y:
					3.4x + 50.2y = 44.5
					2.1x + .55y = 5.9
        */
        System.out.println("3.4x + 50.2y = 44.5");
        System.out.println("2.1x +  .55y =  5.9");
        System.out.println("x = (44.5 * .55) - (50.2 * 5.9)");
        System.out.println("    ----------------------------");
        System.out.println("    (3.4  * .55) - (50.2 * 2.1)");
        System.out.println((((44.5 * .55) - (50.2 * 5.9)) / 
                                                 ((3.4 * .55) - (50.2 * 2.1))));
        System.out.println(" ");
        System.out.println("y = (3.4 * 5.9) - (44.5 * 2.1)");
        System.out.println("    --------------------------");
        System.out.println("    (3.4 * .55) - (50.2 * 2.1)");
        System.out.println((((3.4 * 5.9) - (44.5 * 2.1)) /
                                                ((3.4 * .55) - (50.2 * 2.1))));
        int i, j, k, t;
        i = j = k = 2;
        System.out.println( i + " " + j + " " + k);
        System.out.println(t = 1);
        double miles, kilometers, KILOMETERS_PER_MILE;
        miles = 100;
        KILOMETERS_PER_MILE = 1.609;
        kilometers = miles * KILOMETERS_PER_MILE;
        System.out.println(kilometers);
        System.out.println(2 * (5 / 2 + 5 / 2));
        System.out.println(2 * 5 / 2 + 5 / 2);
        System.out.println(2 * (5 / 2));
        System.out.println(2 * 5 / 2);
        System.out.println("25 / 4 is " + 25 / 4);
        System.out.println("25 / 4.0 is " + 25 / 4.0);
        System.out.println("3 * 2 / 4 is " + 3 * 2 / 4);
        System.out.println("3.0 * 2 / 4 is " + 3.0 * 2 / 4);
        /* 5.5 * (r + 2.5) ^ 2.5 + t 
        ^ = exponent power to the base */
        System.out.println(5 * Math.pow(i + 2, 3.5 + t));
        
        System.out.println("+----+");
        System.out.println("|    |");
        System.out.println("+----+");
        
        // Display a single backslash
        System.out.println("   /\\");
        System.out.println("  /  \\");
        System.out.println(" /    \\");
        System.out.println(" ------");
        System.out.println("   ||");
        
        System.out.println("   ||");
        System.out.println(" ------");
        System.out.println(" /    \\");
        System.out.println("  /  \\");
        System.out.println("   /\\");
    }
}

