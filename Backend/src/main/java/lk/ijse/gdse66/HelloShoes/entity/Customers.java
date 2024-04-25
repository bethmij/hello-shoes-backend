package lk.ijse.gdse66.HelloShoes.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lk.ijse.gdse66.HelloShoes.service.util.enums.Gender;
import lk.ijse.gdse66.HelloShoes.service.util.enums.Level;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "customers")
public class Customers {

    @Id
    @Column(name = "customer_code")
    private String customerCode;

    @Column(name = "customer_name", unique = true, nullable = false)
    private String customerName;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column (name = "loyalty_joined_date",columnDefinition = "DATE")
    @JsonFormat(pattern = "yyyyMMdd")
    private Date loyaltyJoinedDate;

    @Enumerated(EnumType.STRING)
    private Level level;

    private int totalPoints;

    @Column (columnDefinition = "DATE")
    @JsonFormat(pattern = "yyyyMMdd")
    private Date dob;

    @Column(name = "building")
    private String addressLine01;

    @Column(name = "city_lane")
    private String addressLine02;

    @Column(name = "city", nullable = false)
    private String addressLine03;

    @Column(name = "state")
    private String addressLine04;

    @Column(name = "postal_code", nullable = false)
    private String addressLine05;

    @Column(name = "contact_no", length = 15, nullable = false)
    private String contactNo;

    private String email;

    @Column (name = "recent_purchase_date", columnDefinition = "DATE")
    @JsonFormat(pattern = "yyyyMMdd")
    private Date recentPurchaseDate;

}
