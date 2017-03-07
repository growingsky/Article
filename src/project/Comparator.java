package project;

import java.util.logging.Logger;

/**
 * Created by admin on 07.03.17.
 */
public class Comparator implements java.util.Comparator<Article> {

    @Override
    public int compare(Article o1, Article o2) {
        if (o1.getTitle().charAt(0)> o2.getTitle().charAt(0)) {
            return 1;
        } else if (o1.getTitle().charAt(0) < o2.getTitle().charAt(0)) {
            return -1;
        }
        return 0;
    }
}
