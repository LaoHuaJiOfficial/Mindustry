package mindustry.debug;

import arc.util.Time;

public class TimeFormat {

    public static CharSequence get(long value){
        return (value/1000)/1000f + "ms";
    }

}
