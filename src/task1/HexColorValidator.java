package task1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static utils.Constants.HEX_COLOR;

public class HexColorValidator {
    public static String isHexColor(String colorCode) {
        Pattern pattern = Pattern.compile(HEX_COLOR);
        Matcher matcher = pattern.matcher(colorCode);
        if (matcher.find()) {
            return "Yes";
        } else {
            return "No";
        }
    }
}


