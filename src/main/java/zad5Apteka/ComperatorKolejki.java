package zad5Apteka;


import java.util.Comparator;

public class ComperatorKolejki implements Comparator<Customer> {
    @Override
    public int compare(Customer o1, Customer o2) {
        if (o1.isPregnant() && o2.isPregnant()) {
            if (o1.getJoiningQueue().isBefore(o2.getJoiningQueue())) {
                return -1;
            } else if (o2.getJoiningQueue().isBefore(o1.getJoiningQueue())) {
                return 1;
            }
        }
        if (o1.isPregnant() && !o2.isPregnant()) {
            return -1;
        }
        if (!o1.isPregnant() && o2.isPregnant()) {
            return 1;
        }
        if (o1.getAge() >= 60 && o2.getAge() >= 60) {
            if (o1.getJoiningQueue().isBefore(o2.getJoiningQueue())) {
                return 1;
            } else if (o2.getJoiningQueue().isBefore(o1.getJoiningQueue())) {
                return -1;
            }
        }
        if (o1.getAge() >= 60 && o2.getAge() < 60) {
            return -1;
        }
        if (o1.getAge() < 60 && o2.getAge() >= 60) {
            return 1;
        }
        if (o1.getJoiningQueue().isBefore(o2.getJoiningQueue())) {
            return -1;
        } else if (o2.getJoiningQueue().isBefore(o1.getJoiningQueue())) {
            return 1;
        }
        if (o1.getJoiningQueue().isBefore(o2.getJoiningQueue())) {
            return -1;
        } else if (o2.getJoiningQueue().isBefore(o1.getJoiningQueue())) {
            return 1;
        }
        return 0;
    }
}
