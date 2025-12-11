package set_TreeSet;

import java.util.Comparator;

public class CompStudId implements Comparator<Stud> {
    int status;

    @Override
    public int compare(Stud s1, Stud s2) {
        if(s1.studId==s2.studId){
            status=0;
        } else if (s1.studId>s2.studId) {
            status=1;
        } else if (s1.studId < s2.studId) {
            status=-1;
        }
        return status;
    }
// comparator ko implement karna hai with respect to id

}
