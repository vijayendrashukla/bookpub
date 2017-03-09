package org.test.bookpub.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by qlg725 on 3/8/17.
 */
@Entity
public class Reviewer {

    @Id
    @GeneratedValue
    private Long id;

    private String firstName;
    private String lastName;

    protected Reviewer(){}

    public Reviewer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
