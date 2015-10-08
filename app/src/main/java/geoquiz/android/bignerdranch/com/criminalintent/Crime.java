package geoquiz.android.bignerdranch.com.criminalintent;

import java.text.DateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * Created by Peter on 10/6/15.
 */
public class Crime {

    private UUID mid;
    private String mTitle;
    private Date mDate;
    private DateFormat mDateFormat;
    private boolean mSolved;

    public Crime() {
        mid = UUID.randomUUID();
        mDate = new Date();
        mDateFormat = android.text.format.DateFormat.getLongDateFormat(null);
    }

    public UUID getMid() {
        return mid;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public DateFormat getDateFormat() {
        return mDateFormat;
    }

    public void setDateFormat(DateFormat dateFormat) {
        mDateFormat = dateFormat;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }
}
