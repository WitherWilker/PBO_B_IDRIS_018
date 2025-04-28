public class Admin extends User {
    private String username;
    private String password;

    public Admin(String nama, String nim, String username, String password) {
        super(nama, nim);
        this.username = username;
        this.password = password;
    }

    // Getter dan Setter untuk username
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        if(username != null && username.length() >= 5) {
            this.username = username;
        } else {
            System.out.println("Username harus minimal 5 karakter!");
        }
    }

    // Getter dan Setter untuk password
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(password != null && password.length() >= 8) {
            this.password = password;
        } else {
            System.out.println("Password harus minimal 8 karakter!");
        }
    }
    @Override
    public boolean login(String inputUsername, String inputPassword) {
        boolean usernameValid = username.equals(inputUsername);
        boolean passwordValid = password.equals(inputPassword);

        if(!usernameValid) {
            System.out.println("Username salah!");
        }
        if(!passwordValid) {
            System.out.println("Password salah!");
        }

        return usernameValid && passwordValid;
    }

    @Override
    public void displayInfo() {
        System.out.println("\n=== ADMIN ===");
        System.out.println("Username: " + getUsername());
        super.displayInfo();
    }
}