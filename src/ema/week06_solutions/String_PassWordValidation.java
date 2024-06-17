package ema.week06_solutions;

public class String_PassWordValidation {

    /*
    Write a function that can verify if a password is valid or not. requirements:
                1. Password MUST be at least have 6 characters and should not contain space
                2. PassWord should at least contain one upper case letter
                3. PassWord should at least contain one lowercase letter
                4. Password should at least contain one special characters
                5. Password should at least contain a digit

        if all requirements above are met, the method returns true, otherwise returns false
     */


    public static void main(String[] args) {

        //System.out.println(passwordIsValid("123abc?"));

        String password = "Password123@";
        System.out.println(isValidPassword(password));
    }

    public static boolean isValidPassword(String password) {

        if(password.length() < 6 || password.contains(" ")){
            return false;
        }
        if(!password.contains("0-9")){
            return false;
        }
        return true;

    }


}
