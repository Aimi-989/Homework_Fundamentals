package Advanced.Exception.Task_4;


import Advanced.Exception.Task_2.MyBestException;
import java.io.IOException;
import java.sql.SQLException;

    public class Main {
        public static void main(String[] args) throws MyBestException {
            Object empty = null;
            try {
                empty = fetchFromDatabase();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }

            try {
                String fromObject = empty.toString();
            } catch (NullPointerException npe) {
                System.out.println("WARNING!!! OBJECT WAS NULL.");
                System.exit(1);
            }

        }

        public static Object fetchFromDatabase() throws IOException, SQLException {
            //some logic.......
            //.......
            //.......\
            //logic to return Object from database;
            return null;
        }
    }