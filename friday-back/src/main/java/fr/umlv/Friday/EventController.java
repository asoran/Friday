package fr.umlv.Friday;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController()
@RequestMapping("/event")
@RequiredArgsConstructor
@SuppressWarnings({"unused", "ClassCanBeRecord"})
public class EventController {

	private final EventService eventService;

	@GetMapping("/index.html")
	public String index() {
		return "Hello World";
	}

	@PostMapping("")
	@ResponseStatus(HttpStatus.CREATED)
	public EventDto createEvent(@RequestBody EventDto eventDto) {
		return toEventDto(eventService.createEvent(toEvent(eventDto)));
	}

	@GetMapping("")
	public List<EventDto> getAllEvents() {
		return eventService.getAllEvents()
				.stream().map(EventController::toEventDto)
				.collect(Collectors.toList());
	}

	@DeleteMapping("")
	public void deleteEvent(@RequestBody EventDto eventDto) {
		eventService.deleteEvent(toEvent(eventDto));
	}

	// TDO <-> Persistence

	public static EventDto toEventDto(Event event) {
		return new EventDto(event.getId(), event.getUuid(), event.getSummary(), event.getDescription(),
				event.getLocation(), event.getCategory(), event.getDateStart(), event.getDateEnd(),
				event.getTimeStart(), event.getTimeEnd(), event.isAllDay(), event.getRecurrence());
	}

	public static Event toEvent(EventDto eventDto) {
		return new Event(eventDto.id(), eventDto.uuid(), eventDto.summary(), eventDto.description(),
				eventDto.location(), eventDto.category(), eventDto.dateStart(), eventDto.dateEnd(),
				eventDto.timeStart(), eventDto.timeEnd(), eventDto.allDay(), eventDto.recurrence());
	}
}
