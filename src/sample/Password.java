package sample;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {
    private static int MIN_LENGTH = 8;


    private String password;

    public Password(String password){
        this.password = password;
    }

    private boolean hasRequiredLength(){
        return password.length() > 8;
    }
    private boolean hasSpecialChar(){
        return Pattern.compile("[!@#$%&*()_+=|<>?{}\\[\\]~-]").matcher(password).find();
    }

    public boolean isSafe(){
        return true;
    }

//    Pattern letter = Pattern.compile("[a-zA-Z]");
//    Pattern digit = Pattern.compile("[0-9]");
//    Pattern special = Pattern.compile ("[!@#$%&*()_+=|<>?{}\\[\\]~-]");
//    //Pattern eight = Pattern.compile (".{8}");
//
//
//    Matcher hasLetter = letter.matcher(password);
//    Matcher hasDigit = digit.matcher(password);
//    Matcher hasSpecial = special.matcher(password);
//
//           return hasLetter.find() && hasDigit.find() && hasSpecial.find();
}
