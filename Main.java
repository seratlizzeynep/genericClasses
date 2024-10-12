package genericClasses;

public class Main {
    public static void main(String[] args) {
        GenericRepository<User> userRepository = new InMemoryGenericRepository<>();
        GenericRepository<Book> bookRepository = new InMemoryGenericRepository<>();

        User user1 = new User("zeynep");
        User user2 = new User("elif");

        userRepository.save(user1);
        userRepository.save(user2);

        System.out.println("Kullanıcılar:");
        userRepository.findAll().forEach(System.out::println);

        Book book1 = new Book("Java Programlama");
        Book book2 = new Book("Veritabanı Sistemleri");

        bookRepository.save(book1);
        bookRepository.save(book2);

        System.out.println("\nKitaplar:");
        bookRepository.findAll().forEach(System.out::println);
    }
}
