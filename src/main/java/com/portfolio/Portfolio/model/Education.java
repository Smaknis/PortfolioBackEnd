
package com.portfolio.Portfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity (name = "EDUCATION")
public class Education {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_education;
    
    private String institute;
    private String title;
    private String score;
    private String year_start;
    private String year_end;
    private String url_logo_education;
    private Long personId;
    private Boolean edit;

    public Education() {
    }

    public Education(Long id_education, String institute, String title, String score, String year_start, String year_end, String url_logo_education, Long personId, Boolean edit) {
        this.id_education = id_education;
        this.institute = institute;
        this.title = title;
        this.score = score;
        this.year_start = year_start;
        this.year_end = year_end;
        this.url_logo_education = url_logo_education;
        this.personId = personId;
        this.edit = edit;
    }


}
