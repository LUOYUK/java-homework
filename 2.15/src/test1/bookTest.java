package test1;

import java.util.Scanner;

public class bookTest {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("请输入书的标题:");
            String Title = sc.nextLine();

            System.out.println("请输入书的作者:");
            String Author = sc.nextLine();

            System.out.println("请输入书的出版年:");
            String Year = sc.nextLine();

            Book s = new Book();
            s.setTitle(Title);
            s.setAuthor(Author);
            s.setYear(Year);

            s.displayInfo(Title, Author, Year);

        }
    }


