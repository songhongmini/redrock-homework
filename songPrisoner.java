package com.jude.prisoner;

import com.jude.Manager;
import com.jude.Prisoner;

/**
 * Created by Administrator on 2016/10/28.
 */
public class songPrisoner  implements Prisoner {
    int totalCount;
    int totalPerson;
    @Override
    public String getName() {
        return "宋宏2016212017";
    }
    @Override
    public void begin(Manager manager, int totalPerson, int totalCount) {
        this.totalCount = totalCount;
        this.totalPerson = totalPerson;
    }

    @Override
    public int take(int index, int last) {
        //经过我宋宏缜密的计算，我算出我拿这个数最能活
        return ((totalCount-last)/(index+9) + totalCount/totalPerson)/2;
    }

    @Override
    public void result(boolean survived) {

    }




}
