package uj.wmii.pwj.introduction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Banner {

    private static final Map<Character, String[]> FONT_MAP;

    static {
        Map<Character, String[]> map = new HashMap<>();


        map.put(' ', new String[] {
                "   ",
                "   ",
                "   ",
                "   ",
                "   ",
                "   ",
                "   "
        });


        map.put('A', new String[] {
                "   #   ",
                "  # #  ",
                " #   # ",
                "#     #",
                "#######",
                "#     #",
                "#     #"
        });


        map.put('B', new String[] {
                "###### ",
                "#     #",
                "#     #",
                "###### ",
                "#     #",
                "#     #",
                "###### "
        });


        map.put('C', new String[] {
                " ##### ",
                "#     #",
                "#      ",
                "#      ",
                "#      ",
                "#     #",
                " ##### "
        });


        map.put('D', new String[] {
                "###### ",
                "#     #",
                "#     #",
                "#     #",
                "#     #",
                "#     #",
                "###### "
        });


        map.put('E', new String[] {
                "#######",
                "#      ",
                "#      ",
                "#####  ",
                "#      ",
                "#      ",
                "#######"
        });


        map.put('F', new String[] {
                "#######",
                "#      ",
                "#      ",
                "#####  ",
                "#      ",
                "#      ",
                "#      "
        });


        map.put('G', new String[] {
                " ##### ",
                "#     #",
                "#      ",
                "#  ####",
                "#     #",
                "#     #",
                " ##### "
        });


        map.put('H', new String[] {
                "#     #",
                "#     #",
                "#     #",
                "#######",
                "#     #",
                "#     #",
                "#     #"
        });


        map.put('I', new String[] {
                "###",
                " # ",
                " # ",
                " # ",
                " # ",
                " # ",
                "###"
        });


        map.put('J', new String[] {
                "      #",
                "      #",
                "      #",
                "      #",
                "#     #",
                "#     #",
                " ##### "
        });


        map.put('K', new String[] {
                "#    #",
                "#   # ",
                "#  #  ",
                "###   ",
                "#  #  ",
                "#   # ",
                "#    #"
        });


        map.put('L', new String[] {
                "#      ",
                "#      ",
                "#      ",
                "#      ",
                "#      ",
                "#      ",
                "#######"
        });


        map.put('M', new String[] {
                "#     #",
                "##   ##",
                "# # # #",
                "#  #  #",
                "#     #",
                "#     #",
                "#     #"
        });


        map.put('N', new String[] {
                "#     #",
                "##    #",
                "# #   #",
                "#  #  #",
                "#   # #",
                "#    ##",
                "#     #"
        });


        map.put('O', new String[] {
                "#######",
                "#     #",
                "#     #",
                "#     #",
                "#     #",
                "#     #",
                "#######"
        });


        map.put('P', new String[] {
                "###### ",
                "#     #",
                "#     #",
                "###### ",
                "#      ",
                "#      ",
                "#      "
        });


        map.put('Q', new String[] {
                " ##### ",
                "#     #",
                "#     #",
                "#     #",
                "#   # #",
                "#    # ",
                " #### #"
        });


        map.put('R', new String[] {
                "###### ",
                "#     #",
                "#     #",
                "###### ",
                "#   #  ",
                "#    # ",
                "#     #"
        });


        map.put('S', new String[] {
                " ##### ",
                "#     #",
                "#      ",
                " ##### ",
                "      #",
                "#     #",
                " ##### "
        });


        map.put('T', new String[] {
                "#######",
                "   #   ",
                "   #   ",
                "   #   ",
                "   #   ",
                "   #   ",
                "   #   "
        });


        map.put('U', new String[] {
                "#     #",
                "#     #",
                "#     #",
                "#     #",
                "#     #",
                "#     #",
                " ##### "
        });


        map.put('V', new String[] {
                "#     #",
                "#     #",
                "#     #",
                "#     #",
                " #   # ",
                "  # #  ",
                "   #   "
        });


        map.put('W', new String[] {
                "#     #",
                "#  #  #",
                "#  #  #",
                "#  #  #",
                "#  #  #",
                "#  #  #",
                " ## ## "
        });


        map.put('X', new String[] {
                "#     #",
                " #   # ",
                "  # #  ",
                "   #   ",
                "  # #  ",
                " #   # ",
                "#     #"
        });


        map.put('Y', new String[] {
                "#     #",
                " #   # ",
                "  # #  ",
                "   #   ",
                "   #   ",
                "   #   ",
                "   #   "
        });


        map.put('Z', new String[] {
                "#######",
                "     # ",
                "    #  ",
                "   #   ",
                "  #    ",
                " #     ",
                "#######"
        });

        FONT_MAP = Collections.unmodifiableMap(map);
    }

    public String[] toBanner(String input) {
        if (input == null) {
            return new String[0];
        }

        String upperInput = input.toUpperCase();

        List<StringBuilder> bannerLines = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            bannerLines.add(new StringBuilder());
        }

        final String SEPARATOR = " ";

        for (int i = 0; i < upperInput.length(); i++) {
            char currentChar = upperInput.charAt(i);

            String[] charArt = FONT_MAP.get(currentChar);

            if (charArt == null) {
                continue;
            }

            for (int j = 0; j < 7; j++) {
                bannerLines.get(j).append(charArt[j]);
            }


            if (i < upperInput.length() - 1 && currentChar != ' ') {
                for (int j = 0; j < 7; j++) {
                    bannerLines.get(j).append(SEPARATOR);
                }
            }
        }

        return bannerLines.stream()
                .map(StringBuilder::toString)
                .toArray(String[]::new);
    }
}
