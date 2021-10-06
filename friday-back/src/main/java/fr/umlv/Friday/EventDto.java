package fr.umlv.Friday;

import java.time.LocalDate;
import java.time.LocalTime;

public record EventDto(Long id, String uuid,
					   String summary,
					   String description,
					   String location,
					   String category,
					   LocalDate dateStart,
					   LocalDate dateEnd,
					   LocalTime timeStart,
					   LocalTime timeEnd,
					   boolean allDay,
					   Recurrence recurrence) {
}
