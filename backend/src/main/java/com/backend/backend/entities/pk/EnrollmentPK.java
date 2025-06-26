package com.backend.backend.entities.pk;

import com.backend.backend.entities.Offer;
import com.backend.backend.entities.User;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

@AllArgsConstructor @NoArgsConstructor
@Getter @Setter @EqualsAndHashCode
@Embeddable
public class EnrollmentPK {

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "offer_id")
    private Offer offer;

}
