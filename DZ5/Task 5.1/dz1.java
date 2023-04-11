//Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.

public class dz1 {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();
        phonebook.add("375-86-87", "Иван Андреевич Воротин");
        phonebook.add("692-34-56", "Егор Иванович Тулупов");
        phonebook.add("849-73-32", "Егор Иванович Тулупов");
        phonebook.add("534-42-67", "Евгений Владимирович Смирнов");
        phonebook.add("248-93-55", "Андрей Сергеевич Петров");

        phonebook.getByName("Егор Иванович Тулупов");
        phonebook.printBook();

    }
}
