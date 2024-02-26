import org.mindrot.jbcrypt.BCrypt;

public class assignment_4 {
    public static void main(String[] args) {
        //password to be hashed
        //Use bcrypt for password encryption
        String password = "SahanaPandith";

        //Hash the password using `Bcrypt`
        String hashedPassword = hashPasswordBcrypt(password);
        System.out.println("Original password: " + password);
        System.out.println("Hashed password using Bcrypt " + hashedPassword);

        //Verify the entered password against the `stored Bcrypt hash`
        boolean passwordMatch = verifyPassword(password, hashedPassword);
        System.out.println("password matched : " + passwordMatch);
    }


    private static String hashPasswordBcrypt(String password) {
        return BCrypt.hashpw(password, BCrypt.gensalt());
    }

    private static boolean verifyPassword(String enteredPassword, String storedHash) {
        return BCrypt.checkpw(enteredPassword, storedHash);

    }
}

//Original password: SahanaPandith
//Hashed password (Bcrypt) $2a$10$fi4XPPfhLQzo7nxL1VX8C.0cIU9JrvZ9DiAwhbZIDsgkX2LLqzULK
//password match: true
//Hashed password (Bcrypt) $2a$10$H8uhEzDupDTwOPdjIE0gXe77TVr5Cr.tE1fa85gh8nm4qdszMBnOC
//password match: true
//Original password: SahanaPandith
//Hashed password (Bcrypt) $2a$10$H8uhEzDupDTwOPdjIE0gXe77TVr5Cr.tE1fa85gh8nm4qdszMBnOC
//password match: true
