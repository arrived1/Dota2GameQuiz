package com.dota.my;

public class Hero {
    private String name;
    private int pic;
    private int skill1;
    private int skill2;
    private int skill3;
    private int ulti;

    Hero(String name, int pic, int skill1, int skill2, int skill3, int ulti) {
        this.name = name;
        this.pic = pic;
        this.skill1 = skill1;
        this.skill2 = skill2;
        this.skill3 = skill3;
        this.ulti = ulti;
    }

    public int getPic() {
        return pic;
    }

    public int getSkill(int i) {
        switch(i) {
            case 1:
                return skill1;
            case 2:
                return skill2;
            case 3:
                return skill3;
            case 0:
                return ulti;
        }
        return -1;
    }

    public int getUlti() {
        return ulti;
    }

    public boolean isSkillMy(int skill)
    {
        if((skill == skill1) || (skill == skill2) || (skill == skill3) || (skill == ulti))
            return true;
        return false;
    }
}
