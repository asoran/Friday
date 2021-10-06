package fr.umlv.Friday;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Event {
	@Id
	@Column(name = "id", nullable = false)
	private Long id;

	@Column
	private String uuid;

	@Column
	private String summary;

	@Column
	private String description;

	@Column
	private String location;

	@Column
	private String category;

	@Column
	private LocalDate dateStart;

	@Column
	private LocalDate dateEnd;

	@Column
	private LocalTime timeStart;

	@Column
	private LocalTime timeEnd;

	@Column
	private boolean allDay;

	@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "recurrence_id")
	private Recurrence recurrence;

}
