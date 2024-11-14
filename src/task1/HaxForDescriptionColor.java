package task1;

public class HaxForDescriptionColor {
    public static void main(String[] args) {
        String[] test = {"#E9967A", "#8B0000", "#FFG000", "#7FFH00", "#2T8B56"};
        HexColorValidator hexColorValidator = new HexColorValidator();
        for (String colorCode : test) {
            System.out.println(colorCode + " " + hexColorValidator.isHexColor(colorCode));
        }
    }
}


