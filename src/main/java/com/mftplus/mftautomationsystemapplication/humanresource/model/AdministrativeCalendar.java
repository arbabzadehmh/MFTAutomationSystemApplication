package com.mftplus.mftautomationsystemapplication.humanresource.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;


@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
@ToString


@Entity(name = "administrativeCalendarEntity")
@Table(name = "administrative_calendar_tbl")
public class AdministrativeCalendar {
    @Id
    @SequenceGenerator(name = "administrativeCalendarSeq",sequenceName = "administrative_calendar_seq",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "administrativeCalendarSeq")
    @Column(name = "id")
    private Long id;

    @Column(name = "calendar_date")
    private LocalDate calendarDate;

    @Column(name ="calendar_year")
    private int calendarYear;

    @Column(name ="month_of_year")
    private int monthOfYear;

    @Column(name ="day_of_month")
    private int dayOfMonth;

    @Column(name="week_days")
    @Enumerated(EnumType.ORDINAL)
    private WeekDays weekDays;

    @Column(name="holiday")
    private boolean holiday;

    @OneToOne
    @JoinColumn(
            name = "holiday_type_id",
            foreignKey = @ForeignKey(name = "fk_admin_calendar_holiday")
    )
    private HolidayType holidayType;

    @Column(name = "description")
    private String description;


}
