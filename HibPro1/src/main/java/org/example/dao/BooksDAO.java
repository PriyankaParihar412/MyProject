

public class BooksDAO {
    public static void insert(Books book){
        Transaction transaction = null;
        try(Session session = HibConfig.getSessionFactory().openSession()){
            transaction  = session.beginTransaction();
            session.save(book);
            transaction.commit();

        }catch(Exception e) {
            if(transaction!=null) {
                transaction.rollback();
            }
        }
    }
    public static void delete(Books book){
        Transaction transaction = null;
        try(Session session = HibConfig.getSessionFactory().openSession()){
            transaction  = session.beginTransaction();
            session.delete(book.getId());
            transaction.commit();

        }catch(Exception e) {
            if(transaction!=null) {
                transaction.rollback();
            }
        }
    }

    public static Books getBook(int id){
        Transaction transaction = null;
        Books books = new Books();
        try(Session session = HibConfig.getSessionFactory().openSession()){
            transaction  = session.beginTransaction();
            books = session.get(Books.class,id);
            transaction.commit();

        }catch(Exception e) {
            if(transaction!=null) {
                transaction.rollback();
            }
        }
        return books;
    }

}
