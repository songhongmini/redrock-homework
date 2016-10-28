package com.jude.prisoner;
import com.jude.Prisoner;
import com.jude.Manager;

/**
 * Created by Administrator on 2016/10/25.
 */
public class songPrisoner implements Prisoner {
    int totalPerson;
    int totalCount;

    @Override
    public String getName() {
        return "宋 宏2016212017";
    }

    @Override
    public void begin(Manager manager, int totalPerson, int totalCount) {
        this.totalCount = totalCount;
        this.totalPerson = totalPerson;

    }

    @Override
    public int take(int index, int last) {
        return ((totalCount-last)/(index+9) + totalCount/totalPerson)/2;
    }

    @Override
    public void result(boolean survived) {

    }
}
