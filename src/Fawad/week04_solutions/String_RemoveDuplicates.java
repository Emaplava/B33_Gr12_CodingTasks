package Fawad.week04_solutions;

public class String_RemoveDuplicates {
    public static void main(String[] args) {
        String stringWithDuplicates = "AAABBBCCC";// This line initializes a string variable

        StringBuffer stringbuffer = new StringBuffer(); //We create a String Buffer object stringbuffer is created.

        for (int i = 0; i < stringWithDuplicates.length(); i++) { // This for loop iterates through each character of the string

            char character = stringWithDuplicates.charAt(i); // Inside the loop, it retrieves the character at the current index i of the

            int index = stringWithDuplicates.indexOf(character, i + 1);//Inside the loop, it gets the character at the current index i of the
            if (index == -1) { //  If no other occurrence of the character is found after the current index, it means the character is unique,
                stringbuffer.append(character); // here it is appended to the StringBuffer .
            }
        }
        String duplicatesRemoved = stringbuffer.toString(); //After the loop finishes, stringbuffer.toString() converts the StringBuffer back to a regular string,
        // effectively removing duplicates.

        System.out.println("duplicates are removed : " + duplicatesRemoved); //result is printed
    }
}

