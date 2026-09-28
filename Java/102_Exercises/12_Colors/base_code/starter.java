/*
 *	Author: Jeongtae Seo
 *  Date: 09/22/26
 *	Collaborator(s): Julian Seo
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
        int r = ((int)(Math.random()*256));
        int g = ((int)(Math.random()*256));
        int b = ((int)(Math.random()*256));

        int complementaryR = 255 - r;
        int complementaryG = 255 - g;
        int complementaryB = 255 - b;

        int darkR = ((int)(Math.random() * 128));
        int darkG = ((int)(Math.random() * 128));
        int darkB = ((int)(Math.random() * 128));

        int lightR = ((int)(Math.random() * 128 + 128));
        int lightG = ((int)(Math.random() * 128 + 128));
        int lightB = ((int)(Math.random() * 128 + 128));

        int bluerR = ((int)(Math.random() * 128));
        int bluerG = ((int)(Math.random() * 128));
        int bluerB = ((int)(Math.random() * 128 + 128));

        int myR = ((int)(Math.random() * 151 + 67));
        int myG = ((int)(Math.random() * 101 + 41));
        int myB = ((int)(Math.random() * 101 + 100));

        System.out.println("Complementary Colors");
        getColor(r,g,b);
        getColor(complementaryR, complementaryG, complementaryB);
        
        System.out.println("Triadic Colors");
        getColor(r, g, b);
        getColor(b, r, g);
        getColor(g, b, r);
        
        System.out.println("Dark Color");
        getColor(darkR, darkG, darkB);
        
        System.out.println("Light Color");
        getColor(lightR, lightG, lightB);

        System.out.println("Bluer Color");
        getColor(bluerR, bluerG, bluerB);

        System.out.println("My Own Color:");
        getColor(myR, myG, myB);




	}

	public static void getColor(int red, int green, int blue){
        String startColor = "\u001B[48;2;" + red + ";" + green + ";" + blue + "m";
        String resetColor = "\u001B[0m";
        String swatch = startColor + "                    " + resetColor;
        System.out.println(swatch);
    }
}
