public class MP11 {
    public static void main(String[] args) {
        PasswordInfo passwordInfo;
        PasswordDAO passwordDAO = new PasswordDAOImpl();

        System.out.println("--- inserting...");
        passwordInfo = new PasswordInfo("https://smu.ac.kr","smu","abcde");
        passwordDAO.insert(passwordInfo);

        passwordInfo = new PasswordInfo("https://smu2.ac.kr", "smu2", "abcde");
        passwordDAO.insert(passwordInfo);

        System.out.println("--- finding all...");
        for (PasswordInfo pi : passwordDAO.findAll()) {
            System.out.println("reading... " + pi);
        }
        System.out.println("--- updating...");
        passwordInfo = passwordDAO.findAll().get(1);
        passwordInfo.setId("smu1");
        passwordDAO.update(passwordInfo);

        System.out.println("--- see if updated...");
        passwordInfo = passwordDAO.findByKey("https://smu2.ac.kr");
        if (passwordInfo != null) {
            System.out.println(passwordInfo);
        }
        System.out.println("--- deleting...");
        passwordDAO.delete("https://smu2.ac.kr");

        System.out.println("--- finding all after deleting...");
        for (PasswordInfo pi : passwordDAO.findAll()) {
            System.out.println("reading... " + pi);
        }
    }
}
