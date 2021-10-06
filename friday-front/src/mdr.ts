import { Event } from "./event";
import { EventService } from "./eventService";

export const lol: string = "nyahaha";
export class Mdr {
    sasageo: string;

    constructor(a) {
        this.sasageo = a;
    }
}
export const hihi: Mdr = new Mdr('ha');

const eventService = new EventService();
eventService.getAllEvents();
const monthNames = [ "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"];

const events = new Map<String, Event[]>();

eventService.getAllEvents().then(x => x.forEach(e => {
    const d = e.dateStart.toLocaleDateString();
    if(events.has(d)) {
        events.set(d, [e, ...events.get(d)]);
    } else {
        events.set(d, [e]);
    }
}));

