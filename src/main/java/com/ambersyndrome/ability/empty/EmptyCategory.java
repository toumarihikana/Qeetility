package com.ambersyndrome.ability.empty;

import cn.academy.ability.Category;
import cn.academy.ability.Skill;
import cn.academy.ability.vanilla.VanillaCategories;
import com.ambersyndrome.ability.empty.skill.EmptyFirstSkill;

public class EmptyCategory extends Category {

public static final Skill emp1 = EmptyFirstSkill.instance;
    public EmptyCategory() {
        super("zempty");


        setColorStyle(20, 113, 208, 100);

        emp1.setPosition(24,46);
        addSkill(emp1);


        VanillaCategories.addGenericSkills(this);
    }
}