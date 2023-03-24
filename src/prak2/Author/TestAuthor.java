package prak2.Author;
public class TestAuthor {
    public static void main(String[] args)
    {
        Author author = new Author("Владислав", "123@mail.ru", 'M');
        System.out.println(String.format("%s %s %s",author.GetName(), author.GetEmail(), author.GetGender()));
        author.SetEmail("321@mail.ru");
        System.out.println(author.ToString());
    }
}