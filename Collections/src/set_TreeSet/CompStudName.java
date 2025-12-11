package set_TreeSet;

import java.util.Comparator;

public class CompStudName implements Comparator<Stud> {

    @Override
    public int compare(Stud s1, Stud s2) {

        // compareTO method will return the integer value
        int status=s1.studName.compareTo(s2.studName);

        return status;
    }
}
