/*
 *	Author: Jeongtae Seo
 *  Date: 10/01/26
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		System.out.println("Welcome to the ASCII Museum!");
		System.out.println("Please select what exhibit you'd like to view.");
		System.out.println("1. Game");
		System.out.println("2. Cloth");
		System.out.println("3. Instrument");
		
		Scanner sc = new Scanner(System.in);

		String exhibit = sc.nextLine();

		if(exhibit.equals("game") || exhibit.equals("Game")){
		System.out.println("--- GAMES ---");
		System.out.println("1. Pokemon");
		System.out.println("2. Zelda");
		System.out.print("Which piece? ");
		
		String games = sc.nextLine();
		
		if(games.equals("Pokemon")){
			System.out.println("                  .\"-,.__");
			System.out.println("                 `.     `.  ,");
			System.out.println("               .--'  .._,'\"-' `.");
			System.out.println("              .    .'         `'");
			System.out.println("              `.   /          ,'");
			System.out.println("                `  '--.   ,-\"'");
			System.out.println("                 `\"`   |  \\");
			System.out.println("                    -. \\, |");
			System.out.println("                     `--Y.'      ___.");
			System.out.println("                          \\     L._, \\");
			System.out.println("                   _.,     `.   <  <\\                _");
			System.out.println("                 ,' '        `, `.   | \\            ( `");
			System.out.println("              ../, `.          `  |    .\\`.           \\ \\_");
			System.out.println("             ,' ,..  .           _.,'    ||\\l            )  '\".");
			System.out.println("           , ,'   \\           ,'.-.`-._,'  |           .  _._`.");
			System.out.println("         ,' /      \\ \\        `' ' `--/   | \\          / /   ..\\");
			System.out.println("       .'  /        \\ .         |\\__ - _ ,'` `        / /     `.`.");
			System.out.println("       |  '          ..         `-...-\"  |  `-'      / /        . `.");
			System.out.println("       | /           |L__           |    |          / /          `. `.");
			System.out.println("      , /            .   .          |    |         / /             ` `");
			System.out.println("     / /          ,. ,`._ `-_       |    |  _   ,-' /               ` \\");
			System.out.println("    / .           \\\"`_/. `-_ \\_,.  ,'    +-' `-'  _,        ..,-.    \\`.");
			System.out.println("   .  '         .-f    ,'   `    '.       \\__.---'     _   .'   '     \\ \\");
			System.out.println("  ' /          `.'    l     .' /          \\..      ,_|/   `.  ,'`     L`");
			System.out.println("  |'      _.-\"\"` `.    \\ _,'  `            \\ `.___`.'\"`-.  , |   |    | \\");
			System.out.println("  ||    ,'      `. `.   '       _,...._        `  |    `/ '  |   '     .|");
			System.out.println("  ||  ,'          `. ;.,.---' ,'       `.   `.. `-'  .-' /_ .'    ;_   ||");
			System.out.println("  || '              V      / /           `   | `   ,'   ,' '.    !  `. ||");
			System.out.println("  ||/            _,-------7 '              . |  `-'    l         /    `||");
			System.out.println("  . |          ,' .-   ,' ||               | .-.        `.      .'     ||");
			System.out.println("   `'        ,'    `\".'    |               |    `.        '. -.'       `'");
			System.out.println("            /      ,'      |               |,'    \\-.._,.'/");
			System.out.println("            .     /        .               .       \\    .''");
			System.out.println("          .`.    |         `.             /         :_,'.'");
			System.out.println("            \\ `...\\   _     ,'-.        .'         /_.-'");
			System.out.println("             `-.__ `,  `'   .  _.>----''.  _  __  /");
			System.out.println("                  .'        /\"'          |  \"'   '_");
			System.out.println("                 /_|.-'\\ ,\".             '.'`__'-( \\");
			System.out.println("                   / ,\"'\"\\,'               `/  `-.|\"");
		}
		else if(games.equals("Zelda")){
    		System.out.println("                                    /@");
    		System.out.println("                     __        __   /\\/");
    		System.out.println("                    /==\\      /  \\_/\\/   ");
    		System.out.println("                  /======\\    /\\__ \\__");
    		System.out.println("                /==/\\  /\\==\\    /\\_|__ \\");
    		System.out.println("             /==/    ||    \\=\\ / / / /_/");
    		System.out.println("           /=/    /\\ || /\\   \\=\\/ /     ");
    		System.out.println("        /===/   /   \\||/   \\   \\===\\");
   			System.out.println("      /===/   /_________________ \\===\\");
    		System.out.println("   /====/   / |                /  \\====\\");
    		System.out.println(" /====/   /   |  _________    /  \\   \\===\\    THE LEGEND OF");
    		System.out.println(" /==/   /     | /   /  \\ / / /  __________\\_____      ______       ___");
    		System.out.println("|===| /       |/   /____/ / /   \\   _____ |\\   /      \\   _ \\      \\  \\");
    		System.out.println(" \\==\\             /\\   / / /     | |  /= \\| | |        | | \\ \\     / _ \\");
    		System.out.println(" \\===\\__    \\    /  \\ / / /   /  | | /===/  | |        | |  \\ \\   / / \\ \\");
    		System.out.println("   \\==\\ \\    \\\\ /____/   /_\\ //  | |_____/| | |        | |   | | / /___\\ \\");
    		System.out.println("   \\===\\ \\   \\\\\\\\\\/   /////// /|  _____ | | |        | |   | | |  ___  |");
    		System.out.println("     \\==\\/     \\\\\\\\/ / //////   \\| |/==/ \\| | |        | |   | | | /   \\ |");
    		System.out.println("     \\==\\     _ \\\\/ / /////    _ | |==/     | |        | |   | | | |   | |");
    		System.out.println("       \\==\\  / \\ / / ///      /|\\| |_____/| | |_____/| | |_/ /   | |   | |");
    		System.out.println("       \\==\\ /   / / /________/ |/_________|/_________|/_____/   /___\\ /___\\");
   		 	System.out.println("         \\==\\  /               | /==/");
    		System.out.println("         \\=\\  /________________|/=/    OCARINA OF TIME");
   			System.out.println("           \\==\\     _____     /==/");
    		System.out.println("          / \\===\\   \\   /   /===/");
  			System.out.println("         / / /\\===\\  \\_/  /===/");
   			System.out.println("        / / /   \\====\\ /====/");
   			System.out.println("       / / /      \\===|===/");
   			System.out.println("       |/_/         \\===/");
  			System.out.println("                      =");

		}
		}
        else if(exhibit.equals("cloth") || exhibit.equals("Cloth")){
		System.out.println("--- CLOTHES ---");
		System.out.println("1. Supreme");
		System.out.println("2. Nike");
		System.out.print("Which piece?");

        String clothes = sc.nextLine();

        if(clothes.equals("Supreme")){
            System.out.println("       ______________________________________________");
            System.out.println("      |SUPREME.SUPREME.SUPREME.SUPREME.SUPREME.SUPREM|");
            System.out.println("      |. . . . . . . .|||. . . . . ||| . . . . . . . |");
            System.out.println("      | . . . . . . . ||| . . . . .|||. . . . . . . .|");
            System.out.println("      |._._._. . . . .|||. . . . . ||| . .. . . ._._.|");
            System.out.println("      |/     \\. . . . /// . . . . . \\\\\\ . . . ./    \\|");
            System.out.println("      |       |. . . /// . . . . . . \\\\\\ . . .|      |");
            System.out.println("      |        \\. . /// . . . . . . . \\\\\\ . ./       |");
            System.out.println("       \\        |. /// . . . . . . . . \\\\\\ .|        /");
            System.out.println("        |        \\\\/// . . . . . . . . . \\\\\\/        |");
            System.out.println("         \\        \\/ . . . . . . . . . . \\/        /");
            System.out.println("          |        |. . . . . . . . . . .|        |");
            System.out.println("           \\        \\. . . . . . . . . ./        /");
            System.out.println("            |        \\. . . . . . . . ./        |");
            System.out.println("             \\        \\. . . . . . . ./        /");
            System.out.println("              \\        |- - - - - - -|        /");
            System.out.println("               `-.____/_______________\\____.-'");
        }
        else if(clothes.equals("Nike")){
            System.out.println("              ._      _.");
            System.out.println("             /  `\"\"\"\"`  \\");
            System.out.println("        .-\"\"`'-..____..-'`\"\"-.");
            System.out.println("      /`\\                    /`\\");
            System.out.println("    /`   |                  |   `\\");
            System.out.println("   /`    |    Tuffer Guy    |    `\\");
            System.out.println("  /      |                  |      \\");
            System.out.println(" /       /      Josh's      \\       \\");
            System.out.println("/        |                  |        \\");
            System.out.println("`-._____.|    T-shirts:     |._____.-'");
            System.out.println("         |                  |");
            System.out.println("         |                  |");
            System.out.println("         |                  |");
            System.out.println("         \\                  |");
            System.out.println("         /                  |");
            System.out.println("         |                  \\");
            System.out.println("         |                  |");
            System.out.println("         '._              _.'");
            System.out.println("            `\"\"--------\"\"`");
        }
        }
		else if(exhibit.equals("instrument") || exhibit.equals("Instrument")){
		System.out.println("--- INSTRUMENTS ---");
		System.out.println("1. Guitar ");
		System.out.println("2. Concert");
		System.out.print("Which piece?");
		
		String instruments = sc.nextLine();
		
		if(instruments.equals("Guitar")){
            System.out.println("                                      /   )");
            System.out.println("                                     @| ?\\");
            System.out.println("       ._-_.    _____________________@| ?\\\\");
            System.out.println("      +|\\G/|+  | ____________________@| ?\\\\\\");
            System.out.println("      +|\\./|+  || O  o o o  =|=  |  =@| ?\\\\\\\\");
            System.out.println("      +|\\./|+  || O  o o o   |  =|=  | -- ====");
            System.out.println("       `|H|'   ||______________________||\\ \\\\\\");
            System.out.println("        |a|    |________________________| \\ \\\\\\");
            System.out.println("        |H|    ||MM88MM<<<?<<<XHHHHMMMM||  \\  \\\\\\");
            System.out.println("        |a|    ||M88MM<<<?<<<XHHHMMMMMM||   \\  \\\\\\");
            System.out.println("        |H|    ||88MM<<<?<<<XHHHMMMMMMM||    \\  \\\\\\");
            System.out.println("        |a|    ||8MM<<<?<<<XHHHHMMMMMMM||     \\  \\\\\\");
            System.out.println("        |H|    ||MM<<<?<<<XHHHHMMMMMMMM||      \\  \\\\\\");
            System.out.println("        |H|    ||M<<<?<<<XHHHHMMMMMMMMM||       \\  \\\\\\");
            System.out.println("  _-_   |H|   _-_<<<?<<<XHHHHMMMMMMMMMM||        \\  \\\\\\");
            System.out.println(" /   \\  |H|  /   \\<?<<<XHHHHMMMMMMMMMMM||         \\  \\\\\\");
            System.out.println(" |    \\_|a|_/    |?<<<XHHHHMMMMMMMMMMMM||          \\  \\\\\\");
            System.out.println(" \\      |H|      /<<<XHHHHMMMMMMMMMMMMR||    =_     \\  \\\\\\   _");
            System.out.println("  \\     |H|     /<<<XHHHHMMMMMMMMMMMRMM||   || |     \\  \\\\\\  ||\\");
            System.out.println("   |    '\"'    |<<<XHHHHMMMMMMMMMMMRMM8||   | | \\   // \\\\\\\\ /  \\");
            System.out.println("  /     ===     \\<XHHHHMMMMMMMMMMMRMM8R||    | |  \\-    \\\\\\\\   |");
            System.out.println(" /      ===   !  \\HHHHMMMMMMMMMMMRMM8RM||     \\ \\       \\\\\\\\\\ \\");
            System.out.println("|             | o |HMMMMMMMMMMMMMM988MM||        \\\\       \\\\\\\\  \\");
            System.out.println("|      +---+ /  o |MMMMMMMMMMMMMM988MM<||          \\\\      \\\\\\\\   \\");
            System.out.println("\\       ___ /  o  /M/MMMMMRMMMRMM88MM<<||           \\ \\     \\\\\\\\     \\");
            System.out.println(" \\     |HHH|    l/MMMMMMMRMMMRMM88MM<<<||           | |     \\\\\\\\\\     \\");
            System.out.println("  `-_   \\_/   _-MMRMMMMMRMMMRMM88MM<<<?||           | |       \\\\\\\\   (O \\");
            System.out.println("     \"\"\"\"\"\"\"\"' ~~~V~~\"\"~~~~~~~~~~~~~~V~~~           \\ \\      <o=====o    |");
            System.out.println("                                                     \\ \\              (O |");
            System.out.println("                                                       \\\\                /");
            System.out.println("                                                         \\\\_            /");
            System.out.println("                                                            --_______--");

		}
        else if(instruments.equals("Concert")){
            System.out.println("__                                        __ ");
            System.out.println("                |--|                                      |--|");
            System.out.println("     .._       o' o'                     (())))     _    o' o'");
            System.out.println("    //\\\\\\    |  __                      )) _ _))  ,' ; |  __  ");
            System.out.println("   ((-.-\\)  o' |--|  ,;::::;.          (C    )   / /^ o' |--| ");
            System.out.println("  _))'='(\\-.  o' o' ,:;;;;;::.         )\\   -'( / /     o' o'");
            System.out.println(" (          \\       :' o o `::       ,-)()  /_.')/                 .");
            System.out.println(" | | .)(. |\\ \\      (  (_    )      /  (  `'  /\\_)    .:izf:,_  .  |");
            System.out.println(" | | _   _| \\ \\     :| ,==. |:     /  ,   _  / 1  \\ .:q568Glip-, \\ |");
            System.out.println(" \\ \\/ '-' (__\\_\\____::\\`--'/::    /  /   / \\/ /|\\  \\-38'^\"^`8k='  \\L,");
            System.out.println("  \\__\\\\[][]____(_\\_|::,`--',::   /  /   /__/ <(  \\  \\8) o o 18-'_ ( /");
            System.out.println("   :\\o*.-.(     '-,':   _    :`.|  L----' _)/ ))-..__)(  J  498:- /]");
            System.out.println("   :   [   \\     |     |=|   '  |\\_____|,/.' //.   -38, 7~ P88;-'/ /");
            System.out.println("   :  | \\   \\    |  |  |_|   |  |    ||  :: (( :   :  ,`\"\"'`-._,' /");
            System.out.println("   :  |  \\   \\   ;  |   |    |  |    \\ \\_::_)) |  :  ,     ,_    /");
            System.out.println("   :( |   /  )) /  /|   |    |  |    |    [    |   \\_\\      _;--==--._ ");
            System.out.println("MJP:  |  /  /  /  / |   |    |  |    |    Y    |CJR (_\\____:_        _:");
            System.out.println("   :  | /  / _/  /  \\   |lf  |  |  CJ|mk  |    | ,--==--.  |_`--==--'_|");
            System.out.println("                                                         \"   `--==--'"); 
                }
            }
        }
    }