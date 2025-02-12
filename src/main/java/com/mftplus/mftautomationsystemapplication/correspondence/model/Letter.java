package com.mftplus.mftautomationsystemapplication.correspondence.model;

import com.mftplus.mftautomationsystemapplication.attachment.model.Attachment;
import com.mftplus.mftautomationsystemapplication.users.model.User;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
@ToString

@Entity(name="letterEntity")
@Table(name="letter_tbl")
public class Letter {

    @Id
    @SequenceGenerator(name = "letterSeq", sequenceName = "letter_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "letterSeq")
    @Column(name = "id")
    private Long id;

    @Column(name = "letter_number")
    private String number;

    @Column(name = "secretariat_number")
    private String secretariatNumber;

    @Column(name = "creation_time")
    private LocalDateTime creationDateTime;

    @Column(name = "secretariat_time")
    private LocalDateTime secretariatDateTime;

    @Column(name = "subject")
    private String subject;

    @Column(name = "content")
    private String content;

    @ManyToOne
    @JoinColumn(
            name = "sender_id",
            foreignKey = @ForeignKey(name = "fk_letter_user")
    )
    private User sender;

    @ManyToOne
    @JoinColumn(
            name = "appeal_id",
            foreignKey = @ForeignKey(name = "fk_letter_appeal")
    )
    private Appeal appeal;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "letter_attachment_tbl",
            joinColumns = @JoinColumn(name = "letter_id"),
            inverseJoinColumns = @JoinColumn(name = "attachment_id"),
            foreignKey = @ForeignKey(name = "fk_letter_attachment"),
            inverseForeignKey = @ForeignKey(name = "fk_inverse_letter_attachment")
    )
    private List<Attachment> attachmentList;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "letter_letter_detail_tbl",
            joinColumns = @JoinColumn(name = "letter_id"),
            inverseJoinColumns = @JoinColumn(name = "letter_detail_id"),
            foreignKey = @ForeignKey(name = "fk_letter_detail"),
            inverseForeignKey = @ForeignKey(name = "fk_inverse_letter_detail")
    )
    private List<LetterDetail> letterDetailList;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "letter_referrals_tbl",
            joinColumns = @JoinColumn(name = "letter_id"),
            inverseJoinColumns = @JoinColumn(name = "referrals_id"),
            foreignKey = @ForeignKey(name = "fk_letter_referrals"),
            inverseForeignKey = @ForeignKey(name = "fk_inverse_letter_referrals")
    )
    private List<Referrals> referralsList;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "letter_paraph_tbl",
            joinColumns = @JoinColumn(name = "letter_id"),
            inverseJoinColumns = @JoinColumn(name = "paraph_id"),
            foreignKey = @ForeignKey(name = "fk_letter_paraph"),
            inverseForeignKey = @ForeignKey(name = "fk_inverse_letter_paraph")
    )
    private List<Paraph> paraphList;

    @Column(name = "deleted")
    private boolean deleted;

    public void addAttachment(Attachment attachment) {
        if (attachmentList == null) {
            attachmentList = new ArrayList<>();
        }
        attachmentList.add(attachment);
    }

    public void addLetterDetail(LetterDetail letterDetail) {
        if (letterDetailList == null) {
            letterDetailList = new ArrayList<>();
        }
        letterDetailList.add(letterDetail);
    }

    public void addReferrals(Referrals referral) {
        if (referralsList == null) {
            referralsList = new ArrayList<>();
        }
        referralsList.add(referral);
    }

    public void addInitials(Paraph paraph) {
        if (paraphList == null) {
            paraphList = new ArrayList<>();
        }
        paraphList.add(paraph);
    }
}
