import java.util.Scanner;

class Password{

    public void setPass(){

        String password;

        System.out.println("Set your password:");

        Scanner sc = new Scanner(System.in);

        password = sc.nextLine();

        System.out.println("Confirm your password:");

        String confirmPass = sc.nextLine();

        boolean confirm = checkPassword(password, confirmPass);

        if(confirm){
            print("saved");
        }else{
            print("failed");
        }

        sc.close();
    }

    private void print(String success){
        System.out.println("Password "+ success + "!");
    }

    private boolean checkPassword(String pass, String conf){
        return pass.equals(conf);
    }

}


public class Pass{
    public static void main(String[] args) {
        Password password = new Password();
        password.setPass();
    }

}