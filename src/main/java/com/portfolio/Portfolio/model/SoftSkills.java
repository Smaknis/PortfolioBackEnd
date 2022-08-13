
package com.portfolio.Portfolio.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class SoftSkills {
    
    private Long id;
    private String title;
    private String score;
    private String person_id;

    public SoftSkills() {
    }

    public SoftSkills(Long id, String title, String score, String person_id) {
        this.id = id;
        this.title = title;
        this.score = score;
        this.person_id = person_id;
    }
    
    
    
}
