export class Event {
    id: number;
    uuid: string;
    summary: string;
    description: string;
    location: string;
    category: string;
    dateStart: Date;
    dateEnd: Date;
    timeStart: Date;
    timeEnd: Date;
    allDay: boolean;
    recurrence: unknown;
}
