package com.inpixon.interview.employers.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Employers {
    List<Employer> employers;
    public List<Employer> getEmployers() {
        return Optional.ofNullable(employers).orElse(new ArrayList<>());
    }

    public Employers employers(List<Employer> employers) {
        this.employers = employers;
        return this;
    }


}
