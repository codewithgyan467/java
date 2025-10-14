public class StringConcatenation {

    
    private String combinedString;

       
    public StringConcatenation(String str1, String str2) {
        this.combinedString = concatenate(str1, str2);
    }

        
    public String concatenate(String str1, String str2) {
        return str1 + str2;
    }
    public static void main(String[] args) {
        String firstName = "John";
        String lastName = " Doe";
        StringConcatenation concatObj = new StringConcatenation(firstName, lastName);
        String fullName = concatObj.combinedString;
        System.out.println("Full Name: " + fullName);
    }
}
