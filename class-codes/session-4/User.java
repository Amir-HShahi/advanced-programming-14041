public class User {
    private static int userCount = 0;

    public User() {
        userCount++;
    }

    public static int getUserCount() {
        return userCount;
    }

    public static void main(String[] args) {
        User user1 = new User();
        System.out.println(User.userCount);
        User user2 = new User();
        System.out.println(User.getUserCount());
    }
}
