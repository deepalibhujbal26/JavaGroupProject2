package Project2;

public class Registration {
    /*
    Create Registration Class in which you would have variables as
email, userName and password that have an access scope only
within its own class. After creating an object of the class user should
be able to call methods and in each method separately pass values
to set users email, username and password.
Requirements:
A. Valid email consider to be only yahoo
B. Valid userName and password cannot be empty and should be of
length larger than 6 characters. Also valid password cannot contain
userName.

     */

    private String email;
    private String userName;
    private String password;

    public Registration(String email, String userName, String password) {
        setEmail(email);
        setUserName(userName);
        setPassword(password);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.contains("yahoo.com")) {
            this.email = email;
        } else {
            System.out.println("Invalid Email format :");
        }
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        if (!userName.isEmpty() && userName.length() > 6) {
            this.userName = userName;
        } else {
            System.out.println("Invalid :");
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (!password.contains(userName)) {
            this.password = password;
        } else {
            System.out.println("Invalid:");
        }
    }
}

class TesterRegister {
    public static void main(String[] args) {


        Registration obj = new Registration("abcIam@yahoo.com", "abceffg123", "Abc@123");
        System.out.println(" Email ID  : " + obj.getEmail());
        System.out.println(" UserName  : " + obj.getUserName());
        System.out.println(" Password   : " + obj.getPassword());

    }
}
