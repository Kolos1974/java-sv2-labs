package stringtype.registration;

public class UserValidator {

    public boolean isValidUsername(String username){
        return username.length()>0 ? true : false;
    }

    public boolean isValidPassword(String password1, String password2){
        return ((password1.length()>=8) && password1.equals(password2)) ? true : false;
    }

    public boolean isValidEmail(String email){
        int pos1 = email.indexOf("@");
        int pos2 = email.indexOf(".");

        return ((pos1>0) && ((pos2>=0) && !(pos2==(email.length()-1))) && !(pos1==(pos2-1))) ? true : false;
    }
}
