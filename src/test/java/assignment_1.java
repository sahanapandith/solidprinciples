import org.mindrot.jbcrypt.BCrypt;

public class assignment_1 {
    //API endpoint that hashes passwords using SHA-1 and list down the hashes for some common passwords in your submission
    public static String hashPassword(String password) {
        String hashedPassword = BCrypt.hashpw(password, BCrypt.gensalt());
        return hashedPassword;
    }

    public static boolean checkPassword(String password, String hashedPassword) {
        return BCrypt.checkpw(password, hashedPassword);
    }

    public static void main(String[] args) {
        // Example usage
        String password = "SahanaPandith@2020";
        String hashedPassword = hashPassword(password);

        System.out.println("Original Password: " + password);
        System.out.println("Hashed Password: " + hashedPassword);

        // Check if the entered password matches the stored hash
        boolean isPasswordCorrect = checkPassword("examplePassword", hashedPassword);
        System.out.println("Is Password Correct? " + isPasswordCorrect);
    }
}

//Original Password: SahanaPandith
//Hashed Password: $2a$10$Qx7cAyaI1UlrpzPywe.kNuuxntQ.SjckxvNbru1Im69ifsDv892eq
//Hashed Password: $2a$10$5MbaUD0nCSZIuqnvEA51jeMVPbRGp68CrzB3gPqo9RDqir0FNXiOS
//Hashed Password: $2a$10$RCuF8ST41Xd2aCoLiFq9xeEyS0Nk6m46fTsv0.YmaDSpo6BsEoRAi
//Hashed Password: $2a$10$tuk3sZDxmOdTR2luPnPxeue9.CKDC1euJq9T6xrbDZQXQAsaHwsBi
//Hashed Password: $2a$10$yKKWSUHOtLVEZDpXLEofYeYkY2g8yFyxQxpfRYrIrKWUWXZ5AJHzC

//Original Password: SahanaPandith@2020
//Hashed Password: $2a$10$1DTw9R99u6IpEC1l64fESeFqD5urjivcRFoM4tlG8Tc2QBmv7BvHO
//Hashed Password: $2a$10$Ctme2EqI8mn9OG9ZgbIvhem.tLsjo2XR2VNUqZMo3yrClUzSVno/a