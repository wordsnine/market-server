package com.market.member.domain.entity;

import com.market.member.domain.vo.Phone;
import com.market.member.dto.SellerDto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Seller {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Email
    String email;

    @NotBlank
    String name;

    Phone phone;

    public void updateInfo(SellerDto to) {
        this.email = to.getEmail();
        this.name = to.getName();
        this.phone = to.getPhone();
    }

}