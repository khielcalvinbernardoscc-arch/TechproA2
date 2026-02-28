part 1


public class Main {
public static void main(String[] args) {


int bilang1 = 15;
int bilang2 = 0;
try {
int result = bilang1 / bilang2; // causes error
System.out.println("Result: " + result);
} catch (ArithmeticException e) {
System.out.println("Built-in Exception: Cannot divide by zero");
}

System.out.println("Program continues running..");
}
}






 part 2

class PasswordException extends Exception {
    public PasswordException(String message) {
super(message);
}
}

public class Main {
    
static void checkPassword(String password) throws PasswordException {
    if (password.length() < 10) {
throw new PasswordException ("must be at least 10 characters long");
} else {
System.out.println("Password accepted");
}
}

public static void main(String[] args) {
    try {
checkPassword("KalboMasamangtao");
} catch (PasswordException e) {
System.out.println("User-Defined Exception: " + e.getMessage());
}
}
}
