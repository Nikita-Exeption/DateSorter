package sample;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Marking will be based upon producing a readable, well engineered solution rather than factors
 * such as speed of processing or other performance-based optimizations, which are less
 * important.
 *
 *
 * Implement in single class.
 */
public class DateSorter {
    /**
     * The implementation of this method should sort dates.
     * The output should be in the following order:
     * Dates with an 'r' in the month,
     * sorted ascending (first to last),
     * then dates without an 'r' in the month,
     * sorted descending (last to first).
     * For example, October dates would come before May dates,
     * because October has an 'r' in it.
     * thus: (2005-07-01, 2005-01-02, 2005-01-01, 2005-05-03)
     * would sort to
     * (2005-01-01, 2005-01-02, 2005-07-01, 2005-05-03)
     *
     * @param unsortedDates - an unsorted list of dates
     * @return the collection of dates now sorted as per the spec
     */
    public Collection<LocalDate> sortDates(List<LocalDate> unsortedDates) {
        List<LocalDate> result = new ArrayList<>();
        List<LocalDate> withoutR = new ArrayList<>();
        int numOfMonth;
        LocalDate date;
        for (LocalDate unsortedDate : unsortedDates) {
            date = unsortedDate;
            numOfMonth = date.getMonthValue();
            if (numOfMonth == 5 || numOfMonth == 6 || numOfMonth == 7 || numOfMonth == 8) {
                withoutR.add(date);
            } else {
                result.add(date);
            }
        }
        withoutR.sort(Collections.reverseOrder());
        result.addAll(withoutR);
        return result;
    }
}
