package uj.wmii.pwj.introduction;

public class Banner {
    private static final int HEIGHT = 7;
    private static final int SPACE_WIDTH = 4;

    private static final String[][] FONT = {
        {
            "   #   ",
            "  # #  ",
            " #   # ",
            "#     #",
            "#######",
            "#     #",
            "#     #",
        },{
            "###### ",
            "#     #",
            "#     #",
            "###### ",
            "#     #",
            "#     #",
            "###### ",
        },{
            " ##### ",
            "#     #",
            "#      ",
            "#      ",
            "#      ",
            "#     #",
            " ##### ",
        },{
            "###### ",
            "#     #",
            "#     #",
            "#     #",
            "#     #",
            "#     #",
            "###### ",
        },{
            "#######",
            "#      ",
            "#      ",
            "#####  ",
            "#      ",
            "#      ",
            "#######",
        },{
            "#######",
            "#      ",
            "#      ",
            "#####  ",
            "#      ",
            "#      ",
            "#      ",
        },{
            " ##### ",
            "#     #",
            "#      ",
            "#  ####",
            "#     #",
            "#     #",
            " ##### ",
        },{
            "#     #",
            "#     #",
            "#     #",
            "#######",
            "#     #",
            "#     #",
            "#     #",
        },{
            "###",
            " # ",
            " # ",
            " # ",
            " # ",
            " # ",
            "###",
        },{
            "      #",
            "      #",
            "      #",
            "      #",
            "#     #",
            "#     #",
            " ##### ",
        },{
            "#    #",
            "#   # ",
            "#  #  ",
            "###   ",
            "#  #  ",
            "#   # ",
            "#    #",
        },{
            "#      ",
            "#      ",
            "#      ",
            "#      ",
            "#      ",
            "#      ",
            "#######",
        },{
            "#     #",
            "##   ##",
            "# # # #",
            "#  #  #",
            "#     #",
            "#     #",
            "#     #",
        },{
            "#     #",
            "##    #",
            "# #   #",
            "#  #  #",
            "#   # #",
            "#    ##",
            "#     #",
        },{
            "#######",
            "#     #",
            "#     #",
            "#     #",
            "#     #",
            "#     #",
            "#######",
        },{
            "###### ",
            "#     #",
            "#     #",
            "###### ",
            "#      ",
            "#      ",
            "#      ",
        },{
            " ##### ",
            "#     #",
            "#     #",
            "#     #",
            "#   # #",
            "#    # ",
            " #### #",
        },{
            "###### ",
            "#     #",
            "#     #",
            "###### ",
            "#   #  ",
            "#    # ",
            "#     #",
        },{
            " ##### ",
            "#     #",
            "#      ",
            " ##### ",
            "      #",
            "#     #",
            " ##### ",
        },{
            "#######",
            "   #   ",
            "   #   ",
            "   #   ",
            "   #   ",
            "   #   ",
            "   #   ",
        },{
            "#     #",
            "#     #",
            "#     #",
            "#     #",
            "#     #",
            "#     #",
            " ##### ",
        },{
            "#     #",
            "#     #",
            "#     #",
            "#     #",
            " #   # ",
            "  # #  ",
            "   #   ",
        },{
            "#     #",
            "#  #  #",
            "#  #  #",
            "#  #  #",
            "#  #  #",
            "#  #  #",
            " ## ## ",
        },{
            "#     #",
            " #   # ",
            "  # #  ",
            "   #   ",
            "  # #  ",
            " #   # ",
            "#     #",
        },{
            "#     #",
            " #   # ",
            "  # #  ",
            "   #   ",
            "   #   ",
            "   #   ",
            "   #   ",
        },{
            "#######",
            "     # ",
            "    #  ",
            "   #   ",
            "  #    ",
            " #     ",
            "#######",
        }
    };

    public String[] toBanner(String input) {

        if (input == null) return new String[0];

        String s = input.trim().toUpperCase();
        StringBuilder[] rows = new StringBuilder[HEIGHT];
        
        for (int i = 0; i < HEIGHT; i++) rows[i] = new StringBuilder();

        for (int pos = 0; pos < s.length(); pos++) 
        {
            char ch = s.charAt(pos);

            if (ch == ' ')
            {
                for (int r = 0; r < HEIGHT; r++) rows[r].append(" ".repeat(SPACE_WIDTH));
            } 
            else 
            {   
                if (ch < 'A' || ch > 'Z') 
                {
                    throw new IllegalArgumentException("Unsupported char: " + ch);
                }
                
                String[] mark = FONT[ch - (char)'A'];
                
                for (int r = 0; r < HEIGHT; r++) rows[r].append(mark[r]);
            }

            if (pos < s.length() - 1 && s.charAt(pos) != ' ' && s.charAt(pos + 1) != ' ') 
            {
                for (int r = 0; r < HEIGHT; r++) rows[r].append(' ');
            }
        }

        String[] out = new String[HEIGHT];
        for (int r = 0; r < HEIGHT; r++) out[r] = rows[r].toString();

        return out;
    }
}
