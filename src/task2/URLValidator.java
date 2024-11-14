package task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static utils.Constants.URL;

public class URLValidator {

        public static boolean isURLValid(String inputLink) {
            Pattern pattern = Pattern.compile(URL);
            Matcher matcher = pattern.matcher(inputLink);
            return matcher.matches();
        }
    }

