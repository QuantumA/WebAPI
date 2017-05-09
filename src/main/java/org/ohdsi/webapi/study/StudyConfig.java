/**
 * This file was generated by the JPA Modeler
 */ 

package org.ohdsi.webapi.study;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author Chris Knoll <cknoll@ohdsi.org>
 */

@Embeddable
public class StudyConfig { 

    @Column(name="COHORT_METHOD_VERSION")
    @Basic
    private String CohortMethodVersion;

    @Column(name="VOCABULARY_VERSION")
    @Basic
    private String VocabularyVersion;

    public String getCohortMethodVersion() {
        return this.CohortMethodVersion;
    }

    public void setCohortMethodVersion(String CohortMethodVersion) {
        this.CohortMethodVersion = CohortMethodVersion;
    }


    public String getVocabularyVersion() {
        return this.VocabularyVersion;
    }

    public void setVocabularyVersion(String VocabularyVersion) {
        this.VocabularyVersion = VocabularyVersion;
    }


}