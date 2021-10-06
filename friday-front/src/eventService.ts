import { Event } from "./event";

const API_URL = 'localhost:8080';
const EVENTS_URL = API_URL + '/event'

export class EventService {

    getAllEvents() {
        return fetch(EVENTS_URL).then<Event[]>(x => x.json());
    }

    newEvent(event: Event) {
        return fetch(EVENTS_URL, {
            method: 'POST', body: JSON.stringify(event)
        }).then<Event>(x => x.json());
    }

    deleteEvent(event: Event) {
        return fetch(EVENTS_URL, {
            method: 'DELETE', body: JSON.stringify(event)
        }).then<void>();
    }
}
