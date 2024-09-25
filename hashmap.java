import java.util.HashMap;

class HashMaps {
    public static void main(String[] args) {
        HashMap<String, String> accounts = new HashMap<>();

        accounts.put("MyAccount1", "MyPassword1");
        accounts.put("MyAccount2", "MyPassword2");
        accounts.put("MyEmail@EmailPlace.Mail", "MyPassword3");

        System.out.println(accounts.get("MyEmail@EmailPlace.Mail")); // should return "MyPassword3"
    }
}
