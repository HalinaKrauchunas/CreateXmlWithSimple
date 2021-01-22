import org.simpleframework.xml.transform.*;

import java.text.*;
import java.util.*;

public class DateFormatTransformer implements Transform<Date> {

    private DateFormat df;

    public DateFormatTransformer(DateFormat df) {

        this.df = df;
    }

    @Override
    public Date read(String s) throws Exception {

        return df.parse(s);
    }

    @Override
    public String write(Date date) {

        return df.format(date);
    }
}
